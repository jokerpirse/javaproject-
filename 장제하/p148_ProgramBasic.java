package ¿Â¡¶«œ;

public class p148_ProgramBasic {
	public static void main(String[]args) {
		String str1 = new String("I Love You!!");
		String str2 = str1;
		String str3= new String("I Love You!!");
		
		
		if(str1 == str2) System.out.println("true");
		else System.out.println("false");
		if(str1 == str3) System.out.println("true");
		System.out.println(str1. equals(str3));
		
		String str01 = "abcisabcisabc" ;
		
		System.out.println(str01.indexOf("abc"));
		System.out.println(str01.indexOf('i'));
		System.out.println(str01.indexOf('i',4));
		System.out.println(str01.lastIndexOf("abc"));
		System.out.println(str01.lastIndexOf('s'));
		System.out.println(str01.lastIndexOf('s',8));
		
		String regExp=" |,|:|\\.";
		String words = "one two,three:four.five";
		String newStr=words.replaceAll(regExp,"-");
		System.out.println(newStr);
		
		String str = "AaAaAaAaAa";
		String upperStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		System.out.println(str);
		System.out.println(upperStr);
		System.out.println(lowerStr);
		
		String str0= "this is a test *** ";
		String str001 = str0.trim();
		System.out.println(str001);
		
		//String delimStr=" |,|:|\\.";
		String delimStr="\\s+";
		String Words = "minus one    two,three:four.five";
		String [] split = null;
		split = Words.split(delimStr);
		for (String s : split) 
			 System.out.println("-" + s + "-");
		
		
		
		}
}
