package 장제하;

public class p36_Assingnment {
	public static void main(String[]args) {
		char c='한';
		
		System.out.println("문자:"+c);
		
		int code =c; //자동형변환
		System.out.println("유니코드:"+Integer.toHexString(code));
		
		int i =0xd55d;
		char c2 = (char)i;
		System.out.println("문자:"+c2);
		
		
	}
}
