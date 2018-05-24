package bookBazar.models.PDO;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import bookBazar.models.userModels.*;

/**
 * The Class UserPDO.
 */
@Document(collection = "Users")
public class UserPDO {
	
	/** The id. */
	@Id
	String id;
	
	/** The name. */
	String name;
	
	/** The username. */
	String username;
	
	/** The usertype. */
	String usertype;
	
	/** The email. */
	String email;
	
	/** The password. */
	String password;
	
	/** The phone number. */
	String phoneNumber;
	
	/** The picture. */
	String picture;
	
	/** The trust points. */
	int trustPoints;
	
	/** The activities. */
	List<Activity> activities;
	
	/** The connections. */
	List<Connection> connections;
	
	/** The genres. */
	List<String> genres;
	
	/** The transactions. */
	List<TransactionsPDO> transactions;
	
	/** The concerns. */
	List<ConcernPDO> concerns;
	
	/** The chat rooms. */
	List<ChatRoomPDO> chatRooms;
	
	/** The earnings. */
	List<Earning> earnings; 
	
	/** The Reviews. */
	List<Review> Reviews;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
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
	
	/**
	 * Gets the usertype.
	 *
	 * @return the usertype
	 */
	public String getUsertype() {
		return usertype;
	}
	
	/**
	 * Sets the usertype.
	 *
	 * @param usertype the new usertype
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
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
	
	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * Sets the phone number.
	 *
	 * @param phoneNumber the new phone number
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Gets the picture.
	 *
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}
	
	/**
	 * Sets the picture.
	 *
	 * @param picture the new picture
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * Gets the trust points.
	 *
	 * @return the trust points
	 */
	public int getTrustPoints() {
		return trustPoints;
	}
	
	/**
	 * Sets the trust points.
	 *
	 * @param trustPoints the new trust points
	 */
	public void setTrustPoints(int trustPoints) {
		this.trustPoints = trustPoints;
	}
	
	/**
	 * Gets the activities.
	 *
	 * @return the activities
	 */
	public List<Activity> getActivities() {
		return activities;
	}
	
	/**
	 * Sets the activities.
	 *
	 * @param activities the new activities
	 */
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	/**
	 * Gets the connections.
	 *
	 * @return the connections
	 */
	public List<Connection> getConnections() {
		return connections;
	}
	
	/**
	 * Sets the connections.
	 *
	 * @param connections the new connections
	 */
	public void setConnections(List<Connection> connections) {
		this.connections = connections;
	}
	
	/**
	 * Gets the genres.
	 *
	 * @return the genres
	 */
	public List<String> getGenres() {
		return genres;
	}
	
	/**
	 * Sets the genres.
	 *
	 * @param genres the new genres
	 */
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	
	/**
	 * Gets the transactions.
	 *
	 * @return the transactions
	 */
	public List<TransactionsPDO> getTransactions() {
		return transactions;
	}
	
	/**
	 * Sets the transactions.
	 *
	 * @param transactions the new transactions
	 */
	public void setTransactions(List<TransactionsPDO> transactions) {
		this.transactions = transactions;
	}
	
	/**
	 * Gets the concerns.
	 *
	 * @return the concerns
	 */
	public List<ConcernPDO> getConcerns() {
		return concerns;
	}
	
	/**
	 * Sets the concerns.
	 *
	 * @param concerns the new concerns
	 */
	public void setConcerns(List<ConcernPDO> concerns) {
		this.concerns = concerns;
	}
	
	/**
	 * Gets the chat rooms.
	 *
	 * @return the chat rooms
	 */
	public List<ChatRoomPDO> getChatRooms() {
		return chatRooms;
	}
	
	/**
	 * Sets the chat rooms.
	 *
	 * @param chatRooms the new chat rooms
	 */
	public void setChatRooms(List<ChatRoomPDO> chatRooms) {
		this.chatRooms = chatRooms;
	}
	
	/**
	 * Gets the earnings.
	 *
	 * @return the earnings
	 */
	public List<Earning> getEarnings() {
		return earnings;
	}
	
	/**
	 * Sets the earnings.
	 *
	 * @param earnings the new earnings
	 */
	public void setEarnings(List<Earning> earnings) {
		this.earnings = earnings;
	}
	
	/**
	 * Gets the reviews.
	 *
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return Reviews;
	}
	
	/**
	 * Sets the reviews.
	 *
	 * @param reviews the new reviews
	 */
	public void setReviews(List<Review> reviews) {
		Reviews = reviews;
	}
}
