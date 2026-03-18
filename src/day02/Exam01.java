package day02;

public class Exam01 {

	public static void main(String[] args) {
		//  카페에 제출
		/* 국어, 영어, 수학 점수를 변수로 선언 => 값을 저장
		 * 합계와 평균을 출력
		 * 평균에 소수점은 표시
		 * 조건선택연산자를 이용하여
		 * 평균이 80점 이상이면 합격, 아니면 불합격 출력
		 */
		
		int kor = 550;
		int eng = 80;
		int mat = 90;
		
		System.out.println("kor + eng + mat = " +(kor+eng+mat));
		System.out.println((kor+eng+mat) + " / 3" + " = " + (230 / 3.0));
		
		int A = (kor+eng+mat) /3;
		
		System.out.println(A >= 80 ? "합격" : "불합격" );
		
		//----------------
		
		/*
		 * int sum 합
		 * syso (sum) 
		 * double avg 
		 */
		
		if(A >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		System.out.println("------------");
		
		if(A >= 80 ) {
			System.out.println("합격");
		}else if (A >= 60) {
			System.out.println("통과");
		}else {System.out.println("불합격");}
		
		System.out.println("------------");
		
		
		if(A < 0 || A > 100) {
			System.out.println("오류");
		} else if(A >= 80 ) {
			System.out.println("합격");
		}else if (A >= 60) {
			System.out.println("통과");
		}else {System.out.println("불합격");}
		
		
		if(A < 0 || A > 100) {
			System.out.println("오류");
		}else {
			if(A >= 80 ) {
				System.out.println("합격");
			}else if (A >= 60) {
				System.out.println("통과");
			}else {System.out.println("불합격");}
		}

	}

}
