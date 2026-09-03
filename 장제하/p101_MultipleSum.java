package 장제하;

import java.util.Scanner;

public class p101_MultipleSum {
	
	public static void main (String[]args) {
		
		System.out.println("n의 값을 입력하시오.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, sum=0;
		
		for(i=3; i<=n; i+=3) {
			sum=sum+i;
		}
		System.out.println(n+"까지의 3의 배수의 합은"+sum+"입니다.");
		sc.close();
		
	}
}
