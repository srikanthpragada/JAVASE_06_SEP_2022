package io;

import java.io.RandomAccessFile;
public class ReadMarks {
	public static void main(String[] args) throws Exception {
         var raf = new RandomAccessFile("d:\\classroom\\sep6j\\marks.dat", "r");
         for(int i = 1; i <= raf.length(); i ++)
         {
        	 System.out.println(raf.readByte());
         }
         
         raf.close();
	}
}
