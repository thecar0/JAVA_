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
		
		int arr[] = new int[3]; //비교군을 안만듦
			
		
		for(int i = 0; i < arr.length-1; i++) {     
			
			int com = (int)(Math.random()*9); //*10해야 0~9까지 
			
			arr[i] = com; //확인 전에 값을 넣어버려서 오휴
			
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
			for(int i = 0; i < arr.length;i++) {    //자리, 숫자 따로따로 비교하고 strike랑 ball올려야함
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
		
		//----------------------------(미완)
		
		
		int comNum[] = new int[3];
		int userNum[] = new int[3];
		
		
		
		// comNum 를 중복 없이 생성 (랜덤 0~9)
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(comNum));
		
		// userNum String으로 받아서 배열로 split "" => 한글자씩 잘라 배열로 리턴
		// 숫자로 변환
		while(true) {
			//userNum 입력
			System.out.println("숫자입력>");
			String myNum = scan.next();
			
			//한글자씩 나누어 배열로 리턴
			String[] myNumStr = myNum.split("");
			for(int i=0; i<myNumStr.length; i++) {
				userNum[i] = Integer.parseInt(myNumStr[i]);
			}
			System.out.print("user :"+Arrays.toString(userNum));
			
			// 비교
			int stk=0; //ball=0;
			
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<userNum.length; j++) {
					if(comNum[i] == userNum[j] && i == j) {
						// 값이 같고, 위치도 같다면 ...
						stk++;
					}else if(comNum[i] == userNum[j] && i != j) {
						// 값만 같다면 ...
						ball++;
					}
				}
			}
			
			// 출력
			if(stk==0 && ball==0) {
				System.out.println("=> out!!");
			}else {
				System.out.println("=> "+stk+"s "+ball+"b");
			}
			
			if(stk==3) {
				System.out.println("정답!!");
				break;
			}

		}
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
