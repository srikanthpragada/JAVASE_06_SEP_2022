package oop;

public class ExDemo {

	public static void main(String[] args) {

		try {
			int n = Integer.parseInt("0");
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} catch (ArithmeticException ex) {
			System.out.println("Number cannot be zero!");
		}

		System.out.println("The End");
	}

}
