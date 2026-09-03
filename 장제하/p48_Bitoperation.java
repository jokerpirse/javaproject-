package 장제하;

public class p48_Bitoperation {
	public static void main(String[]args) {
		byte x = (byte)0x00, y=(byte)0xFF;
		byte z;
		
		z= (byte) (x & y);
		System.out.println("& :"+ z);
		
		z= (byte) (x | y);
		System.out.println("| :"+ Byte.toUnsignedInt(z));
		
		z= (byte) (x ^ y); //암호화 복호화
		System.out.println("^ :"+ Byte.toUnsignedInt(z));
		
		z= (byte) ~y;
		System.out.println("~ :"+ z);
	}
}
