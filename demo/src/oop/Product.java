package oop;

public class Product {
	private String name;
	private int price;
	private static int taxrate = 12;
	
	public static int getTaxRate() {
		return  taxrate;
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getSellingPrice() {
		return this.price + this.price * Product.taxrate / 100; 
	}

}
