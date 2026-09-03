package test;

public class test0730 {
	public static void main(String[] args) {
		int x = 15;
		if(x>10&&x<20) System.out.println("[1-1]1.");
		
		char ch = 5;
		if (ch != ' ' && ch != '\t') System.out.println("[1-1]2.");
		
		char ch3 = 'x';
		if (ch3=='x'||ch3=='X') System.out.println("[1-1]-3");
		
		char ch4 = '8';
		if ('0' <= ch4 && ch4 <= '9') System.out.println("[1-1]-4");
		
		char ch5 = 'a';
		if ( ('A' <= ch5 && ch5 <= 'Z') || ('a' <= ch5 && ch5 <= 'z') ) 
		{
			System.out.println("[1-1]-5");
		}
		
		char ch6 = 200;
		if ( (ch6 % 400 == 0) || (ch6 % 4 == 0  && ch6 % 100 != 0 ) )
		{
			System.out.println("[1-1]-6");
		}
		
		boolean powerOn = false;
		if ( !powerOn ) 
		{
			System.out.println("[1-1]-7");
		}
		
		String equals="yes";
		if  (equals=="yes") 
		{
			System.out.println("[1-1]-8");
		}	
		
//		int sum = 0; //1-2¹ø
//		int i = 1;
//		for (;i <= 20; ) {
//			i++;
//			if (i % 2 != 0 && i % 3 != 0){
//				sum += i;
//			}
//		}
//		System.out.println(sum);
		
		int sum1 = 0;
		int sum2 = 0;
		for (int i=0;i <= 10; i++) {
			sum1 += i;
			sum2 += sum1;
		}
		System.out.println(sum2);//1-3
		
		
		for (int i=1;i <6; i++)
			System.out.println(i+" "+(6-i)+"=6");
	}
}
