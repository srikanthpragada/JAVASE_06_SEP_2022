package oop;

public class ExDemo2 {

	public static void main(String[] args) {

		try {
			int n = Integer.parseInt("10");
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} finally {
			System.out.println("Finally!");
		}

		System.out.println("The End");
	}

}
