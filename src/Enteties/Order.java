package Enteties;

public interface Order {

	boolean isCreditCardNumberValid(String userInput);
	void setCreditCardNumber(String creditCardNumber);
	void setProducts(Product[] products);
	void setCustomerId(int customerId);
	int getCustomerId();
}
