package io;

import java.io.RandomAccessFile;
public class WriteMarks {
	public static void main(String[] args) throws Exception {
         var raf = new RandomAccessFile("d:\\classroom\\sep6j\\marks.dat", "rw");
         for(int i = 1; i <= 20; i ++)
         {
        	 byte marks = (byte) Math.round(Math.random() * 100); 
        	 raf.writeByte(marks);
         }
         
         raf.close();
	}
}
