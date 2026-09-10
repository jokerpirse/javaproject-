package 장제하;

import java.util.Scanner;

public class p155_SearchReplace {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("문장입력 : ");
		String statement=sc.nextLine();
		System.out.println("찾고자 하는 단어 : ");
		String sword = sc.next();
		System.out.println("바꾸고자 하는 단어 : ");
		String rword = sc.next();
		
		statement = statement.replaceFirst(sword, rword);
		System.out.println(statement);
		
	}

}
