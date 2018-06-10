package bookBazar.models.PDO;

import java.util.Date;

public class ReviewPDO {
	String userId;
	String userName;
	Comment comment;
	Rating rating;
	Reaction likes;
	Reaction dislikes;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the comment
	 */
	public Comment getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	/**
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	/**
	 * @return the likes
	 */
	public Reaction getLikes() {
		return likes;
	}
	/**
	 * @param likes the likes to set
	 */
	public void setLikes(Reaction likes) {
		this.likes = likes;
	}
	/**
	 * @return the dislikes
	 */
	public Reaction getDislikes() {
		return dislikes;
	}
	/**
	 * @param dislikes the dislikes to set
	 */
	public void setDislikes(Reaction dislikes) {
		this.dislikes = dislikes;
	}
}
class Comment{
	String comment;
	Date date;
	Reply reply;
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the reply
	 */
	public Reply getReply() {
		return reply;
	}
	/**
	 * @param reply the reply to set
	 */
	public void setReply(Reply reply) {
		this.reply = reply;
	}

}
class Rating{
	double rating;
	Date date;
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
class Reply
{
	String reply;
	Date date;
	/**
	 * @return the reply
	 */
	public String getReply() {
		return reply;
	}
	/**
	 * @param reply the reply to set
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
}
class Reaction{
	long action;

	/**
	 * @return the action
	 */
	public long getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(long action) {
		this.action = action;
	}
	
}