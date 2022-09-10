package basics;

public class FunsDemo {

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	// Variable Number of Arguments
	public static int sum(int...nums) {
		int total = 0;
		for (int n : nums)
			total += n;

		return total;
	}

	public static void main(String[] args) {
		int total;

		total = add(10, 20);
		total = sum(10, 20, 30);
		total = sum(1, 2, 4, 5, 5);

	}
}
