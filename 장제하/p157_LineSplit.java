package 장제하;

import java.util.Scanner;

public class p157_LineSplit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자들을 공백으로 구분하여 입력 : ");
		String statement = sc.nextLine();
		
		String [] split = null;
		split = statement.split(" ");
		int sum = 0;
		for(int i=0; i<split.length; i++)
		//for (String s : split)
		{
			String s = split[i];
			int num = Integer.parseInt(s);
			sum += num;
		}
		System.out.println(sum);
	}
}
