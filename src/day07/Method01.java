package day07;

public class Method01 {
	
	//메서드 선언 가능 위치
	//두 정수를 주면(매개변수) 합을 리턴하는 메서드
	//매개변수 : 두 정수 => (int num1, int num2)
	//메서드명 : sum
	//리턴타입 : 합 => 정수 => int
	
	public static int sum(int num1, int num2) {
		return num1 + num2;                           //메서드가 static
	}
	
	public int sum2(int num1, int num2) {
		return num1 + num2;                           //메서드가 static이 아님
	}
	
	//두 정수를 주면 차를 리턴하는 메서드
	public int sub(int num1, int num2) {
		return num1 - num2;                           //메서드가 static이 아님
	}
	

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 200;
		
		// static 메서드 호출 => 메서드가 static
		int hap = sum(num1, num2); //변수 명과 메서드 명이 같아도 상관없음
		System.out.println(hap);
		
		/*                 => 메서드가 static이 아닌경우
		 * 1. 클래스를 객체화 => new 클래스명
		 * 2. 객체로 메서드 접근
		 */
		Method01 me01 = new Method01();    //클래스를 객체화
		
		int hap2 = me01.sum2(num1, num2);  //객체로 메서드
		System.out.println(hap2);
		
		int cha = me01.sub(num1, num2);    //이미 클래스를 객체화 해서 바로 가능
		System.out.println(cha);
		
		
		
				
		/* class : 변수(가지는 요소), 메서드(해야하는 기능)
		 * main :  컴파일러가 실행을 위해 가장먼저 찾는 메서드
		 * 
		 * method 구조
		 * 접근제어자(public) 리턴타입(void) 메서드명(main) (매개변수){
		 * 구현;
		 * return (리턴타입과 일치하는 변수값); (필요할 때....)
		 * }
		 * 
		 * - 접근제어자 : 접근할 수 있는 주체의 제한 범위
		 * - 리턴타입 : 메서드가 실핻ㅇ된 후 반환 값 (반환할 값의 자료형) => 반드시 1개
		 *   - void : 리턴할 값이 없음을 의미
		 * - 메서드명 : 소문자로 시작 (여러의미를 붙여서 사용할 경울 카멜케이스 사용)
		 * - 매개변수 : 파라미터 기능을 하기위해 외부에서 반드시 들어와야 하는 값 => 여러개 가능(없어도 됨)
		 * - return : 리턴타입과 일치하는 변수값을 주고 메서드 종료
		 * 
		 * 메서드는 중복선언 안됨.
		 * 메서드 안에 또 다른 메서드가 있을수 없음.
		 * 메서드단위는 위치가 상관없음.
		 * 메서드 선언 위치
		 * - 클래스 안, 다른 메서드 밖
		 * - 메서드는 독립적 기능.
		 * - 메서드의 순서는 아무상관없음.
		 * - 메서드는 호출되어야만 실행됨.
		 * 
		 */
		

	}
	
	//메서드 선언 가능 위치

}
