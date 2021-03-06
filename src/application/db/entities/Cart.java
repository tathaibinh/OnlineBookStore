package application.db.entities;

public class Cart {
	private int id;
	private int customerId;
	private int ISBN;
	private int quantity;
	private double sellingPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cart [id=");
		builder.append(id);
		builder.append(", customerId=");
		builder.append(customerId);
		builder.append(", ISBN=");
		builder.append(ISBN);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", sellingPrice=");
		builder.append(sellingPrice);
		builder.append("]");
		return builder.toString();
	}

}
