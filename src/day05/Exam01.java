package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위 바위 보
		/* 컴퓨터와 유저가 가위바위보 게임 진행
		 * 가위 = 0, 바위 = 1, 보 = 2
		 * 컴퓨터는 랜덤으로 0 1 2 중 선탱
		 * 유저도 input 0 1 2 선택
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int com = (int)(Math.random()*3); 
		//System.out.println(com);
		System.out.println("0.가위 1.바위 2.보 선택하세요 >");
		int me = scan.nextInt();
		
		while(me >= 3) {
			System.out.println("메뉴를 다시 입력하세요");
			me = scan.nextInt();
		}
		
		if(com == me) {
			System.out.println("무승부");
		}else if (com == 0) {
			switch(me) {
			case 1 : System.out.println("이겼습니다");break;
			case 2 : System.out.println("졌습니다");break;
			}
		}else if (com == 1) {
			switch(me) {
			case 0 : System.out.println("졌습니다");break;
			case 2 : System.out.println("이겼습니다");break;
			}
		}else if (com == 2) {
			switch(me) {
			case 0 : System.out.println("졌습니다");break;
			case 1 : System.out.println("이겼습니다");break;
			}
		}
		
			
		scan.close();
		
		

	}

}
