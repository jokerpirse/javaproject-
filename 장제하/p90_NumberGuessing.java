package 장제하;

import java.util.Random;
import java.util.Scanner;

public class p90_NumberGuessing {
	public static void main (String[]args) {
		
		int answer=(new Random()).nextInt(100)+1;
		int guess;
		
		Scanner sc = new Scanner(System.in);
		boolean cont=true;
		
		while(cont) {
			System.out.println("예측값?");
			guess=sc.nextInt();
			
			if (guess>answer) System.out.println("정답보다 큽니다.");
			else if (guess<answer) System.out.println("정답보다 작습니다.");			
			else {
				System.out.println("정답입니다!");
				cont = false;
			}
		}
		sc.close();
		
	}
}
