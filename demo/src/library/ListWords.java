package library;

import java.util.regex.Pattern;

public class ListWords {

	public static void main(String[] args) {
		String st = "This is   to test. We have; some words";
		
		for (var w : st.split("\\W+"))
			System.out.println(w);
		
		System.out.println("\nUsing Pattern\n");
		
		Pattern p = Pattern.compile("\\W+");
		for (var w : p.split(st))
			System.out.println(w);
	}
}
