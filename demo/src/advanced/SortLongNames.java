package advanced;

import java.util.Arrays;

public class SortLongNames {

	public static void main(String[] args) {
		String [] names = {"Scott","James",
				"Richards","Joe","Adams","Clinton"};
		
		Arrays.stream(names)
		      .filter(n -> n.length() > 4)
		      .sorted()
		      .forEach(System.out::println);
	}

}
