package lagacy;

public class p267_Shape {
	
	private int x, y;
	
	public p267_Shape() 
	{
		this(0,0);
		System.out.println("Shape 생성자");
	}
	
	public p267_Shape (int xloc, int yloc)//5
	{
		x= xloc; y=yloc;//6
		System.out.println("Shape 생성자");//7
	}
	
}

class p267_Rectangle extends p267_Shape {
	private int width, height;
	public p267_Rectangle() //1
	{
		this(0 ,0 , 0, 0);//2
		System.out.println("Rectangle 생성자");//10
	}
	
	public p267_Rectangle (int x, int y, int w, int h) //3
	{
		super (x, y);//4 (super가 p267_Shape으로 튀지 않도록 유인하는 역할)
		width = w; height = h;//8
		System.out.println("Rectangle 생성자");//9
	}
	
}