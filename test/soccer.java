package 장제하;

import java.util.Scanner;

class Team {

	private String name;

	public Team(String n) {
		this.name = n;
	}
	public void EditTeam() {
		System.out.println("<<"+name+"을 편집합니다.>>");

	}
	// String 코치;
}

//
//class 선수
//{
//	
//}

public class soccer {

	public static void main(String[] args) {
		soccer team = new soccer();
		team.start();

	}

	Team[] teams = new Team[100];
	int teamcount = 0;
	void start() {
		testcase();
		do {
			System.out.println("<축구선수 관리 프로그램>");
			System.out.println("1. 구단 추가");
			System.out.println("2. 구단 편집");
			System.out.println("3. 구단 삭제");
			System.out.println("4. 구단 보기");
			System.out.println("5. 프로그램 종료");

			System.out.print("입력 : ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case 1:
				AddTeam();
			case 2:
				EditTeam();
			case 3:
				DelTeam();
			case 4:
				AllTeam();
			case 5:
				return;

			}

			System.out.println("");
			System.out.println("");

		} while (true);

	}
	
	void testcase() {
		teams[teamcount] = new Team("이샘"); // .name 필수???
		teamcount++;
		teams[teamcount] = new Team("즐거움"); // .name 필수???
		teamcount++;
		teams[teamcount] = new Team("슬픔"); // .name 필수???
		teamcount++;
		teams[teamcount] = new Team("화남"); // .name 필수???
		teamcount++;
	}
	
	

	public void AddTeam() {
		System.out.println("<<구단추가>>");
		System.out.print("구단이름 입력 : ");
		Scanner sc1 = new Scanner(System.in);
		String strname = sc1.nextLine();
		System.out.println(">구단이 생성되었습니다.");

		teams[teamcount] = new Team(strname); // .name 필수???

		teamcount++;

	}

	public void EditTeam() {
		System.out.println("<<구단편집>>");
		int EditCount=1;
			for (int t=0; t<teamcount ;t++) {
				System.out.println(EditCount+". ");
				EditCount++;
			}
		System.out.println(EditCount+++". 나가기");
		
		int EndCount=EditCount;
		Scanner sc2 = new Scanner(System.in);
		int strname = sc2.nextInt();
		
		if(sc2==EndCount) return;
	}

	public void DelTeam() {

	}

	public void AllTeam() {
		for (int g = 0; g < teamcount; g++) {

		}

	}
}
