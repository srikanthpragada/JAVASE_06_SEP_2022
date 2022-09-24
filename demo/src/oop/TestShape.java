package oop;

abstract class Shape {
	private int x, y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public abstract double area();
		 
}

class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	public void print() {
		super.print();
		System.out.println(this.radius);
	}
	
	public double area() {
		return  Math.PI * this.radius * this.radius;
	}
}

class Square extends Shape {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}
	public void print() {
		super.print();
		System.out.println(this.side);
	}
	
	public double area() {
		return   this.side * this.side;
	}
}

public class TestShape {

	public static void main(String[] args) {
		Circle c = new Circle(10, 20, 5);
		Shape s = c;  // upcasting 
		
		s.print();  // Runtime Polymorphism 
		System.out.println(s.area()); // Runtime Polymorphism
		
		s = new Square(10,20,10);
		s.print();  // Runtime Polymorphism 
		System.out.println(s.area());
		
		
	}

}
