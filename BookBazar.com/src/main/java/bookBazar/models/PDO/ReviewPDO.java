package bookBazar.models.PDO;

import java.util.Date;

/**
 * @author Raunak
 * @author Ankita
 *
 */
public class ReviewPDO {
	
	/** The target id. Target can be anything such as user, book, fanart etc. */
	String targetId;
	
	/** The target name. */
	String targetName;
	
	/** The target. Specifies target type - user, book, fanart etc*/
	String target;
	
	/** The user id. */
	String userId;
	
	/** The user name. */
	String userName;
	
	/** The comment. */
	Comment comment;
	
	/** The rating. */
	Rating rating;
	
	/** The likes. */
	Reaction likes;
	
	/** The dislikes. */
	Reaction dislikes;
	
	/**
	 * Gets the target id.
	 *
	 * @return the target id
	 */
	public String getTargetId() {
		return targetId;
	}
	
	/**
	 * Sets the target id.
	 *
	 * @param targetId the new target id
	 */
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	
	/**
	 * Gets the target name.
	 *
	 * @return the target name
	 */
	public String getTargetName() {
		return targetName;
	}
	
	/**
	 * Sets the target name.
	 *
	 * @param targetName the new target name
	 */
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	
	/**
	 * Gets the target.
	 *
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}
	
	/**
	 * Sets the target.
	 *
	 * @param target the new target
	 */
	public void setTarget(String target) {
		this.target = target;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * Gets the user name.
	 *
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Sets the user name.
	 *
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public Comment getComment() {
		return comment;
	}
	
	/**
	 * Sets the comment.
	 *
	 * @param comment the comment to set
	 */
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	/**
	 * Gets the rating.
	 *
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}
	
	/**
	 * Sets the rating.
	 *
	 * @param rating the rating to set
	 */
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	/**
	 * Gets the likes.
	 *
	 * @return the likes
	 */
	public Reaction getLikes() {
		return likes;
	}
	
	/**
	 * Sets the likes.
	 *
	 * @param likes the likes to set
	 */
	public void setLikes(Reaction likes) {
		this.likes = likes;
	}
	
	/**
	 * Gets the dislikes.
	 *
	 * @return the dislikes
	 */
	public Reaction getDislikes() {
		return dislikes;
	}
	
	/**
	 * Sets the dislikes.
	 *
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