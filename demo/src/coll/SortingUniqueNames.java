package coll;

import java.util.TreeSet;

public class SortingUniqueNames {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("Abc");  // String
		ts.add(10);     // Integer
		ts.add(10.30);  // Double
		ts.add("Xyz");
		ts.add("Pqr");
		ts.remove("Abc");
		ts.add("Def");

		for (var e : ts)
			System.out.println(e);

	}

}
