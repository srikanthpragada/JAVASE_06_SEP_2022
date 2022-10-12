package network;

import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MarksServer {

	public static void main(String args[]) throws Exception {
		try (var raf = new RandomAccessFile("d:\\classroom\\sep6j\\marks.dat", "r")) {
			ServerSocket ss = new ServerSocket(3000, 10);
			System.out.println("Marks Server is ready...");
			while (true) {
				Socket cs = ss.accept(); // wait for client
				// read rollno from client socket
				Scanner s = new Scanner(cs.getInputStream());
				int rollno = s.nextInt();

				// Move to required position in the file and read marks
				raf.seek(rollno - 1);
				var marks = raf.readByte();

				// send marks to client socket
				PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
				pw.println(marks); // write to client
			} // end of while
		}
	} // end of main
} // end of class
