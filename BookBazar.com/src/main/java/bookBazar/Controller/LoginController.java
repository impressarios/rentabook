package bookBazar.Controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bookBazar.Service.SignUpService;
import bookBazar.Service.UserAuthenticationService;
import bookBazar.models.DTO.LoginRequestDTO;
import bookBazar.models.DTO.ProfileUpdateRequestDTO;
import bookBazar.models.DTO.ProfileUpdateResponseDTO;
import bookBazar.models.DTO.SignUpRequestDTO;
import bookBazar.models.DTO.SignUpResponseDTO;
import bookBazar.models.DTO.UsersessionResponseDTO;
import bookBazar.models.PDO.UserPDO;
import bookBazar.models.PDO.UserSessionPDO;

@RestController
public class LoginController {
	
	@Autowired 
	UserAuthenticationService userauth;
	@Autowired 
	SignUpService signup;
	
    @RequestMapping(method=RequestMethod.GET, value="findAll/users")
    public Iterable<UserPDO> getAllUsers() {
        return signup.findAll();
    }
    
    @RequestMapping(method=RequestMethod.POST, value = "/register/user")
    public SignUpResponseDTO save(@RequestBody SignUpRequestDTO userCredentials)throws IllegalArgumentException {
    	if(!StringUtils.isEmpty(userCredentials.getPassword()) && (!StringUtils.isEmpty(userCredentials.getEmail()) || !StringUtils.isEmpty(userCredentials.getPhoneNumber()))){
    		return signup.registerUser(userCredentials);
    	}
    	else
    		throw new IllegalArgumentException("Required fields are empty or null");
    }

    @RequestMapping(method=RequestMethod.GET, value="findById/user/{id}")
    public UserPDO show(@PathVariable String id) {
        return signup.findUserById(id);
    }
    
    @RequestMapping(method=RequestMethod.GET, value="/findByContact/user/{contact}")
    public UserPDO showUser(@PathVariable String contact) {
        return signup.findUserByContact(contact);
    }

    @RequestMapping(method=RequestMethod.PUT, value="update/user/{id}")
    public ProfileUpdateResponseDTO update(@PathVariable String id, @RequestBody ProfileUpdateRequestDTO userDetails) {
        return signup.getUpdatedUser(id, userDetails);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="delete/user/{id}")
    public String delete(@PathVariable String id) {
    	
        signup.deleteUser(id);
        return "user deleted";
    }
    
    /**
	 * generate Usersession during login
	 *
	 */
	@RequestMapping(method=RequestMethod.POST,value="/userauth",consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UsersessionResponseDTO getSessionIdAndUserId(@NotNull LoginRequestDTO user)throws IllegalArgumentException{
		UsersessionResponseDTO session=null;
			if((!StringUtils.isEmpty(user.getEmail())||!StringUtils.isEmpty(user.getPhoneNumber())||!StringUtils.isEmpty(user.getUsername())) && !StringUtils.isEmpty(user.getPassword())){
				session=userauth.verifyUser(user);
			}
			else{
				throw new IllegalArgumentException("Invalid Credentials");
			}
	    return session;
	}
	/**
	 * destroy Usersession during logout
	 *
	 */
	@RequestMapping(method=RequestMethod.DELETE,value="/dstrysess/{userId}")
	public void deleteUserSession(@PathVariable("userId")String userId)throws IllegalArgumentException{
			if((!StringUtils.isEmpty(userId))){
					userauth.destroyUserSession(userId);
			}
			else{
				throw new IllegalArgumentException("Not Valid UserId");
			}
	}
	
	/**
	 * verify Usersession
	 *
	 */
	@RequestMapping(method=RequestMethod.POST,value="/matchsess")
	public boolean matchUserSession(@RequestHeader("UserId")String userId,@RequestHeader("SessionId")String sessionId)throws IllegalArgumentException{
		boolean usersessionFlag=false;
		if((!StringUtils.isEmpty(userId)) && (!StringUtils.isEmpty(sessionId))){
			usersessionFlag=userauth.matchUserSession(userId,sessionId);
	}else{
			throw new IllegalArgumentException("Not Valid UserId");
		}
		return usersessionFlag;
	}
}
