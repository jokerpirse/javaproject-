package 장제하;

public class p179_MyInteger {
	
	int val;
	
	int add(p179_MyInteger   ob) {
		return this.val + ob.val;
	}
	int subtract(p179_MyInteger   ob) {return val - ob.val;}
	int multiply(p179_MyInteger   ob) {return val*ob.val;}
	double divide(p179_MyInteger   ob) {return((double) val)/ob.val;}
	
	public static void main(String[]args) {
		p179_MyInteger ob1=new p179_MyInteger(), ob2=new p179_MyInteger(),
		ob3=new p179_MyInteger();
		ob1.val = 3; ob2.val =5; ob3.val=10;
		
		int x = ob1.add(ob3);
		System.out.println("결과1 : "+x);
		int y = ob2.add(ob1);
		System.out.println("결과2 : "+y);
	}
	
}
