package 장제하;

public class p110_MultilplicationTable {
	public static void main (String[]args) {
	
		int dan, index;
		
		for (dan=2; dan<=9;dan++) {
			System.out.println(dan+"단");
			if (dan==5)continue;
			for (index=1; index<=9; index++) {
				System.out.println(dan+"*"+index+"="+dan*index); 
				
			}
			System.out.println("");
		}
	}

	private static boolean dan(int i, int j, int k, int l, int m, int n, int o, int p) {
		// TODO Auto-generated method stub
		return false;
	}
}
