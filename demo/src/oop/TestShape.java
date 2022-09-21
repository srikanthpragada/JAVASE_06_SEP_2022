package oop;

class Shape {
	
}
class Circle extends Shape {
	
}

public class TestShape {

	public static void main(String[] args) {
		 Circle c = new Circle(10, 20, 5);
		 c.print();
		 System.out.println(c.area());
	}

}
