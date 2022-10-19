package advanced;

import java.util.Arrays;

public class ArrayStreamDemo {

	public static void main(String[] args) {
		int nums [] = {11,20,30,40,15,22, 20,43,45};
		
		Arrays.stream(nums)
		      .distinct()
		      .filter(v -> v % 2 == 0)
		      .sorted()
		      .forEach(System.out::println); // Method reference 
		
 
	}

}
