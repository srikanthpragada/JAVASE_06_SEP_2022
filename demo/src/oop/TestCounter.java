package oop;

public class TestCounter {

	public static void main(String[] args) {
		Counter c; // Object reference
		
		c = new Counter();  // Object or instance 
		c.increment();
		c.increment();
		c.decrement();
		System.out.println(c.getValue());

	}
}
