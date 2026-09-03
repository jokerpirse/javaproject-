package 장제하;

import java.util.Random;

public class p140_MatixAdd {
	public static void main(String[]args) {
		int [][]m1=new int[3][3], m2= new int[3][3], m3=new int[3][3];
		//가로 3 세로 3의 2차원 배열 m1, m2, m3를 생성
		Random rnd = new Random();
		
		
		//행렬 초기화
		for (int i=0; i<m1.length; i++) {
			//m1의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
			for (int j = 0; j<m1[i].length; j++) {
				//m1의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
				m1[i][j]=rnd.nextInt(100);
				//0~99까지의 아무 숫자를 m1 배열의 빈칸에 하나하나씩 넣기
				m2[i][j]=rnd.nextInt(100);
				//0~99까지의 아무 숫자를 m2 배열의 빈칸에 하나하나씩 넣기
			}
		}
		
		//행렬 덧셈
		for (int i=0; i<m3.length; i++) {
			//m3의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
			for (int j=0; j<m3[i].length; j++) {
				//m3의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
				m3[i][j]= m1[i][j]+m2[i][j];
				//m3 배열의 빈칸에 m1 배열과 m2배열을 더한 값을 대입
				//m3 (0,0)칸에 m1(0,0)위치의 값과 dm2(0,0)위치의 값을 더한 값을 대입
			}
		}
		
		//행렬 출력
		for (int i = 0; i<m1.length; i++) {
			//m1의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
			for (int j=0; j<m1[i].length; j++) {
				//m1의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
				System.out.print(m1[i][j]+" ");
				//배열 m1을 (0,0)위치의 값부터 (3,3)위치의 값까지 출력한다.
			}
			System.out.println();
			// 빈칸 한 줄 만들기
		}
		System.out.println();
		for (int i = 0; i< m2.length; i++) {
			//m2의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
			for (int j=0; j<m2[i].length; j++) {
				//m2의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
				System.out.print(m2[i][j]+" ");
				//배열 m2를 (0,0)위치의 값부터 (3,3)위치의 값까지 출력한다.
			}
			System.out.println();
			// 빈칸 한 줄 만들기
		}
		System.out.println("=============");
		//=============를 출력한다
		for (int i = 0; i< m3.length; i++) {
			//m3의 길이 만큼 반복 (3번), new int[3][3]에서 앞에 위치한 [3]의 길이 표현
				for (int j =0; j < m3[i].length; j++) {
					//m3의 길이 만큼 반복 (3번), new int[3][3]에서 뒤에 위치한 [3]의 길이 표현
					System.out.print(m3[i][j]+" ");
					//배열 m3를 (0,0)위치의 값부터 (3,3)위치의 값까지 출력한다.
				}
				System.out.println();
				// 빈칸 한 줄 만들기
			}
	}
}
