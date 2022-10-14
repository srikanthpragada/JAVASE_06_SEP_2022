package coll;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class WriteSortedNames {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		var names = new TreeSet<String>();

		while (true) {
			System.out.print("Enter name [end to stop] :");
			var name = s.nextLine();
			if (name.equals("end"))
				break;

			names.add(name);
		}

		try (var fw = new FileWriter("d:\\classroom\\sep6j\\sortednames.txt")) {
			for (var name : names)
				fw.write(name + "\n");
		}
	}

}
