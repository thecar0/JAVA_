package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지의 랜덤수 하나를 컴퓨터가 생성 => user 모름
		// 유저가 맞추는 게임
		// ex) 컴퓨터가 랜덤수를 생성했습니다. (23)
		// 입력 > 10 up!
		// 입력 > 20 up!
		// 입력 > 30 down!
		// 입력 > 25 down!
		// 입력 > 23 정답!
		
		// 랜덤수 > 유저수 up!
		// 랜덤수 < 유저수 down!
	
		
		Scanner scan = new Scanner(System.in);
		
		
		//----------나
//		int random = (int)(Math.random()*50)+1;
//		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
//		int c = scan.nextInt(); //입력했을때 저장하는 방법
//		while(true) {
//			if (c < random) {
//				System.out.println("up!");
//			}if (c > random) {
//				System.out.println("down!");
//			}if (c == random) {
//				System.out.println("정답!");
//				break;
//			}
//			c = scan.nextInt();
//		}
		//------------나
		
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
		int c = scan.nextInt(); //입력했을때 저장하는 방법
		int count =1; //카운팅 할 변수 필요함
		while(true) {
			if (c < random) {
				System.out.println("up!");
			}if (c > random) {
				System.out.println("down!");
			}if (c == random) {
				System.out.println("정답!");
				break;
			}if(count == 5) {
				System.out.println("Game Over!");break;
			}
			c = scan.nextInt();
			count++; //계속 입력 했을때 카운트 올라가는 장치
		}
		
/*		int r = (int)(Math.random()*50)+1;
		int u = 0;
		int count = 0;
		
		while(true) {
			System.out.println("입력>");
			u = scan.nextInt();
			count++;
			
			if(r > u) {
				System.out.println("up");
			}else if(r < u) {
				System.out.println("down");
			}else {
				System.out.println("정답");break;
			}
			if(count == 5){
			syso (횟수 초과 종료);
			syso (정답은 "+r+"입니다.);break;
		}
		
		System.out.println("게임종료");
*/		
		
		
		scan.close();
		
		}
}
