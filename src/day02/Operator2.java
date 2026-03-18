package day02;

public class Operator2 {

	public static void main(String[] args) {
		// 변수의 기본 자료형 8개
		/* 정수 byte, short, int, long, char
		 * 실수 float, double
		 * 논리 boolean
		 * 
		 * 연산자 
		 * 산술 : + - * / % (나머지)
		 * 대입 : = += -= ....
		 * =을 기준으로 오른쪽에 있는 값을 왼쪽 변수에 저장
		 * 왼쪽 값은 반드시 변수여야함.
		 * 
		 * ex)
		 * int a = 1;
		 * a = b;
		 * 1 = a; ( x )
		 * a +=b; = a = a+b;
		 */
		
		int a = 1;
		int b = 5;
		System.out.println(a);
		System.out.println(b);
		
		a += b; //
		System.out.println(a);
		
		//증감 연산자 : ++(1증가) --(1감소)
		
		//(a++) a를 출력하고, 그 후에 1 증가
		//(++a) 1 증가 후 a 출력
		
		//산술 : + - * / % (나머지)
		/* 나누기 ( / , % )
		 * 정수 / 정수 = 정수
		 * 정수 / 실수 = 실수 ( 10 / 3.0 =  )
		 *
		 * 정수 / 0 = 오류
		 * 실수 / 0 = infinity
		 */
		
		System.out.println(10/3);
		System.out.println(10/3.0);
		
		/* 비교연산자 : 비교연산의 결과는 반드시 true / false
		 * >=(이상) >=(이하) >(초과) <(미만) ==(같다) !=(같지 않다)
		 * 
		 * 논리연산자 : &&(and) 
		 * a && b  a 조건과 b 조건이 모두 다 참이여야 t
		 * !a  a 조건의 결과에 반대값을 출력
		 */
		
		System.out.println(3>2);
		
		// 연결연산자 : + (데이터의 결과가 문자일 경우에만 가능)
		int num1 = 90;
		int num2 = 80;
		
		System.out.println("num1 + num2  = "  +(num1 + num2));
		System.out.println(num1 + " + " + num2+" = "+(num1 + num2));
		
		
		// 조건선택연산자
		System.out.println(num1>num2 ? "num1이 큽니다." : "num2가 큽니다.");
		
		//조건식 ? true : 조건식 ? true false
		
		System.out.println(10 % 2);
		
		/* number 변수를 선언하고, 값을 입력한 후
		 * number의 수가 짝수인지 홀수인지 판별
		 * 
		 */
		int number = 3;
		System.out.println(number % 2 == 0  ? "짝수":"홀수" );
		
		

	}

}
