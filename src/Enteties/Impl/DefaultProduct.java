package Enteties.Impl;

import Enteties.Product;

public class DefaultProduct implements Product {
	
	private int id;
	private String productName;
	private String categoryName;
	private double price;
	
	public DefaultProduct() {
		
	}
	
	public DefaultProduct(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}
	
	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}
	
	@Override
	public String toString() {
		return "Product id=" + id + ", product name=" + productName +
				", category name=" + categoryName + ", price=" + price;
	}
}
