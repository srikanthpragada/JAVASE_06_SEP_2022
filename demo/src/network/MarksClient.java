package network;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MarksClient {

	public static void main(String[] args) throws Exception {
		Socket cs = new Socket("localhost", 3000); // connect to server
		// Send rollno to server socket 
		PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
		pw.println(6);
		
		// get stream to read data from server
		InputStream is = cs.getInputStream();
		// Use Scanner to read a line
		Scanner scanner = new Scanner(is);
		String marks = scanner.nextLine();
		System.out.printf("Marks : " + marks);
		cs.close();
	}

}
