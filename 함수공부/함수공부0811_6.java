package 함수공부;

public class 함수공부0811_6 {
	public static void person_pocket(char who, int money) {
		System.out.println(who+"의 주머니에 "+money+"원");
	}
	
	public static void main(String args[]) {
		person_pocket('A',10000);
		person_pocket('B',5000);
	}
	
}
