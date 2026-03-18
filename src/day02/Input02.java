package day02;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// 국어, 영어, 수학점수를 입력받아
		// 합계와 평균 pass 여부를 출력
		// pass 여부는 평ㅇ균이 80 이상이면 합격 / 불합격
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어>");
		int kor = scan.nextInt();
		
		System.out.println("영어>");
		int eng = scan.nextInt();
				
		System.out.println("수학>");
		int math = scan.nextInt();
		
		//국어 영어 수학의 값이 0보다 작거나, 100보다 크면
		//잘못된 점수 입니다.
		
		
		//if ( || ) ||--- 이런식으로 한번에 가능
		//else 0r return(나를 실행하고 있는 메서드를 종료) 사용
		//입력 할때마다 잘못된입력 값입니다. 줄수도 있음 (불러온 값 밑에)
		
		
		//--- 나
		if(kor < 0 || kor > 100) {
			System.out.println("잘못된 점수입니다.");
		}else if(eng < 0 || eng > 100) {
			System.out.println("잘못된 점수입니다.");
		}else if(math < 0 || math > 100){
			System.out.println("잘못된 점수입니다.");
		}else {

			int sum = kor + eng + math;
			
			double avg = sum /3;
			
			System.out.println(sum);
			System.out.println(avg);
			
			if(avg >= 80) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
		//---
		
		
		
		
		
		
		
		
		scan.close();

	}

}
