package oop;

public class TestProduct {

	public static void main(String[] args) {
		 Product p1 = new Product("Product1", 1000);
		 Product p2 = new Product("Product2 ", 20000);
		 
		 System.out.println(p1.getSellingPrice());
		 System.out.println(Product.getTaxRate());
		 
	}

}
