package 장제하;

public class p158_ProgramBasic {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("hello");
		System.out.println("Old capacity=" + str1.capacity());
		
		str1.ensureCapacity(28);
		System.out.println("New Capacity = "+str1.capacity());
		
		str1.ensureCapacity(80);
		System.out.println("New Capacity = "+str1.capacity());
		
		
		
		
		StringBuilder str2 = new StringBuilder();
		System.out.println("Old Capacity = "+ str2.capacity()); //최소한도 16
		
		str2.ensureCapacity(40);
		System.out.println("New Capacity = "+ str2.capacity());
		
	}

}
