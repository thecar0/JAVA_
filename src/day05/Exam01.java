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
		
/*		
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
*		
		//-----------------------------나
		
		String[] choice = {"가위" , "바위" , "보"}; 
		
		// 0~2 사이의 값만 가능
		System.out.println("가위바위보 게임 시작>");
		
		int comNum = (int)(Math.random()*3); //0부터 3개의 숫자를 랜덤으로 출력
		System.out.println("컴퓨터 결정 완료!!");
		
		System.out.println("가위(0) 바위(1) 보(2) 중 선택>");
		int myNum = scan.nextInt();
				
		// 승패 비교
		if(myNum <0 || myNum >2) {
		   System.out.println("입력오류입니다.");return; //main 메서드 종료 구문
		}
		
		String result = "";
		
		if (comNum == myNum) {
			result = "무승부";
		}else {
			if(myNum == 0) {
			    result = (comNum == 2) ? "유저 승" : "유저 패";
			}else if(myNum == 1) {
				result = (comNum == 0) ? "유저 승" : "유저 패";
			}else {
				result = (comNum == 1) ? "유저 승" : "유저 패";
			}
		}
*/		
        String[] choice = {"가위" , "바위" , "보"}; 
		
		System.out.println("가위바위보 게임 시작>");
		
		while(true) {
			
			int comNum = (int)(Math.random()*3); //0부터 3개의 숫자를 랜덤으로 출력
			System.out.println("컴퓨터 결정 완료!!");
			
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) 중 선택>");
			int myNum = scan.nextInt();
			
			if (myNum == 3) {
				System.out.println("종료");break;
			}
			
			// 승패 비교
			if(myNum <0 || myNum >3) {
				System.out.println("입력오류입니다.다시 입력해주세요"); //main 메서드 종료 구문
				//myNum = scan.nextInt(); 이걸 쓰려면 while문으로 바꿔야함
				continue;
			}
			
			String result = "";
			
			if (comNum == myNum) {
				result = "무승부";
			}else {
				if(myNum == 0) {
					result = (comNum == 2) ? "유저 승" : "유저 패";
				}else if(myNum == 1) {
					result = (comNum == 0) ? "유저 승" : "유저 패";
				}else {
					result = (comNum == 1) ? "유저 승" : "유저 패";
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		

	}

}
