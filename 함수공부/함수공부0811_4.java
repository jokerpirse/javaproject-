package 함수공부;

import java.util.Random;
import java.util.Scanner;

public class 함수공부0811_4 {
	public static void Study()
	{
		System.out.println("공부하기");
	}
	
	public static void Phone()
	{
		System.out.println("폰보기");
	}
	
	
	public static void main (String args[]) {
				System.out.println("시간입력");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		
		for (int i = 1; i<=time; i++) {
			Random rand = new Random();
			if(rand.nextInt() % 2 ==0) {
				System.out.printf(i+"시간");
				Study();
				
			} else {
				System.out.printf(i+"시간");
				Phone();
				
			}
			
		}
		
	}
	
}