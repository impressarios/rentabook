package bookBazar.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "AccountInfo")
public class LoginModel {
	
	@Id
	String id;
	String username;
	String usertype;
	String email;
	String password;
	long phoneNumber;
	String message;
	
	public LoginModel() {
		
	}
	
	public LoginModel(String username, String usertype, long phoneNumber, String email, String password) {
		
		this.username = username;
		this.usertype = usertype;	
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	public String getUsertype() {
		return this.usertype;
	}
	
	public void setPhoneNumber(long number) {
		this.phoneNumber = number;
	}
	
	public long getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}

