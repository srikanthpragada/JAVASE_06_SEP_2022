package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListPhones {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\sep6j\\phones.txt");
		var br = new BufferedReader(fr);
		
		while (true) {
			 var line = br.readLine();
			 if(line == null)  // EOF
				 break;
			 
			 if (line.isBlank())  // Ignore blank lines
				 continue;
			 
			 var phones = line.split(",");
			 for(var p : phones)
				 System.out.println(p);
		}

		br.close();
		fr.close();
		
	}
}
