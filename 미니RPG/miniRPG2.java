package 휴학자바공부;

import java.util.Scanner;

public class miniRPG2 {
	public static void main(String[] args) {
		
		
		
		용사 himmal = new 용사();
		
		himmal.Atk=20;
		himmal.Def=15;
		himmal.Hp=30;
		himmal.Gold=0;
		
		System.out.println("용사여 당신의 이름을 알려주세요!");
		Scanner sc = new Scanner(System.in);
		himmal.name= sc.nextLine();
		System.out.println("환영합니다, "+himmal.name+"님!");
		
		Monster [] 괴물= new Monster[3];
		
		괴물[0]= new Monster();
		괴물[0].Name="미믹";
		괴물[0].Atk=10;
		괴물[0].Def=7;
		괴물[0].Hp=15;
		괴물[0].Gold=10;
	
		괴물[1]= new Monster();
		괴물[1].Name="듀라한";
		괴물[1].Atk=25;
		괴물[1].Def=5;
		괴물[1].Hp=25;
		괴물[1].Gold=20;
		
		괴물[2]= new Monster();
		괴물[2].Name="데스나이트";
		괴물[2].Atk=20;
		괴물[2].Def=18;
		괴물[2].Hp=10;
		괴물[2].Gold=25;
		
		System.out.println("몬스터가 나타났다! 누가 나왔을까?");
		System.out.println("1.미믹 2.듀라한 3.데스나이트");
		Scanner sc1 = new Scanner(System.in);
		
		int choice1 = sc1.nextInt();
		
		if (choice1 == 1) {
        	System.out.println("미믹이 나타났다!");
        	
		}
		
        else if (choice1 == 2) {
    		System.out.println("듀라한이 나타났다!");
        }
		
        else if (choice1 == 3) {
			System.out.println("데스나이트가 나타났다!");
        }
		
        else {
			System.out.println("잘못 입력했습니다.");
			return;
		}
		
		int 준데미지 = himmal.Atk-괴물[choice1-1].Def;
		if (준데미지<0) 준데미지=0;
		int 받은데미지 = 괴물[choice1-1].Atk-himmal.Def;
		if (받은데미지<0) 받은데미지=0;
		String monster=괴물[choice1-1].Name;
		
		while (himmal.Hp > 0 && 괴물[choice1-1].Hp> 0) {

            System.out.println();
            System.out.println("1. 싸운다  2. 도망간다");
            System.out.print(">> ");
            int choice2 = sc.nextInt();

            if (choice2 == 1) {
            	System.out.println("용사의 공격!");
            	System.out.println(준데미지+"의 데미지 발생!");
            	괴물[choice1-1].Hp-=준데미지;
            	if (괴물[choice1-1].Hp<=0) {
            		System.out.println("남은 "+monster+"의 체력 : 0");
            		break;
            	}
            	System.out.println("남은 "+monster+"의 체력 : "+괴물[choice1-1].Hp);
            	System.out.println(monster+"의 공격!");
            	System.out.println(받은데미지+"의 데미지 발생!");
            	himmal.Hp-=받은데미지;
            	System.out.println("용사의 체력 : "+himmal.Hp);
            }
            
            else if (choice2 == 2) {
                System.out.println("용사가 도망갔다!");
                break;
            }

            else {
                System.out.println("잘못 입력했습니다.");
                continue;
            }
            

	 }
	 if (괴물[choice1-1].Hp<=0) {
		 System.out.println("승리!");
		 System.out.println(괴물[choice1-1].Gold+"의 골드를 획득했다!");
		 himmal.Gold=himmal.Gold+괴물[choice1-1].Gold;
	 }
	}

}

class Monster {
	String Name;
	int Hp, Gold, Atk, Def;
}
class 용사 {
	String name;
	int Hp, Gold, Atk, Def;
}
