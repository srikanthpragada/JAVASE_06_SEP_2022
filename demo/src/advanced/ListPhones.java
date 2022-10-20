package advanced;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class ListPhones {

	public static void main(String[] args) throws Exception {
		var path = Path.of("d:\\classroom\\sep6j\\phones.txt");
        var phones = new TreeSet<String>();
		Files.lines(path)
		     .filter(line -> !line.isBlank())
		     .forEach(line -> {
			      Arrays.stream(line.split(","))
			         .filter( s -> Pattern.matches("^\\d{10}$", s))
			         .forEach(s -> phones.add(s));
		      }
		     );

		// print phones
		phones.forEach(System.out::println);
	}
}
