package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
	public static void main(String[] args) {
		
		 // 1. Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // 2. Current Time
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current Time: " + nowTime);

             
	}
}
