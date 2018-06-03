package bookBazar.models.DTO;

import bookBazar.models.PDO.UserPDO;

/**
 * @author Raunak
 *
 */

public class UsersessionResponseDTO {

	/**
	 * The message
	 * */
	String message;
	/**
	 * Unique sessionId for each session of userId
	 * */
	String sessionId;
	/**
	 * userDetails
	 * */
	UserPDO userDetails;
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}
	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	/**
	 * @return the userDetails
	 */
	public UserPDO getUserDetails() {
		return userDetails;
	}
	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(UserPDO userDetails) {
		this.userDetails = userDetails;
	}

}
