package bookBazar.models;

public class UserSessionModel {
private String sessionId;
private LoginModel userDetail;

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
