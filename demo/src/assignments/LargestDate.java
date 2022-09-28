package assignments;

import java.time.LocalDate;
import java.util.Scanner;

public class LargestDate {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		var ldate = LocalDate.of(1, 1, 1);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter date yyyy-mm-dd :");
			var sdate = s.nextLine();
			var date = LocalDate.parse(sdate);
			if (date.compareTo(ldate) > 0)
				ldate = date;
		}

		System.out.println(ldate);
	}

}
