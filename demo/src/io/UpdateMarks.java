package io;

import java.io.RandomAccessFile;

public class UpdateMarks {
	public static void main(String[] args) throws Exception {
		var raf = new RandomAccessFile("d:\\classroom\\sep6j\\marks.dat", "rw");
		int rollno = 10;
		int newMarks = 80;

		raf.seek(rollno - 1);
		raf.writeByte(newMarks);

		raf.close();
	}
}
