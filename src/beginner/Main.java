package beginner;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ZoneId z = ZoneId.of("Asia/Seoul");
		ZonedDateTime now = ZonedDateTime.now(z);
		ZonedDateTime todayStart = now.toLocalDate().atStartOfDay(z);
		Duration duration = null;
		long secondsFromMidnight = 0;
		boolean flag = false;
		
		
		while (true) {
			// blink UI
			flag = flag?false:true;
			
			now = ZonedDateTime.now(z);
			duration = Duration.between(todayStart, now);
			secondsFromMidnight = duration.getSeconds();

			System.out.println("\r\r\r");
			System.out.println("   ------------------");
			System.out.println(" /                 / |");
			System.out.println("------------------  /");

			System.out.print("| ");
			
			// 0~11 :AM
			// 12~23 :PM
			int hours = (int) secondsFromMidnight / 3600;
			System.out.print(hours > 11 ? "PM ": "AM " );

			// exception for noon
			if(hours == 12)
				System.out.print(hours);
			else
				System.out.print(hours%12 < 10 ? "0" + hours%12: hours%12);
			
			if(flag)
				System.out.print(":");
			else
				System.out.print(" ");

			// formatting for one digit
			int minutes = (int) (secondsFromMidnight % 3600)/60;
			System.out.print(minutes < 10 ? "0" +minutes:minutes);
			if(flag)
				System.out.print(":");
			else
				System.out.print(" ");

			int seconds = (int) secondsFromMidnight % 60;
			System.out.print(seconds < 10 ? "0" +seconds:seconds);
			
			
			System.out.print("     |/\r");
			System.out.println("------------------");
			
			Thread.sleep(500);
		}
	}
}
