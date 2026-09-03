package 장제하;

import java.util.Random;

public class p134_ArrayArgument {
	
	public static void main(String[]args) {
		
		int [] array = new int[10];
		Random rnd=new Random();
		
		for(int i=0; i<10; i++) array[i]=rnd.nextInt();
		
		System.out.print("변경 전 : ");
		for (int i=0; i<10; i++) System.out.print(array[i]+" ");
		System.out.println();
		
		for (int i=0; i<10; i++) array[i]++;
		
		System.out.print("변경 후 : ");
		for (int i=0; i<10; i++) System.out.print(array[i]+" ");
		

		
	}

}
