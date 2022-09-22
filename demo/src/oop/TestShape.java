package oop;

class Shape {
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
		c.print();
		System.out.println(c.area());
		
		Shape s = c;  // upcasting 
		// s = new Square(10,20,20);  // upcasting 
		
		Square sq;
		
		if(s instanceof Square)
		    sq = (Square) s;  // Downcasting 
		
		
	}

}
