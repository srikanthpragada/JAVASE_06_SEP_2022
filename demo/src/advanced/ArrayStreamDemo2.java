package advanced;

import java.util.Arrays;

public class ArrayStreamDemo2 {

	public static void main(String[] args) {
		int nums [] = {5, 11,20,30,40,15,22, 20,43,45};
		
		// Take 3rd lowest number from array 
		var third = Arrays.stream(nums)
				          .sorted()
				          .skip(2)
				          .limit(1)
				          .findFirst();
		
     	System.out.println(third.getAsInt());
		
		// Get average of numbers 
		var stream =  Arrays.stream(nums);
		var avg = stream.average().getAsDouble();
		System.out.println(avg);
		
		// Create a new stream from Array 
		// Display numbers > avg
		Arrays.stream(nums)
		      .filter( v -> v > avg)
		      .forEach(System.out::println);
 
	}

}
