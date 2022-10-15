package coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortNamesFromFile {

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("d:\\classroom\\sep6j\\names.txt")) {
			var br  = new BufferedReader(fr);
			var names = new ArrayList<String>();
						
			while(true) {
				String name = br.readLine();
				if (name == null)  // EOF
					break;
				
				names.add(name);
			}
			br.close();
			
			names.sort(null);
			
			for(String name : names)
				System.out.println(name);

		}
	}

}
