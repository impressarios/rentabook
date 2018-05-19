package bookBazar.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookBazar.Controller.LoginController;
import bookBazar.models.LoginModel;
import bookBazar.models.UserSessionModel;
import bookBazar.repositories.UserSessionRepository;

@Service
public class UserAuthenticationService {
	@Autowired LoginController login;
	@Autowired UserSessionRepository sessionRepository;

	public UserSessionModel verifyUser(LoginModel user)throws IllegalArgumentException
	{
		UserSessionModel session=null;
		
		LoginModel exuser= login.showUser(user.getUsername());
		if(exuser!=null)
		{
			if(exuser.getPassword().equals(user.getPassword()))
			{
				session =new UserSessionModel();
				session.setSessionId(generateSessionId());
				session.setUserDetail(exuser);
				if(session.getSessionId()!=null)
				{
					sessionRepository.save(session);			
				}
				else
				{
					throw new IllegalArgumentException("Unable to Generate SessionId");
				}
			}
			else
			{
				throw new IllegalArgumentException("Wrong Password");
			}
		}
		else
		{
			throw new IllegalArgumentException("User Not Exsist");
		}
		return session;
	}
	
	private String generateSessionId()
	{
		UUID uniqueKey = UUID.randomUUID(); 
		SecureRandom random = new SecureRandom();
		int LENGTH = 32;
		BigInteger bigInteger = new BigInteger(130, random);
		String sessionId = String.valueOf(bigInteger.toString(LENGTH));
		return sessionId.toUpperCase()+uniqueKey.toString();
		
	}
	
}
