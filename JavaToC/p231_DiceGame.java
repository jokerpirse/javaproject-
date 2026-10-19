package JavaToC;

import java.util.Random;
import java.util.Scanner;

class DiceGame {
	//private int diceFace;
	//private int userGuess;

	Random generator = new Random();
	Scanner sc = new Scanner(System.in);
	
	private int RollDice() {
		int diceFace;
		diceFace = generator.nextInt(6) + 1;
		return diceFace;
	}

	private int getUserInput(String prompt) {
		int r;

		System.out.println(prompt);
		r = sc.nextInt();

		return r;
	}
	
	private void checkUserGuess(int diceFace, int userGuess) {
		int trytime=1;
		boolean result;
		if (diceFace == userGuess)
		{
			System.out.println("맞았습니다.");
		    System.out.println(trytime+"번 시도하셨습니다.");
		    result= true;
		}
		   
		else 
		{
			System.out.println("다시 입력하십시오.");
			result=false; 
			trytime=trytime+1;
		}
	}

	public int startPlaying() {
		int answer=RollDice();
		int userGuess = getUserInput("예상 값을 입력하십시오. : ");
		checkUserGuess(userGuess , answer);
		 int trytime = 1;

	        while (userGuess != answer) {
	            userGuess = getUserInput("예상 값을 입력하십시오. : ");
	            trytime++;

	            if (userGuess == answer) {
	                System.out.println("맞았습니다.");
	                System.out.println(trytime + "번 시도하셨습니다.");
	            }
	            else {
	                System.out.println("다시 입력하십시오.");
	            }
	        }
		
		return userGuess;
	}
}

public class p217_DiceGame {
	public static void main(String[] args) {
		DiceGame mygame = new DiceGame();
		mygame.startPlaying();
	}

	private void startPlaying() {
		// TODO Auto-generated method stub
		
	}
}
