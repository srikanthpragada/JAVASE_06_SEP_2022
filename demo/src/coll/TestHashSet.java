package coll;

import java.util.HashSet;

class MyPoint {
	private int x, y;
	public MyPoint(int x, int y) {
		this.x  = x;
		this.y  = y;
	}
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Called");
		MyPoint other = (MyPoint) obj;
		return this.x == other.x && this.y == other.y;
	}
	@Override 
	public int hashCode() {
		return this.x;
	}
}

public class TestHashSet {

	public static void main(String[] args) {
		 var points = new HashSet<MyPoint>();
		  
		 points.add( new MyPoint(1,2));
		 points.add( new MyPoint(10,20));
		 points.add( new MyPoint(11,12));
		 points.add( new MyPoint(10,20));
		 points.add( new MyPoint(1,20));
		 
		 for(MyPoint p : points)
			 System.out.println(p);
		 

	}

}
