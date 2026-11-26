package lagacy;
//클래스를 실행하게 되면 클래스가 생성되게 된다. 이때 생성자가 만들어진다.
//그리고 일정한 시간이 지나게 되면 클르새가 자연적으로 소멸한다. 이때 소멸자가 만들어진다.
public class p266_ProgramBasic {
	public static void main(String[] args) throws Throwable{
		Rectangle r;
		
		r=new Rectangle();
		
	}
}


class Shape	{
	private int x,y;
	
	public Shape() {
		System.out.println("Shape 생성자");
	}
	
	public void finalize() {
		System.out.println("Shape 소멸자");
	}
}


class Rectangle extends Shape	{
	private int width, height;

	public Rectangle() 
	{
		System.out.println("Rectangle 생성자");
	}
	
	public void finalize() {
		System.out.println("Rectangle 소멸자");
	}
}






