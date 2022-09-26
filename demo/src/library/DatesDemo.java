package library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DatesDemo {

	public static void main(String[] args) {
		 
		 LocalDate now = LocalDate.now();
		 LocalDate endDate = now.plusDays(40);
		 System.out.println(now);
		 System.out.println(endDate);
		 
		 LocalDate stdate = LocalDate.parse("2022-01-01");
		 System.out.println(stdate);
		 
		 LocalTime singtime = LocalTime.now(ZoneId.of("Asia/Dubai"));
		 System.out.println(singtime);
		 
		 LocalDateTime today = LocalDateTime.now();
		 System.out.println(today);
	}

}
