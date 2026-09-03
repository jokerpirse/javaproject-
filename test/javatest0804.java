package test;

public class javatest0804 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		while (sum < 100) {
			num++;
			if (num % 2 == 0) {
				
				sum -= num;
				
			} else {
				sum += num;
				
			}
		}
		System.out.println((num ));

//		int sum1=0;
//		int num1=0;
//		
//		for (sum<100; sum++) {
//			
//		}
	
	
	}
}