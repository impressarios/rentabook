package bookBazar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import bookBazar.Controller.LoginController;
import bookBazar.models.DTO.ProfileUpdateRequestDTO;
import bookBazar.models.DTO.ProfileUpdateResponseDTO;
import bookBazar.models.DTO.SignUpRequestDTO;
import bookBazar.models.DTO.SignUpResponseDTO;
import bookBazar.models.PDO.UserPDO;
import bookBazar.repositories.UserRepository;

@Service
public class SignUpService {
	@Autowired LoginController login;
	@Autowired
	UserRepository userRepository;
	
	public Iterable<UserPDO> findAll() {
        return userRepository.findAll();
    }
	
	public SignUpResponseDTO registerUser(SignUpRequestDTO userCredentials) throws IllegalArgumentException {
		
		UserPDO newUser = new UserPDO();
		
		newUser.setPassword(userCredentials.getPassword());
		
		if(StringUtils.isEmpty(userCredentials.getEmail())) {
			if(StringUtils.isEmpty(userRepository.findByContact(userCredentials.getPhoneNumber()))){
				newUser.setPhoneNumber(userCredentials.getPhoneNumber());
			}
			else {
				throw new IllegalArgumentException("User is already registered");
			}
		}
		else {
			if(StringUtils.isEmpty(userRepository.findByContact(userCredentials.getEmail()))){
				newUser.setEmail(userCredentials.getPhoneNumber());
			}
			else {
				throw new IllegalArgumentException("User is already registered");
			}
		}
		
		userRepository.save(newUser);
		
		SignUpResponseDTO signupResponse = new SignUpResponseDTO();
		
		signupResponse.setId(newUser.getId());
		signupResponse.setMessage("User Registered Successfully");
		
		return signupResponse;
	}
	
	public UserPDO findUserById(String id) {
		return userRepository.findById(id);
	}
	
	public UserPDO findUserByContact(String contact) {
		return userRepository.findByContact(contact);
	}
	
	public ProfileUpdateResponseDTO getUpdatedUser(String id, ProfileUpdateRequestDTO userDetails)throws IllegalArgumentException {
		
		UserPDO updatedUser = userRepository.findById(id);
		
		if(!StringUtils.isEmpty(userDetails.getEmail())) {
			if(StringUtils.isEmpty(updatedUser.getEmail()) || !updatedUser.getEmail().equalsIgnoreCase(userDetails.getEmail())) {
				if(StringUtils.isEmpty(userRepository.findByEmail(userDetails.getEmail()))) {
					updatedUser.setEmail(userDetails.getEmail());
				}
				else {
					throw new IllegalArgumentException("User is already registered");
				}
			}
		}
		if(!StringUtils.isEmpty(userDetails.getPhoneNumber())) {
			if(StringUtils.isEmpty(updatedUser.getPhoneNumber()) || !updatedUser.getPhoneNumber().equalsIgnoreCase(userDetails.getPhoneNumber())) {
				if(StringUtils.isEmpty(userRepository.findByContact(userDetails.getPhoneNumber()))) {
					updatedUser.setPhoneNumber(userDetails.getPhoneNumber());
				}
				else {
					throw new IllegalArgumentException("User is already registered");
				}
			}
		}
		if(!StringUtils.isEmpty(userDetails.getUsername())) {
			if(StringUtils.isEmpty(updatedUser.getUsername()) || !updatedUser.getUsername().equalsIgnoreCase(userDetails.getUsername())) {
				if(StringUtils.isEmpty(userRepository.findByUsername(userDetails.getUsername()))) {
					updatedUser.setUsername(userDetails.getUsername());
				}
				else {
					throw new IllegalArgumentException("User is already registered");
				}
			}
		}
		if(!StringUtils.isEmpty(userDetails.getName())) {
			if(StringUtils.isEmpty(updatedUser.getName()) || !updatedUser.getName().equalsIgnoreCase(userDetails.getName())) {
				updatedUser.setName(userDetails.getName());
			}
		}
		if(!StringUtils.isEmpty(userDetails.getPicture())) {
			if(StringUtils.isEmpty(updatedUser.getPicture()) || !updatedUser.getPicture().equalsIgnoreCase(userDetails.getPicture())) {
				updatedUser.setPicture(userDetails.getPicture());
			}
		}
		if(!StringUtils.isEmpty(userDetails.getUsertype())) {
			if(StringUtils.isEmpty(updatedUser.getUsertype()) || !updatedUser.getUsertype().equalsIgnoreCase(userDetails.getUsertype())) {
				updatedUser.setUsertype(updatedUser.getUsertype());
			}
		}
		
		userRepository.save(updatedUser);
		
		ProfileUpdateResponseDTO profileUpdateResponse = new ProfileUpdateResponseDTO();
		
		profileUpdateResponse.setEmail(updatedUser.getEmail());
		profileUpdateResponse.setName(updatedUser.getName());
		profileUpdateResponse.setPhoneNumber(updatedUser.getPhoneNumber());
		profileUpdateResponse.setPicture(updatedUser.getPicture());
		profileUpdateResponse.setUsername(updatedUser.getUsername());
		profileUpdateResponse.setUsertype(updatedUser.getUsertype());
		profileUpdateResponse.setMessage("Profile updated successfully");
		
		return profileUpdateResponse;
	}
	
	public void deleteUser(String id) {
		
		UserPDO user = userRepository.findById(id);
		userRepository.delete(user);
		
	}
}
