package 장제하;

import java.util.Scanner;

public class p98_MutiplicationTable {
	public static void main (String[]args) {
		int dan;
		
		Scanner scg= new Scanner(System.in);
		System.out.print("원하는 단?");
		dan = scg.nextInt();
		scg.close();

		for(int index=1; index<=9;index++) {
			System.out.println(dan+"*"+index+"="+dan*index);
		}
		
	}
}
