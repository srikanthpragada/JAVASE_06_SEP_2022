package advanced;

import java.nio.file.Files;
import java.nio.file.Path;

public class SearchJavaFilesForString {
	public static boolean hasString(Path path, String search) {
		try {
		  return Files.readString(path).contains(search);
		}
		catch(Exception ex) {
			return false; 
		}
	}

	public static void main(String[] args) throws Exception {
		String search = "java.util.TreeSet";
		
		var stdir = Path.of("d:\\classroom\\sep6j\\demo");
		
		Files.walk(stdir)
		     .filter(path -> SearchJavaFilesForString.hasString(path, search))		     		     
		     .forEach(p -> System.out.println(p.toString()));
	}

}
