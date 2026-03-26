package day09;

public class Class01 {
	
	/* 클래스
	 * - 클래스의 구성요소 : 멤버변수, (멤버)메서드, 생성자
	 * - 멤버변수 > 생성자 > 메서드 순서로 구성
	 * 
	 * 클래스   - 객체를 생성하기 위한 설계도
	 * 객체     - 클래스로 부터 생성된 제품
	 * 메서드   - 제품의 기능
	 * 멤버변수  - 메서드에서 필요한 값들을 저장하는 속성
	 * 
	 * 프린트 클래스
	 * - 속성 (멤버변수) : 제조사, 제품명, 종류, 저장변수들...
	 * - 기능 (메서드)   : 인쇄, 복사, 스캔, 팩스...
	 * 
	 * 클래스는 다른 클래스와 겹치지 않게 정의
	 * 클래스 선언
	 * class 클래스명{
	 * 
	 * }
	 * - public class => 파일명과 같은 이름의 클래스에게만 부여
	 * 
	 * 객체 선언 > 생성
	 * 클래스타입 객체명; //선언만  => 값은 null
	 * 클래스타입 객체명 = new 클래스명() => new 생성자()
	 * 
	 * 매서드 사용방법(static이 안붙은 일반 메서드)
	 * - 같은 클래스에서 호출할 경우 => 메서드명();
	 * - 다른 클래스에서 호출할 경우 => 객체를 선언후 객체명.메서드명();
	 * 
	 * 접근제어자
	 * public    : 모두 사용가능
	 * protected : 나 + 패키지 + 자식클래스 사용가능 (상속시 사용)
	 * (default) : 나 + 패키지
	 * private   : 나
	 * 
	 * private < default < protected < public
	 * 
	 * - 하나의 파일 안에 하나의 클래스만 있을 수 있는건 아님.
	 * - 하지만 일반적으로 하나의 파일안에 하나의 클래스를 사용
	 * - 클래스에서 public을 붙일수 있는건 파일명 == 클래스명이 같을 경우만 가능.
	 * - 멤버변수, 메서드, 클래스 모두 접근제어자를 사용
	 * - 멤버변수는 private, 메서드는 public 선언이 일반적
	 * - 멤버변수가 private이면 다른 클래스에서 접근 불가능
	 * - 멤버변수를 다른 클래스에서 접근 가능하도록 별도메서드를 만들어 사용
	 *  (getter / setter)
	 * - getter : 가져올때 (사용할 떄) 
	 *            (외부에서 내 멤버변수에 접근하기 위해 필요 / 저장X / 리턴 필요)
	 * - setter : 저장할때 (변경할 때)
	 *            (외부에서 내 멤버변수의 값을 변경하기 위해 필요 / 저장O / 매개변수 필요)
	 */

	public static void main(String[] args) {
		// private을 붙이면 main에서 x,y 쓸수 없음 (사용하려면 g/s 만들어야함)
		Test t = new Test();
//		t.x = 10;        
//		t.y = 20;
		t.print();
		
//		System.out.println(t.x);
//		int x = t.x + t.y;
//		System.out.println(x);
		
		// getter / setter 설정 후
		t.setX(10);
		t.setY(20);
		
		// print메서드
		t.print();
		
		System.out.println(t.getX());
		System.out.println(t.getY());
		
		int x = t.getX() + t.getY();
		System.out.println(x);
		
		// print메서드 오버로딩
		t.print(10, 40);
	}

}

// 다른클래스 정의 (생성때 만든 이름과 같을때 public이 가능)
class Test{
	/* 멤버변수는 초기값을 설정하지 않아도 자동으로 설정
	 * 정수 => 0 / String => null
	 * 생성자가 기본 초기값을 생성
	 */
	
	/* 멤버변수는 모든 내 클래스의 멤버 메서드에 공용으로 사용가능.
	 * 매개변수로 전달 필요 X
	 * 매개변수와 멤버변수를 구분하기 위해서 내 멤버변수에는 this 키워드 붙임.(구분 키워드 써도되고 아니여도 된고)
	 */
	private int x;
	private int y;
	
	// print메서드
	// (x,y)
	public void print() {
		System.out.println("("+this.x+","+this.y+")");
	}
	
	// print메서드 오버로딩
	// x,y의 값을 받아서 그 값으로 출력하는 메서드
	public void print(int x, int y) {
		this.x = x; // == setX(x);
		this.y = y;
		System.out.println("("+this.x+" "+this.y+")");
	}
	
	// ( getter : 사용할때 / setter : 저장할때 ) 
	// 멤버변수 이름 앞에 get /set 멤버변수의 첫글자를 대문자로 변경
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
	public void setX(int x) {
		this.x = x;                //매게변수 값을 내 x에 넣겠다
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	
	
	
}