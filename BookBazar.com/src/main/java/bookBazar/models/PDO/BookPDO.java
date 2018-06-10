package bookBazar.models.PDO;

public class BookPDO {
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
    Price Price;
    Price discount;
    Price discountPrice;
    Price rentPrice;
    ReviewPDO review;
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
		return Price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Price price) {
		Price = price;
	}
	/**
	 * @return the discount
	 */
	public Price getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(Price discount) {
		this.discount = discount;
	}
	/**
	 * @return the discountPrice
	 */
	public Price getDiscountPrice() {
		return discountPrice;
	}
	/**
	 * @param discountPrice the discountPrice to set
	 */
	public void setDiscountPrice(Price discountPrice) {
		this.discountPrice = discountPrice;
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
	/**
	 * @return the review
	 */
	public ReviewPDO getReview() {
		return review;
	}
	/**
	 * @param review the review to set
	 */
	public void setReview(ReviewPDO review) {
		this.review = review;
	}

}
class Price{
	long amount;
	String currency;
	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}

class Description{
	String aboutBook;
	String aboutAuthor;
	String aboutPublisher;
	/**
	 * @return the aboutBook
	 */
	public String getAboutBook() {
		return aboutBook;
	}
	/**
	 * @param aboutBook the aboutBook to set
	 */
	public void setAboutBook(String aboutBook) {
		this.aboutBook = aboutBook;
	}
	/**
	 * @return the aboutAuthor
	 */
	public String getAboutAuthor() {
		return aboutAuthor;
	}
	/**
	 * @param aboutAuthor the aboutAuthor to set
	 */
	public void setAboutAuthor(String aboutAuthor) {
		this.aboutAuthor = aboutAuthor;
	}
	/**
	 * @return the aboutPublisher
	 */
	public String getAboutPublisher() {
		return aboutPublisher;
	}
	/**
	 * @param aboutPublisher the aboutPublisher to set
	 */
	public void setAboutPublisher(String aboutPublisher) {
		this.aboutPublisher = aboutPublisher;
	}
}
