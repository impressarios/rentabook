package bookBazar.models.DTO;

import java.util.List;

import bookBazar.models.userModels.Connection;
import bookBazar.models.userModels.Earning;

/**
 * The Class LoginResponseDTO.
 */
public class LoginResponseDTO extends ProfileUpdateResponseDTO {
	
	/** The discouraged points. */
	int discouraged;
	
	/** The encouraged points. */
	int encouraged;
	
	/** The connections. */
	List<Connection> connections;
	
	/** The genres. */
	List<String> genres;
	
	/** The earnings. */
	List<Earning> earnings;

	/**
	 * Gets the discouraged.
	 *
	 * @return the discouraged
	 */
	public int getDiscouraged() {
		return discouraged;
	}

	/**
	 * Sets the discouraged.
	 *
	 * @param discouraged the new discouraged
	 */
	public void setDiscouraged(int discouraged) {
		this.discouraged = discouraged;
	}

	/**
	 * Gets the encouraged.
	 *
	 * @return the encouraged
	 */
	public int getEncouraged() {
		return encouraged;
	}

	/**
	 * Sets the encouraged.
	 *
	 * @param encouraged the new encouraged
	 */
	public void setEncouraged(int encouraged) {
		this.encouraged = encouraged;
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
	
}
