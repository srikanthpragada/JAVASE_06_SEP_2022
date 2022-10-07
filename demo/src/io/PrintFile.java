package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintFile {

	public static void main(String[] args) {
		try {
			var fr = new FileReader("d:\\classroom\\sep6\\test.txt");
			while (true) {
				int ch = fr.read();
				if (ch == -1) // EOF
					break;

				System.out.print((char) ch);
			}

			fr.close();
		} catch (IOException ex) {
			System.out.println("Error :" + ex.getMessage());
		}
	}

}
