package bookBazar.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.util.ObjectUtils;

import bookBazar.models.DTO.LoginRequestDTO;
import bookBazar.models.DTO.UsersessionResponseDTO;
import bookBazar.models.PDO.UserPDO;
import bookBazar.models.PDO.UserSessionPDO;
import bookBazar.repositories.UserRepository;
import bookBazar.repositories.UserSessionRepository;

/**
 * @author Raunak
 *
 */

@Service
public class UserAuthenticationService {
	@Autowired UserRepository userRepository;
	@Autowired UserSessionRepository sessionRepository;

	public UsersessionResponseDTO verifyUser(LoginRequestDTO user)throws IllegalArgumentException
	{
		UsersessionResponseDTO session=null;
		UserPDO exuser=null;
		if(!StringUtils.isEmpty(user.getEmail())){
				exuser= userRepository.findByEmail(user.getEmail());
		}else if(!StringUtils.isEmpty(user.getPhoneNumber())){
				exuser= userRepository.findByPhoneNumber(user.getPhoneNumber());
			}else if(!StringUtils.isEmpty(user.getUsername())){
				exuser= userRepository.findByUsername(user.getUsername());
			}
		
		if(!ObjectUtils.isEmpty(exuser))
		{
			if(exuser.getPassword().equals(user.getPassword())){
				UserSessionPDO userSession =new UserSessionPDO();
				userSession.setSessionId(generateSessionId());
				userSession.setUserId(exuser.getId());
				if(!StringUtils.isEmpty(userSession.getSessionId())){
					sessionRepository.saveUserSession(userSession);
					session=new UsersessionResponseDTO();
					session.setMessage("Session Created Successfully!!!");
					session.setSessionId(userSession.getSessionId());
					session.setUserDetails(exuser);
				}else{
					throw new IllegalArgumentException("Unable to Generate SessionId");
				}
			}else{
				throw new IllegalArgumentException("Wrong Password");
			}
		}else{
			throw new IllegalArgumentException("User Not Exsist");
		}
		return session;
	}
	
	private String generateSessionId(){
		UUID uniqueKey = UUID.randomUUID(); 
		SecureRandom random = new SecureRandom();
		int LENGTH = 32;
		BigInteger bigInteger = new BigInteger(130, random);
		String sessionId = String.valueOf(bigInteger.toString(LENGTH));
		return sessionId.toUpperCase()+uniqueKey.toString();
	}
	
	public void destroyUserSession(String userId) {
		sessionRepository.distroyUserSession(userId);
	}


	public boolean matchUserSession(String userId, String sessionId) {
		UserSessionPDO exUserSession =sessionRepository.getUserSession(userId);
		if(exUserSession.getUserId().equals(userId) && exUserSession.getSessionId().equals(sessionId) ){
			return true;
		}
		return false;
	}
	
}
