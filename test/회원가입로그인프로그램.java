package test;

import java.util.Scanner;

public class 회원가입로그인프로그램 {
	public static void main(String[] args) {

		String[] ids = new String[100];
		String[] pws = new String[100];
		int count = 0;// 인원수

		// 1.회원가입
		// 2.로그인
		// 3.프로그램종료

		do {
			System.out.println("1:회원가입");
			System.out.println("2:로그인");
			System.out.println("3:프로그램 종료");

			System.out.print("원하는 메뉴의 번호를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int manuint = sc.nextInt();

			switch (manuint) {

			case 1:
				count = signup(ids, pws, count);
				break;
			case 2:
				login(ids, pws, count);
				break;
			case 3:
				System.out.println("시스템이 종료되었습니다.");
				return;
			}

		} while (true);
	}

	private static void login(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		System.out.println("로그인 하실 아이디를 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		String signupid = sc1.next();
		System.out.println("로그인 하실 아이디의 비밀번호를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		String signuppw = sc2.next();

		signupid = signupid.trim();
		signuppw = signuppw.trim();

//		for(int idx=0;idx<3;idx++) {
//			System.out.println(ids[idx]);
//		}
//		System.out.println(ids[idx]);
//		idx++;
//		System.out.println(ids[idx]);
//		idx++;

		int flag_result = 0;

			for (int i = 0; i < count; i++) {

			if (ids[i].equals(signupid)) {

				if (pws[i].equals(signuppw)) {
					flag_result = 1;
				} else {
					flag_result = 2;
				}

				break;
			}
		}

		if (flag_result == 0) {
			System.out.println("아이디가 일치하지 않습니다.");
		} else if (flag_result == 1) {
			System.out.println("아이디 패스워드 모두 일치합니다.");
		} else if (flag_result == 2) {
			System.out.println("패스워드가 일치하지 않습니다.");
		}

	}

	private static int signup(String[] ids, String[] pws, int count) {
		// TODO Auto-generated method stub
		System.out.println("가입하실 아이디를 입력하세요 : ");
		Scanner sc1 = new Scanner(System.in);
		String signupid = sc1.next();
		System.out.println("가입하실 아이디의 비밀번호를 입력하세요 : ");
		Scanner sc2 = new Scanner(System.in);
		String signuppw = sc2.next();

		signupid = signupid.trim();
		signuppw = signuppw.trim();

		ids[count] = signupid;
		pws[count] = signuppw;

		count++;

		System.out.println("회원가입 되었습니다");

		return count;
	}

}
