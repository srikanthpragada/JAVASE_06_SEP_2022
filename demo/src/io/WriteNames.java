package io;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteNames {

	public static void main(String[] args) throws Exception {
		try (var fw = new FileWriter("d:\\classroom\\sep6j\\names.txt")) {
			Scanner s = new Scanner(System.in);
			while (true) {
				System.out.print("Enter name [end to stop] :");
				var name = s.nextLine();
				if (name.equals("end"))
					break;

				fw.write(name + "\n");
			}
		} // try
	}
}
