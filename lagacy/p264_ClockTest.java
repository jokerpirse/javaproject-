package lagacy;

public class p264_ClockTest {
	public static void main (String[] args) {
		p263_Clock[] clocks = new p263_Clock[3];
		
//		p263_Clock korClock = new p263_Clock();
//		p263_Clock romeClock = new p264_ForeignClock("Rome",9);
//		p263_Clock tokyoClock = new p264_ForeignClock("tokyo",-7);
//		
		clocks[0] = new p263_Clock();
		clocks[1] = new p264_ForeignClock("Rome",9);
		clocks[2] = new p264_ForeignClock("tokyo",-7);
		//
		
		int end=0;
		//for (int num : Clock) end +=num;
		System.out.println(Clock.getLocation() + " : " + Clock.getHours() + "시 " + Clock.getMinutes() + "분 " + Clock.getSeconds() + "초");
		
		
//		System.out.println(korClock.getLocation() + " : " + korClock.getHours() + "시 " + korClock.getMinutes() + "분 " + korClock.getSeconds() + "초");
//		System.out.println(romeClock.getLocation() + " : " + romeClock.getHours() + "시 " + romeClock.getMinutes() + "분 " + romeClock.getSeconds() + "초");
//		System.out.println(tokyoClock.getLocation() + " : " + tokyoClock.getHours() + "시 " + tokyoClock.getMinutes() + "분 " + tokyoClock.getSeconds() + "초");
//		
	}
}
