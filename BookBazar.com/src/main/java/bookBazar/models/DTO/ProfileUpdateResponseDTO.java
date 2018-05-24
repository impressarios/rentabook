package bookBazar.models.DTO;

/**
 * The Class ProfileUpdateResponseDTO.
 */
public class ProfileUpdateResponseDTO extends ProfileUpdateRequestDTO {
	
	/** The message. */
	String message;

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
