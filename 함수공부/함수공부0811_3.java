package 함수공부;

import java.util.Random;

public class 함수공부0811_3 {
	public static void eatFood()
	{
		System.out.println("밥먹기");
	}
	
	public static void goSleep()
	{
		System.out.println("잠자기");
	}
	
	
	public static void main (String args[]) {
		Random rand = new Random();
		for (int i = 0; i<10; i++) {
			if(rand.nextInt() % 2 ==0) {
				eatFood();
			
			} else {
				goSleep();
			}
			
		}
		
	}
	
}
