package bookBazar.models.PDO;

import org.springframework.data.annotation.Id;

import bookBazar.models.other.Price;

/**
 * @author Ankita
 *
 */
public class SellingDetailsPDO {

	/** The id. */
	@Id
	String id;
	
	/** The seller id. */
	String sellerId;
	
	/** The book id. */
	String bookId;
	
	/** The selling price. */
	Price sellingPrice;
	
	/** The available quantity. */
	int availableQuantity;
	
	/** The total quantity. */
	int totalQuantity;
	
	/** The condition. */
	String condition;
	
	/** The format. */
	String format;
	

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
	 * Gets the selling price.
	 *
	 * @return the selling price
	 */
	public Price getSellingPrice() {
		return sellingPrice;
	}

	/**
	 * Sets the selling price.
	 *
	 * @param sellingPrice the new selling price
	 */
	public void setSellingPrice(Price sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	/**
	 * Gets the available quantity.
	 *
	 * @return the available quantity
	 */
	public int getAvailableQuantity() {
		return availableQuantity;
	}

	/**
	 * Sets the available quantity.
	 *
	 * @param availableQuantity the new available quantity
	 */
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	/**
	 * Gets the total quantity.
	 *
	 * @return the total quantity
	 */
	public int getTotalQuantity() {
		return totalQuantity;
	}

	/**
	 * Sets the total quantity.
	 *
	 * @param totalQuantity the new total quantity
	 */
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	/**
	 * Gets the condition.
	 *
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * Sets the condition.
	 *
	 * @param condition the new condition
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * Gets the format.
	 *
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * Sets the format.
	 *
	 * @param format the new format
	 */
	public void setFormat(String format) {
		this.format = format;
	}
}
