package bookBazar.models.DTO;

import java.util.List;

/**
 * The Class ProfileUpdateRequestDTO.
 */
public class ProfileUpdateRequestDTO extends User_BasicDTO{
	
	/** The name. */
	String name;
	
	/** The username. */
	String username;
	
	/** The usertype. */
	String usertype;
	
	/** The picture. */
	String picture;
	
	/** The genres. */
	List<String> genres;

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

}
