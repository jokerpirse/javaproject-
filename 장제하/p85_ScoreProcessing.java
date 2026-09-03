package 장제하;

import java.util.Scanner;

public class p85_ScoreProcessing {

	public static void main(String[] args) {

		int val, cnt = 0, xum = 0, max = -1, min = 101, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("0과 100사이의 값을 입력 (그외의 값을 입력하면 종료):");
		val = sc.nextInt();

		System.out.println();

		while (val >= 0 && val <= 100) {
			cnt = cnt + 1;
			sum = sum + val;
			if (val > max)
				max = val;
			if (val < min)
				min = val;
			System.out.println("0과 100사이의 값을 입력(그 외의 값을 입력하면 종료):");
			val = sc.nextInt();
		}
		if (cnt != 0) {
			System.out.println("평균:" + (double) sum / cnt);
			System.out.println("최댓값:" + max);
			System.out.println("최솟값:" + min);
		}

		else {
			System.out.println("아무런 값도 입력되지 않았습니다");
		}
		sc.close();
	}
}
