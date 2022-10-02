package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int total = 0, count = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			try {
				int num = s.nextInt();
				total += num;
				count ++;
			} catch (InputMismatchException ex) {
				System.out.println("Sorry! Invalid number!");
				//Read and clear buffer
				s.nextLine();
			}
		}

		System.out.println(total / count);

	}

}
