package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 야구게임 
		 * 컴퓨터가 랜덤으로 3자리의 숫자 생성 (0~9) => 중복X
		 * => 배열로 저장
		 * 유저가 3자리를 맞추는 게임.
		 * 자리와 숫자가 일치하면 strike
		 * 자리는 불일치 하지만 숫자가 다른 위치에 있다면 ball (count)
		 * 자리도 숫자도 없으면 out
		 * 
		 * ex) com : 1 2 3
		 * user : 1 5 9   => 1s
		 * user : 6 5 8   => out
		 * user : 1 7 4   => 1s
		 * user : 1 3 2   => 1s 2b
		 * user : 1 2 3   => 3s   => 정답 (종료)
		 * 
		 * user : 3 4 5   => 1b
		 */
		
		
		
		int arr[] = new int[3];
			
		
		for(int i = 0; i < arr.length-1; i++) {     
			int com = (int)(Math.random()*9);
			
			arr[i] = com;
			for(int j = i+1; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("3개의 숫자를 입력하세요 >");
										
		Scanner scan = new Scanner(System.in);
		
		int user = scan.nextInt();
		
		if(user < 0 || user > 9) {
			System.out.println("입력 오류입니다. 3개의 숫자를 다시 입력하세요 >");
			user = scan.nextInt();
		}
		
		int strike = 0;
		int ball = 0;
			for(int i = 0; i < arr.length;i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i == j) {
					strike++;
				}else {
					ball++;
				}
			}
		}
		
		if (strike != 3) {
			System.out.println(strike +"strike");
		}else if (strike == 3) {
			System.out.println("3 strike");
		}else if (ball != 0) {
			System.out.println(ball+"ball");
		}
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
