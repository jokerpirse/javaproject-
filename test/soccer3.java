package test;

import java.util.Scanner;

class Team {

	private String name;//필드=변수
	
	
	
	public String getName() {
		return name;
	}
	
	public Team(String n) {
		this.name = n;
	}
	public void EditTeam() {//메서드=함수
		System.out.println("<<"+name+"을 편집합니다.>>");
		System.out.println("1. 코치 추가");
        System.out.println("2. 선수 추가");
        System.out.println("3. 코치 삭제");
        System.out.println("4. 선수 삭제");
        System.out.println("5. 나가기");
        System.out.print("입력 : ");
        
        Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();

		switch (input) {
		case 1://코치추가
		break;	
		
		case 2://선수추가
		break;	
		
		case 3://코치삭제
		break;	
		
		case 4://선수삭제
		break;
		
		case 5://나가기
		return;
		}
	}
	
	// String 코치;
}

public class soccer {
	public static void main(String[] args) {
		soccer team = new soccer();
		team.start();

	}

	Team[] teams = new Team[100];
	int teamcount = 0;
	void start() {
		//testcase();
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
				break;//return은 함수 자체를 나가게 하는 거라 여기서 return쓰면 start를 나가게 됨
			case 2:
				EditTeam();
				break;
			case 3:
				DelTeam();
				break;
			case 4:
				AllTeam();
				break;
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
		 
			for (int t=0; t<teamcount ;t++) {
				System.out.print((t+1)+". ");
				System.out.println(teams[t].getName());

			}
			
				
		System.out.println((teamcount+1)+". 나가기");
		
		System.out.print("편집할 구단 입력 : ");

		Scanner sc2 = new Scanner(System.in);
		int teamnum = sc2.nextInt()-1;
		
		if(teamnum==teamcount) return;
		teams[teamnum].EditTeam();
		
	}

	public void DelTeam() {

	}

	public void AllTeam() {
		for (int g = 0; g < teamcount; g++) {

		}

	}

}
