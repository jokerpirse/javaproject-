package 장제하;

import java.util.Random;

public class p41_Modulus {
	public static void main(String[] args) {
		int x, y;

		Random r = new Random();

		x = r.nextInt(1000); //0부터 999까지를 호출한다
		y = x % 101; // 0과 100 사의의 값으로
		System.out.println(x + "=>" + y);

		x = r.nextInt(1000);
		y = (x % 100) + 1; // 1과 100 사의의 값으로
		System.out.println(x + "=>" + y);
	}

}
