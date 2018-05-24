package bookBazar.models.DTO;

/**
 * The Class SignUpRequestDTO.
 */
public class SignUpRequestDTO extends User_BasicDTO {
	
	/** The password. */
	String password;
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
