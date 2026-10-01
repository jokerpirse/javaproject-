package ¹Ì´ÏRPG;

import java.util.Scanner;

public class miniRPG2 {
	public static void main(String[] args) {
		
		
		
		¿ë»ç himmal = new ¿ë»ç();
		
		himmal.Atk=20;
		himmal.Def=15;
		himmal.Hp=30;
		himmal.Gold=0;
		
		System.out.println("¿ë»ç¿© ´ç½ÅÀÇ ÀÌ¸§À» ¾Ë·ÁÁÖ¼¼¿ä!");
		Scanner sc = new Scanner(System.in);
		himmal.name= sc.nextLine();
		System.out.println("È¯¿µÇÕ´Ï´Ù, "+himmal.name+"´Ô!");
		
		Monster [] ±«¹°= new Monster[3];
		
		±«¹°[0]= new Monster();
		±«¹°[0].Name="¹Ì¹Í";
		±«¹°[0].Atk=10;
		±«¹°[0].Def=7;
		±«¹°[0].Hp=15;
		±«¹°[0].Gold=10;
	
		±«¹°[1]= new Monster();
		±«¹°[1].Name="µà¶óÇÑ";
		±«¹°[1].Atk=25;
		±«¹°[1].Def=5;
		±«¹°[1].Hp=25;
		±«¹°[1].Gold=20;
		
		±«¹°[2]= new Monster();
		±«¹°[2].Name="µ¥½º³ªÀÌÆ®";
		±«¹°[2].Atk=20;
		±«¹°[2].Def=18;
		±«¹°[2].Hp=10;
		±«¹°[2].Gold=25;
	}

}

class Monster {
	String Name;
	int Hp, Gold, Atk, Def;
}
class ¿ë»ç {
	String name;
	int Hp, Gold, Atk, Def;
}