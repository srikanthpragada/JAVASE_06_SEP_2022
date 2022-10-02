package oop;

import java.util.Scanner;

public class AverageOfNumbers2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int total = 0, count = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			try {
				int num = Integer.parseInt(s.nextLine());
				total += num;
				count ++;
			} catch (NumberFormatException ex) {
				System.out.println("Sorry! Invalid number!");
			}
		}

		System.out.println(total / count);

	}

}
