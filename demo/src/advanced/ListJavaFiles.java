package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {

	public static void main(String[] args) throws IOException {
		var stdir = Path.of("d:\\classroom\\sep6j");
		
		Files.walk(stdir)
		     .filter(p -> p.toString().endsWith(".java"))
		     .forEach(p -> System.out.println(p.toString()));
		     

	}

}
