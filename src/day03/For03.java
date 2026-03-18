package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 1~10까지의 수 중 랜덤 수를 5개 출력
		// 중복 가능.
		/* for = 반복문 (랜덤수 출력*5)
		 * 랜덤수 : 1~10 범위중 랜덤수
		 */
		
		for(int i=1; i<=5; i++) {
			System.out.println((int)(Math.random()*10)+1); 
			//옆으로 나오게 하려면 ln지우고 +1 옆에 +" "써주면 됨
			//옆으로 나오게 했으면 꼭 한칸 띄우기
		}
		
		
		//구구단 출력 2단
//		int dan = 2;
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan +"*" + i +"=" +(i*dan));
//		}
		
		//1~9
//		int dan = (int)(Math.random()*9)+1;
//		for(int i=1; i<=9; i++) {
//			System.out.println(dan +"*" + i +"=" +(i*dan));
//	    }
		
		//내가 입력한 구구단
		Scanner scan = new Scanner(System.in);
		
		System.out.println("단 입력>");
		int dan = scan.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(dan +"*" + i +"=" +(i*dan));
	    }
		
		scan.close();
		
		

				
				
				
				
				
				
				
				
				
				
				
				
	}

}
