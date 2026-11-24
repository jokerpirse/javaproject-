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

		for (p263_Clock clock : clocks) 
		{
			System.out.println(clock.getLocation() + " : " + clock.getHours() + "시 " + clock.getMinutes() + "분 " + clock.getSeconds() + "초");
				
		}
//		for (int num = 0 ; num<3 ; num++)	
//		{
//		System.out.println(clocks[num].getLocation() + " : " + clocks[num].getHours() + "시 " + clocks[num].getMinutes() + "분 " + clocks[num].getSeconds() + "초");
//		}
		
//		System.out.println(korClock.getLocation() + " : " + korClock.getHours() + "시 " + korClock.getMinutes() + "분 " + korClock.getSeconds() + "초");
//		System.out.println(romeClock.getLocation() + " : " + romeClock.getHours() + "시 " + romeClock.getMinutes() + "분 " + romeClock.getSeconds() + "초");
//		System.out.println(tokyoClock.getLocation() + " : " + tokyoClock.getHours() + "시 " + tokyoClock.getMinutes() + "분 " + tokyoClock.getSeconds() + "초");
//		
	}
}
