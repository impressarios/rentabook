package bookBazar.repositories;

import bookBazar.models.PDO.UserSessionPDO;

/**
 * @author Raunak
 *
 */
public interface UserSessionRepository {

	public void saveUserSession(UserSessionPDO userSession);
	public UserSessionPDO  getUserSession(String userId);
	public void distroyUserSession(String userId);
	
}
