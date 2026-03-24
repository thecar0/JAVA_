package day07;

public class Method03 {
	/* 메서드 정의 => 기능을 정의하는 역할 (함수)
	 * 접근제어자 리턴타입 메서드명(매개변수){
	 * 구현;
	 * }
	 * - public : 누구나 접근가능
	 * - 리턴타입 : 기능을 구현 후 결과로 반환할 값의 타입
	 * - 매개변수 : 기능을 구현하기 위해 외부에서 받아와야하는 값
	 * - 베서드명 : 의미있게 소문자로 작성
	 */
	public int x(int num1, int num2) {
		return num1*num2;
	}
	
	public double z(int num1, int num2) {
		if(num2 == 0) {
			return -99999999;
		}
		return num1/(double)num2;                //double 변환
	}
	
	public int y(int num1, int num2) {
		if(num2 == 0) {
			return -99999999;
		}
		return num1%num2;
	}
	
	public static void main(String[] args) {
		// 메서드 실행
		/* 1. 클래스로 객체를 정의 클래스명 객체명 = new 클래스명();
		 * 2. 객체명으로 메서드 호출
		 */
		//다른클래스에서 정의한 메서드 호출가능
		
		int num1 = 10;
		int num2 = 0;
		
		//두수의 사칙연산의 결과를 메서드로 호출하여 출력
		Method01 me01 = new Method01();
		int s = me01.sum2(num1, num2);
		int m = me01.sub(num1, num2);
		
		Method03 me03 = new Method03();
		int x = me03.x(num1, num2);
		
		// num2 == 0일때 처리
		double z = me03.z(num1, num2);  //double 변환
		int y = me03.y(num1, num2);
		
		if(z == -99999999 || y == -99999999) {
			System.out.println("x");
		}else {
			System.out.println(s +" "+ m +" "+ x +" "+ z +" "+ y);
		}
		
		
		
		
	

	}

}
