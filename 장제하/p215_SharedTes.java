package 장제하;

public class p215_SharedTes {  //class p.215_SharedTes가 장제하 파일의 Outter class로 1개 더 있으면 충돌함
	private int sharedVariable=100;
	public int sharedConstant=100;
	
	
	
	public static void main(String[]args) {
		p215_SharedTes/*데이터 타입으로 쓰임*/ app/*app은 현재 변수 이름이다*/ = new p215_SharedTes();

		System.out.println("sharedConstant : "+app.sharedConstant);
		System.out.println("sharedVariable : "+app.sharedVariable);
		p215_SharedTes.A ob1=app.new A();
		ob1.updateData();
		p215_SharedTes.B ob2=app.new B();
		ob2.readData();
	}
	
	
	
	class A{  //class A가 장제하 파일에 1개 더 있어도 충돌하지 않음, 단 class p.215의 inner class로 class A가 하나 더 있으면 충돌함
		
		public void updateData() {
			System.out.println("sharedConstant : "+sharedConstant);
			sharedVariable=5; //메인에 있는 변수인 sharedVariable의 값을 바꿈
			
			System.out.println("sharedVariable : "+sharedVariable);
		}
	}
	
	class B{  //class B가 장제하 파일에 1개 더 있어도 충돌하지 않음, 단 class p.215의 inner class로 class B가 하나 더 있으면 충돌함
		public void readData() {
			sharedConstant=3;
			System.out.println("sharedConstant : "+sharedConstant);
			System.out.println("sharedVariable : "+sharedVariable);
			//class A에서 값을 받아 오는게 아니다. class a에서 메인의 값을 바꾸고 class b에서 main의 값을 가져오기 때문에 5가 출력된다.
		}
	}
}
