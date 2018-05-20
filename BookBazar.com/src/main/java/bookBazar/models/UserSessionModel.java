package bookBazar.models;

public class UserSessionModel {
	private String id;
	private String sessionId;
	private LoginModel userDetail;
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
public LoginModel getUserDetail() {
	return userDetail;
}
public void setUserDetail(LoginModel userDetail) {
	this.userDetail = userDetail;
}
}
