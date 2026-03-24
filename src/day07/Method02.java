package day07;

public class Method02 {
	
	// 메서드 생성 위치
	
	/* 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	 * 매개변수 : 두 정수 => 
	 * 리턴타입 : int
	 * 매서드 명: sum
	 */
	
	public int sum(int num1, int num2) {
		return num1 + num2; //리턴은 하나만 있어야함
	}
	
	/* 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 * 매개변수 : 두 정수 => 
	 * 리턴타입 : 없음. => void
	 * 메서드명 : sum2
	 */
	
	public void sum2(int num1, int num2) {
		// 메서드 내에서 다른 메서드를 호출할 수 있다.
		
		
		int hap = num1 + num2;
		System.out.println(hap);
						
	}
	
	/* 매개변수가 없는 케이스 / 리턴이 있는 케이스
	 * 합을 출력
	 */
	public int sum3() {
		// 메서드 내부에서 새로운 값을 생성 후 리턴
		int num1 = 100;
		int num2 = 200;
		return num1 + num2;
	}
	
	/* 매개변수가 없는 케이스 / 리턴이 없는 케이스
	 * 합을 출력
	 */
	public void sum4() {
		int num1 = 1000;
		int num2 = 2000;
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 50;  //지역변수 (일반변수)
		int num2 = 40;                              //이거 안쓰고 sum(50,40)에 넣어도 됨
		
		Method02 me01 = new Method02();
		int sum = me01.sum(num1, num2);  // (매개변수) 일반변수를 매개변수로 전달
		
		System.out.println(sum);
		
		me01.sum2(num1, num2); //내부 메서드에서 출력 완료
		
	}
	
	// 메서드 생성 위치

}
