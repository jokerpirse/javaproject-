package 장제하;

class SharedData{
	private static int sharedVariable;
	public final static int sharedConstant = 100;
	public static int getSharedVariable() {return sharedVariable;}
	public static void setSharedVariable(int s) {sharedVariable = s;}
	
}

class A{
	public void updateData() {
		System.out.println("상수 : "+SharedData.sharedConstant);
		SharedData.setSharedVariable(5);
	}
}

class B{
	public void readData() {
		System.out.println("상수 : "+SharedData.sharedConstant);
		System.out.println(SharedData.getSharedVariable());
	}
}

public class p214_SheredTest {
	public static void main(String[] args) {
		A ob1=new A();
		ob1.updateData();
		B ob2=new B();
		ob2.readData();
	}
}
