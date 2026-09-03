package test;

import java.util.Scanner;

public class 회원가입로그인프로그램 {
	public static void main (String[] args) {
		
		String[] ids = new String[100]; 
		String[] pws = new String[100]; 
		int count=0;//인원수
		
		//1.회원가입
		//2.로그인
		//3.프로그램종료
		
		do {
			System.out.println("1:회원가입");
			System.out.println("2:로그인");
			System.out.println("3:프로그램 종료");
			
			System.out.print("원하는 메뉴의 번호를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int manuint = sc.nextInt();
			
			switch(manuint) {
			
			case 1: count=signup(ids, pws, count); break;
			case 2: login(ids, pws); break;
			case 3: System.out.println("시스템이 종료되었습니다.");
			return;
			}
			
			
		}while (true);
	}

	private static void login(String[] ids, String[] pws) {
		// TODO Auto-generated method stub
		System.out.println("로그일 하실 아이디를 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		String signupid = sc1.next();
		System.out.println("로그인 하실 아이디의 비밀번호를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
	}

	private static int signup(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		System.out.println("가입하실 아이디를 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		String signupid = sc1.next();
		System.out.println("가입하실 아이디의 비밀번호를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		String signuppw = sc2.next();
		
		signupid=signupid.trim();
		signuppw=signuppw.trim();
		
		count++;
		return 0;
	}

}
