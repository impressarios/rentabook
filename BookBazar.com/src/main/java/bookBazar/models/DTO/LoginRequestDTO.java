package bookBazar.models.DTO;

/**
 * The Class LoginRequestDTO.
 */
public class LoginRequestDTO extends SignUpRequestDTO {
	
	/** The username. */
	String username;
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
}
