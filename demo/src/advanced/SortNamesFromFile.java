package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNamesFromFile {

	public static void main(String[] args) throws IOException {
		 
		var path = Path.of("d:\\classroom\\sep6j\\names.txt");
		Files.lines(path)
			 .distinct()
		     .filter( line -> ! line.isBlank())
		     .sorted()
		     .forEach(System.out::println);
	}

}
