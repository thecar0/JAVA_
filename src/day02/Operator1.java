package day02;

public class Operator1 {

	public static void main(String[] args) {
		// 변수 / 연산자
//		ctrl + /
		/* System.out.print() : 줄바꿈이 없는 출력
		 * System.out.printf() : 형식을 가지는 출력 (c 언어에서 주로 사용)
		 * printf 지시자 : %d(정수) %f(실수) %s(문자) %c(한글자) %n(줄바꿈)
		 * 
		 * 문자열 : " "  / 한글자 : ''  / 숫자는 따옴표 없음.
		 */
		
		
		System.out.println("Hello world@");
		System.out.print("abc");
		System.out.print("123");
		System.out.println();  // 줄바꿈 역할
		System.out.printf("내 나이는 %d살 입니다.%n", 20);
		
		int age = 20;
		String name = "영이";
		System.out.printf("내 나이는 %d살 입니다.%n", age);
		System.out.printf("내 이름은 %s이고, 나이는 %d살 입니다.%n", name,age);
		
		System.out.println("내 이름은 "+name+"이고, 나이는 "+age+"살 입니다.");
		//출력 단축언어 syso ctrl+space = 자동완성
		System.out.println();
		
		/* 변수 : 리터럴 값을 담을 저장공간을 정의
		 * 타입 변수명; = 변수 선언
		 * 타입변수명 = 값; = 변수 선언하고 값 저장
		 * 
		 * 변수는 중복 선언 불가능
		 * 변수의 값을 바꾸는건 가능 (덮어쓰기)
		 * 
		 * 변수의 스코프 : 변수가 허용되는 범위 
		 */
		
		int a = 100;
		a = 50;
		
		{
			int b = 100; 
			System.out.println(b);
			// {}안에는 밖에 있는 변수 참조 가능.
			// 따로 밖에 c 변수 만들어 놓으면 사용 가능.
			
			
		}
		
		
			
	}

}
