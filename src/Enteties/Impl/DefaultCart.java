package Enteties.Impl;

import java.util.Arrays;

import Enteties.Cart;
import Enteties.Product;

public class DefaultCart implements Cart {

	private static final int DEFAULT_PRODUCT_CAPACITY = 10; //Only keeps a number of products
	private Product[] products; //Stores different types of products
	private int lastIndex;
	
	{
		products = new Product[DEFAULT_PRODUCT_CAPACITY];
	}
	
	@Override
	public boolean isEmpty() {
		if (products == null || products.length == 0) {
			return true;
		}
		
		for (Product product : products) {
			if (product != null) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void addProduct(Product product) {
		if (product == null) {
			return;
		}
		if (products.length <= lastIndex) {
			products = Arrays.copyOf(products, products.length << 1);
			//Arrays.copyOf(products, products.length << 1):- 
			//Creates a new array with double the old capacity, 
			//and copies all existing products with it.
			
			//-products.length << 1:- This is a bitwise left shift, 
			//equivalent to multiplying by 2. So the array capacity doubles
			
		}
		products[lastIndex++] = product;
	}
	
	
	//Purpose- Return a new array of Product object, Containing only the non-null products
	//From existing array called products.
	//Original products array may contain null elements. this method filters them out.
	@Override
	public Product[] getProducts() {
		
		//nonnullProductsAmount holds the count of all non-null Product objects in array
		int nonNullProductsAmount = 0; //Initializes a counter to zero
		for (Product product : products ) { //Iterates through the products array
			if (product != null) { 
				nonNullProductsAmount++; //Every element that is not null, increase the counter
			}
		}
		
		
		//Creates a new array nonNullProducts- with length equal to the number of non-null products found.
		Product[] nonNullProducts = new Product[nonNullProductsAmount];
		int index = 0;
		for (Product product : products) {
			if (product != null) {
				nonNullProducts[index++] = product;
			}
		}
		return nonNullProducts;
	}
	
	@Override
	public void clear() {
		products = new Product[DEFAULT_PRODUCT_CAPACITY];
	}
	
	
	
	
	
	
	
	
	
	
}
