package 장제하;

public class p54_LogicOperation {
	public static void main(String[]args) {
		int x=3, y=9;
		
		System.out.println("논리 XOR 테스트");
		
		System.out.println( (x<y) + "," + (x>0) + ":" + (x<y^x>0));
		
		System.out.println( (x>y) + "," + (x>0) + ":" + (x>y^x>0));
		
		System.out.println( (x<y) + "," + (x<0) + ":" + (x<y^x<0));
		
		System.out.println( (x>y) + "," + (x<0) + ":" + (x>y^x<0));
		
		System.out.println("논리 NOT 테스트");
		
		System.out.println( (x<y) + "," + !(x<y));
		
		System.out.println( (x>y) + "," + !(x>y));
		
	}
}
