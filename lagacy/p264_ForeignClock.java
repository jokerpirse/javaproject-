package lagacy;


public class p264_ForeignClock extends p263_Clock{
	String location;
	int timeDiff;
	
	@Override
	public String getLocation() {return location;}
	
	
	public  p264_ForeignClock (String loc, int diff ) {
		location =loc; 
		timeDiff = diff;
	}
	
	@Override
	int getHours() {
		int local = super.getHours();
		
		int tmp = local + timeDiff;
		tmp = (tmp < 0) ? (24+tmp) : tmp;
		return tmp;
	}
}
