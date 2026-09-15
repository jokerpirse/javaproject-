package 장제하;

import java.util.Scanner;

public class p161_SearchReplace {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("문장 입력 : ");
		StringBuilder statement = new StringBuilder(sc.nextLine());
		System.out.println("찾고자 하는 단어 : ");
		String sword = sc.next();
		System.out.println("바꾸고자 하는 단어 : ");
		String rword = sc.next();
		
		int start = statement.indexOf(sword);
		int end = start + sword.length();
		statement.replace(start, end, rword); //replace 안에서 sword와 rword 사이를 대신 구해준다. 코드 안에서 구할 필요 없다.
		System.out.println(statement);
	}
}
