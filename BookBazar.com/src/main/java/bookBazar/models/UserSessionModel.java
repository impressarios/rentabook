package bookBazar.models;

import bookBazar.models.PDO.UserPDO;

public class UserSessionModel {
	private String id;
	private String sessionId;
	private UserPDO userDetail;
public String getUserId() {
	return id;
}
public void setUserId(String id) {
	this.id = id;
}
public String getSessionId() {
	return sessionId;
}
public void setSessionId(String sessionId) {
	this.sessionId = sessionId;
}
public UserPDO getUserDetail() {
	return userDetail;
}
public void setUserDetail(UserPDO userDetail) {
	this.userDetail = userDetail;
}
}
