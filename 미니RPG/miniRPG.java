package 미니RPG;

import java.util.Scanner;

public class miniRPG {
	public static void main(String[] args) {
	//용사이름 적 공격력 방어력 체력(공격력이 방어력을 넘는 만큼 깎임) 골드
		String worrier;
		String mostername;
		int monsterHp, mosterGOLD, mosterAtk, mosterDef=0;
		
		
		int heroatk=20;
		int herodef=15;
		int heroHp=30;
		
		String 미믹="미믹";
		int mimicatk=10;
		int mimicdef=7;
		int mimicHp=15;
		int mimicGold=10;
		
		String 듀라한="듀라한";
		int durahanatk=25;
		int durahandef=5;
		int durahanHp=25;
		int durahanGold=20;
		
		String 데스나이트="데스나이트";
		int Dathnightatk=20;
		int Dathnightdef=18;
		int Dathnighthp=10;
		int DathnightGold=25;
		
		
		
		System.out.println("몬스터가 나타났다! 누가 나왔을까?");
		System.out.println("1.미믹 2.듀라한 3.데스나이트");
		Scanner sc = new Scanner(System.in);
		
		int choice1 = sc.nextInt();
		
		if (choice1 == 1) {
        	System.out.println("미믹이 나타났다!");
        	mostername=미믹;
        	monsterHp=mimicHp;
        	mosterAtk=mimicatk;
        	mosterDef=mimicdef;
        	mosterGOLD=mimicGold;
        }
		
		else if (choice1 == 2) {
			System.out.println("듀라한이 나타났다!");
			mostername=듀라한;
			monsterHp=durahanHp;
			mosterAtk=durahanatk;
			mosterDef=durahandef;
			mosterGOLD=durahanGold;
		}
		
		else if (choice1 == 3) {
			System.out.println("데스나이트가 나타났다!");
			mostername=데스나이트;
			monsterHp=Dathnighthp;
			mosterAtk=Dathnightatk;
			mosterDef=Dathnightdef;
			mosterGOLD=DathnightGold;
		}
		
		else {
			System.out.println("잘못 입력했습니다.");
			return;
		}
		
		int 준데미지 = heroatk-mosterDef;
		if (준데미지<0) 준데미지=0;
		int 받은데미지 = mosterAtk-herodef;
		if (받은데미지<0) 받은데미지=0;
		String monster= mostername;
		 while (heroHp > 0 && monsterHp> 0) {

	            System.out.println();
	            System.out.println("1. 싸운다  2. 도망간다");
	            System.out.print(">> ");
	            int choice2 = sc.nextInt();

	            if (choice2 == 1) {
	            	System.out.println("용사의 공격!");
	            	System.out.println(준데미지+"의 데미지 발생!");
	            	monsterHp-=준데미지;
	            	if (monsterHp<=0) {
	            		System.out.println("남은 "+monster+"의 체력 : 0");
	            		break;
	            	}
	            	System.out.println("남은 "+monster+"의 체력 : "+monsterHp);
	            	System.out.println(monster+"의 공격!");
	            	System.out.println(받은데미지+"의 데미지 발생!");
	            	heroHp-=받은데미지;
	            	System.out.println("용사의 체력 : "+heroHp);
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
		 if (monsterHp<=0) {
			 System.out.println("승리!");
			 System.out.println(mosterGOLD+"의 골드를 획득했다!");
		 }
	}
}
