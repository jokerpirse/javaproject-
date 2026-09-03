package 함수공부;

import java.util.Random;

public class 함수공부0825_배열덧셈 {

	public static void reset(int[][] mf, int[][] ms) {
		// 행렬 초기화
		Random rnd = new Random();
		for (int i = 0; i < mf.length; i++) {
			// m1의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
			for (int j = 0; j < mf[i].length; j++) {
				// m1의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
				mf[i][j] = rnd.nextInt(100);
				// 0~99까지의 아무 숫자를 m1 배열의 빈칸에 하나하나씩 넣기
				ms[i][j] = rnd.nextInt(100);
				// 0~99까지의 아무 숫자를 m2 배열의 빈칸에 하나하나씩 넣기
			}
		}
	}

	public static void plus(int[][] mt, int[][] mf, int[][] ms) {
		// 행렬 덧셈
		for (int i = 0; i < mt.length; i++) {
			// m3의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
			for (int j = 0; j < mt[i].length; j++) {
				// m3의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
				mt[i][j] = mf[i][j] + ms[i][j];
				// m3 배열의 빈칸에 m1 배열과 m2배열을 더한 값을 대입
				// m3 (0,0)칸에 m1(0,0)위치의 값과 dm2(0,0)위치의 값을 더한 값을 대입
			}
		}
	}

	public static void output(int [][] mn) {
		for (int i = 0; i < mn.length; i++) {
			// m3의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
			for (int j = 0; j < mn[i].length; j++) {
				// m3의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
				System.out.print(mn[i][j] + " ");
				// 배열 m3를 (0,0)위치의 값부터 (3,3)위치의 값까지 출력한다.
			}
			System.out.println();
			// 빈칸 한 줄 만들기
		}
	}
	
	
	
	public static void main(String[] args) {
		int[][] m1 = new int[3][3], m2 = new int[3][3], m3 = new int[3][3];
		// 가로 3 세로 3의 2차원 배열 m1, m2, m3를 생성

		reset(m1, m2);
		
		plus(m3,m1, m2);
	

		// 행렬 출력
		output(m1);
		System.out.println();
		output(m2);
		System.out.println("=============");
		// =============를 출력한다
		output(m3);
	}
}
