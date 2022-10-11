package io;

import java.io.FileReader;

public class CountCharWordLine {

	public static void main(String[] args) throws Exception {
		int chars = 0, words = 0, lines = 0;
 

		var fr = new FileReader("d:\\classroom\\sep6j\\test.txt");
		while (true) {
			int ch = fr.read();
			if (ch == -1) // EOF
				break;

			chars++;
			if (ch == 32) // space 
				words++;
			else if (ch == 10) // new line \n
			{
				lines++;
				words++;
			}
		}

		fr.close();
		System.out.printf("Chars = %d, Words = %d, Lines = %d", chars, words, lines);
	}
}
