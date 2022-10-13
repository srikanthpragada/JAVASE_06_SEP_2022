package coll;

import java.util.TreeSet;

public class SortingUniqueNames2 {

	public static void main(String[] args) {
		var ts = new TreeSet<String>();
		ts.add("Abc");  // String
		ts.add("Pqr");
		ts.add("Xyz");
		ts.add("Pqr");
		ts.remove("Abc");
		ts.add("Def");

		for (var e : ts)
			System.out.println(e);

	}

}
