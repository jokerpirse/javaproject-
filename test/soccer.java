package 장제하;

import java.util.Scanner;

class 구단{
	//String 코치;
}
//
//class 선수
//{
//	
//}

public class soccer {
	
	public static void main(String[] args) {
		soccer team= new soccer();
		team.start();
		
	}
	
	구단[] teams=new 구단[100];
	int teamcount=0;
	void start() 
	{

		System.out.println("<축구선수 관리 프로그램>");
		System.out.println("1. 구단 추가");
		System.out.println("2. 구단 편집");
		System.out.println("3. 구단 삭제");
		System.out.println("4. 구단 보기");
		System.out.println("5. 프로그램 종료");
		
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : AddTeam();
		case 2 : EditTeam();
		case 3 : DelTeam();
		case 4 : AllTeam();
		case 5 : break;
		
		}
		
		System.out.println("");
		System.out.println("");
	
	}
	
	public void AddTeam()
	{
		System.out.println("<<구단추가>>");
		System.out.print("구단이름 입력 : ");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		System.out.println(">구단이 생성되었습니다.");
		
		
		
		teamcount++;
		
	}
	
	public void EditTeam()
	{
		
		
	}
	
	public void DelTeam()
	{
		
		
	}
	
	public void AllTeam()
	{
		for(int g=0; g<teamcount; g++) {
			
		}
		
	}
}
