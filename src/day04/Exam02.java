package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/* 생년을 숫자로 입력받아 어린이(13), 청소년(19), 어른으로 구분
		 * 어린이 5,000원 청소년 7,000원 어른 10,000원
		 * 
		 * ex) 2017 입력 => 9세 어린이입니다. 입장료는 5,000원 입니다.
		 * 생년을 기준으로 2026 - 2017
		 * 
		 * 생년의 기준은 1900~2026 유효한 값
		 * 기준이 넘어간 데이터는 다시 입력하라고 요청
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			
			int a = scan.nextInt();
			int age = (2026 - a);
			
			if (2026 < a || a < 1900) {
				System.out.println("다시 입력해 주세요(1900~2026)");
			}else {
				if (age <= 13) {
					System.out.println(""+age+"세 어린이 입니다. 입장료는 5,000원 입니다.");break;
				}else if (age <= 19) {
					System.out.println(""+age+"세 청소년 입니다. 입장료는 7,000원 입니다.");break;
				}else {
					System.out.println(""+age+"세 어른 입니다. 입장료는 10,000원 입니다.");break;
				} //age 앞에 "+ "는 생략 가능 (age+)
			} 		
		}
		//------------------------나
	
		
		
		
/*		System.out.println("생년을 입력(1900~2026) >");
		int birth = scan.nextInt();
		int today = 2026;
		
		while(birth < 1900 || birth > today) {
			System.out.println("유효하지 않은 연도입니다.");
			System.out.println("다시 입력하세요 >");
			birth = scan.nextInt();
		}
		
		// 연도가 맞게 입력된 경우
		int age = today - birth;
		//System.out.println(age);
				
		if(age <= 13) {
			System.out.println(age+"세 어린이입니다. 입장료는 5000원 입니다.");
		}else if(age <=19) {
			System.out.println(age+"세 청소년입니다. 입장료는 7000원 입니다.");
		}else {
			System.out.println(age+"세 어른입니다. 입장료는 10000원 입니다.");
		}
*/				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
