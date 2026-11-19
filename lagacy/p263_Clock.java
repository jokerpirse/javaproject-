package lagacy;

import java.time.Clock;
import java.util.Calendar;
import java.util.Date;

public class p263_Clock {
	public String getLocation() { return "한국"; }
	int getHours() {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		return hour;
		
	}
	
	int getMinutes() {
		long time = System.currentTimeMillis();
		Date date = new Date(time);
		int min = date.getMinutes();
		
		return min;
	}
	
	int getSeconds() {
		Date date = Calendar.getInstance().getTime();
		int sec = date.getSeconds();
		
		return sec;
	}
}