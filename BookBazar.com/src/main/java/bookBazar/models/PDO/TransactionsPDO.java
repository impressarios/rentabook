package bookBazar.models.PDO;

import java.util.Date;

import org.springframework.data.annotation.Id;

/**
 * @author Ankita
 *
 */
public class TransactionsPDO {

	/** The id. */
	@Id
	String id;
	
	/** The book id. */
	String bookId;
	
	/** The seller id. */
	String sellerId;
	
	/** The buyer id. */
	String buyerId;
	
	/** The transaction date. */
	Date transactionDate;
	
	/** The transaction type. */
	String transactionType;
	
	/** The rented from. */
	Date rentedFrom;
	
	/** The rented to. */
	Date rentedTo;
	

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
	 * Gets the book id.
	 *
	 * @return the book id
	 */
	public String getBookId() {
		return bookId;
	}

	/**
	 * Sets the book id.
	 *
	 * @param bookId the new book id
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	/**
	 * Gets the seller id.
	 *
	 * @return the seller id
	 */
	public String getSellerId() {
		return sellerId;
	}

	/**
	 * Sets the seller id.
	 *
	 * @param sellerId the new seller id
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * Gets the buyer id.
	 *
	 * @return the buyer id
	 */
	public String getBuyerId() {
		return buyerId;
	}

	/**
	 * Sets the buyer id.
	 *
	 * @param buyerId the new buyer id
	 */
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	/**
	 * Gets the transaction date.
	 *
	 * @return the transaction date
	 */
	public Date getTransactionDate() {
		return transactionDate;
	}

	/**
	 * Sets the transaction date.
	 *
	 * @param transactionDate the new transaction date
	 */
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * Gets the transaction type.
	 *
	 * @return the transaction type
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the transaction type.
	 *
	 * @param transactionType the new transaction type
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * Gets the rented from.
	 *
	 * @return the rented from
	 */
	public Date getRentedFrom() {
		return rentedFrom;
	}

	/**
	 * Sets the rented from.
	 *
	 * @param rentedFrom the new rented from
	 */
	public void setRentedFrom(Date rentedFrom) {
		this.rentedFrom = rentedFrom;
	}

	/**
	 * Gets the rented to.
	 *
	 * @return the rented to
	 */
	public Date getRentedTo() {
		return rentedTo;
	}

	/**
	 * Sets the rented to.
	 *
	 * @param rentedTo the new rented to
	 */
	public void setRentedTo(Date rentedTo) {
		this.rentedTo = rentedTo;
	}	
}
