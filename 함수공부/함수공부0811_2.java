package 함수공부;

public class 함수공부0811_2 {
	public static void function_test1()
	{
		System.out.println("function_test1()");
		System.out.println("함수 안에서 실행");
	}
	
	public static void main (String [] args) 
	{
		System.out.println("실행 전");
		function_test1();
		System.out.println("실행 후");
	}
}
