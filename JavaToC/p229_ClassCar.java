package JavaToC;

class car{
	public int getSpeed()
	{
		return speed;
	}
	
	public void setSpeed(int s)
	{
		speed=s;
	}
	
	public void honk()
	{
		System.out.println("빵빵");
	}
	
	private int speed;
	
}

public class p229_ClassCar {
	public static void main(String[] args)
	{
	car myCar=new car();
	myCar.setSpeed(80);
	myCar.honk();
	System.out.println("현재 속도는 "+myCar.getSpeed()+"입니다.");
	}
}
