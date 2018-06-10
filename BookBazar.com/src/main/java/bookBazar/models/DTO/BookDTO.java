package bookBazar.models.DTO;

import bookBazar.models.other.Description;
import bookBazar.models.other.Price;

public class BookDTO {
	String bookId;
	String ISBN;
    String bookName;
    String author;
    String bookCategory;
    String bookImage;
    String language;
    String publisher;
    String publicationDate;
    String copyrightYear;
    String copyright;
    String format;
    Description description;
    int totalQuatity;
    int availableQuatity;
    Price price;
    Price rentPrice;
	/**
	 * @return the bookId
	 */
	public String getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		return ISBN;
	}
	/**
	 * @param iSBN the iSBN to set
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the bookCategory
	 */
	public String getBookCategory() {
		return bookCategory;
	}
	/**
	 * @param bookCategory the bookCategory to set
	 */
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	/**
	 * @return the bookImage
	 */
	public String getBookImage() {
		return bookImage;
	}
	/**
	 * @param bookImage the bookImage to set
	 */
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * @return the publicationDate
	 */
	public String getPublicationDate() {
		return publicationDate;
	}
	/**
	 * @param publicationDate the publicationDate to set
	 */
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	/**
	 * @return the copyrightYear
	 */
	public String getCopyrightYear() {
		return copyrightYear;
	}
	/**
	 * @param copyrightYear the copyrightYear to set
	 */
	public void setCopyrightYear(String copyrightYear) {
		this.copyrightYear = copyrightYear;
	}
	/**
	 * @return the copyright
	 */
	public String getCopyright() {
		return copyright;
	}
	/**
	 * @param copyright the copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}
	/**
	 * @return the description
	 */
	public Description getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(Description description) {
		this.description = description;
	}
	/**
	 * @return the totalQuatity
	 */
	public int getTotalQuatity() {
		return totalQuatity;
	}
	/**
	 * @param totalQuatity the totalQuatity to set
	 */
	public void setTotalQuatity(int totalQuatity) {
		this.totalQuatity = totalQuatity;
	}
	/**
	 * @return the availableQuatity
	 */
	public int getAvailableQuatity() {
		return availableQuatity;
	}
	/**
	 * @param availableQuatity the availableQuatity to set
	 */
	public void setAvailableQuatity(int availableQuatity) {
		this.availableQuatity = availableQuatity;
	}
	/**
	 * @return the price
	 */
	public Price getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Price price) {
		this.price = price;
	}

	/**
	 * @return the rentPrice
	 */
	public Price getRentPrice() {
		return rentPrice;
	}
	/**
	 * @param rentPrice the rentPrice to set
	 */
	public void setRentPrice(Price rentPrice) {
		this.rentPrice = rentPrice;
	}
}
