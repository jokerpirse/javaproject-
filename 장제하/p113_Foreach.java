package ¿Â¡¶«œ;

public class p113_Foreach {
	public static void main(String[]args) {
   		int [] array = {88, 67, 56, 77, 99, 44};
		int total =0;
		
		for ( int counter = 0; counter < array.length; counter++) 
			total += array[ counter ];
		
		System.out.println(total);
	}
}
