package day09;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();                //기본생성자로 생성
		c.setName("canival");
		c.setYear(2026);
		
		c.print();
		
		c.Power();
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
				
		c.Power();
		c.print();
		
	System.out.println("----------");	
		
		Car c2 = new Car("sonata", 2026); //매개변수 생성자를 사용
		
		c2.print();
		
		c2.Power();
		
		
		c2.speedUp();
		c2.speedUp();
		
		c2.Power();                 // speed가 0일때만 파워를 조작 가능 확인
		
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();               // speed가 200위로 올라가는지 확인
				
		c2.speedDown();
		c2.speedDown();
		
		c2.Power();
		
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();
		c2.speedDown();             // speed가 0아래로 내려가는지 확인

		
		c2.Power();
		c2.print();
		
		c2.speedDown();             // power가 켜져있을때만 조작 가능 확인
	}

}

class Car{
	// 속도, 시동 , 이름, 연식
	
	// 멤버변수
	private String name;
	private int year;          //String으로 해도 상관없음. (연산이 필요하지 않아서)
	private int speed;         //속도
	private boolean power;     //시동
	
	// 생성자 (: 멤버변수 아래)
	/* 객체를 생성할때 (new) 초기값을 지정해주는 역할
	 * 기본생성자 : 컴파일러가 컴파일시 자동으로 제공
	 * - object = null / 숫자 = 0 / boolean = false
	 * - 다른 생성자가 존재하면 자동으로 주지 않음.
	 * - 기본생성자를 직접 만들수도 있음.
	 * - 생성자는 여러개 생성 가능 (생성자 오버로딩)
	 * - 생성자 오버로딩 조건 : 매개변수 개수가 다르거나, 타입이 달라야 가능.
	 * - 생성자를 만들때 꼭 기본생성자와 같이 생성해야됨.
	 * public 클래스명(매개변수{
	 *   멤버변수의 값을 설정
	 * }
	 * - 생성자는 리턴타입이 없는 메서드아 같은형태
	 * - 이름은 반드시 클래스명을 따른다.
	 */
	
	// 기본생성자
	public Car() {}
	
	// 매개변수가 있는 생성자
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}
	// 메서드
	// 1. 시동을 켜고 끄는 메서드
	// 꺼짐 => 켜짐 / 켜짐 => 꺼짐
	public void Power() {                  //내 멤변수 power를 f => t
		if(this.speed == 0) {
			power = !this.power;
		}else {
			System.out.println("속도를 0으로 맞추고 전원을 조작해주세요");
		}
	}
	
	// 2. 출력메서드
	// OFF / ON  , speed
	public void print() {
		System.out.println("전원 : "+(this.power ? "0N" : "OFF")+", 속도 : "+this.speed);
	}
	
	// 3. speedUp   (+20)
	public void speedUp() {
		if(this.power) {
			if(this.speed != 200) {
				this.speed = this.speed + 20;  //this.speed +=20;
				print();
			}else {
				System.out.println("속도를 더이상 올릴수 없습니다.");
			}
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	
	// 4. speedDown (-20)
    public void speedDown() {
    	if(this.power) {
    		if(this.speed != 0) {
    			this.speed = this.speed - 20;  //this.speed -=20;
    			print();
       		}else {
       			System.out.println("이미 정차중 입니다.");
       		}
		}else {
			System.out.println("전원을 켜주세요");
		}
	}

	//getter, setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setYear(int year) {   
		this.year = year;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {   
		this.speed = speed;                  //speed는 값을 갑자기 올릴 일이 없어서 없어도 됨
	}
	
	public boolean isPower() {
		return this.power;
	}
	
}
