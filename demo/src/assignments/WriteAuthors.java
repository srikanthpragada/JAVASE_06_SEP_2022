package assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteAuthors {
	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\sep6j\\authors.txt");
		var br = new BufferedReader(fr);
		var fw = new FileWriter("d:\\classroom\\sep6j\\newauthors.txt");

		while (true) {
			var line = br.readLine();
			if (line == null)
				break;
			var names = line.split(",");
			for (var n : names)
				fw.write(n + "\n");
		}

		fw.close();
	}

}
