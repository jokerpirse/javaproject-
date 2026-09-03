package 장제하;

public class p146_ProgramBasic {
	public static void main(String[] args) {
		String str1, str2, str3, str4, str5;
		char [] charArray= {'I',' ','L','O','V','E',' ','Y','O','U'};
		
		str1= "Hi, Byeong Man";
		str2= new String(str1);
		str3= new String(charArray);
		str4= new String(charArray,2,4);//개수
		
		System.out.println(str1 + str2 + str3 + str4);
		
		char[] t = str1.toCharArray();
		for (int i = 0; i<t.length; i++) System.out.print(t[i]);
		
		String Str1=new String("I Love You!!");
		String Str2=Str1;
		String Str3=new String("I Love You!!");
		boolean retVal;
		
		retVal= Str1.equals( Str2 ); 
		//equals에는 같은 값인지를 비교한다. ==은 같은 변수인지를 비교한다.
		System.out.println("Returned Value = "+ retVal);
		
		retVal= Str1.equals( Str3 );
		System.out.println("Returned Value = "+ retVal);
		
		
		
	}

}
