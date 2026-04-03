package day12;

public class Abstract01 {

	public static void main(String[] args) {
		Dog d = new Dog ("뽀삐", "개과");
		d.printInfo();
		d.howl();
		d.eating("소고기");
		
		//Animal a = new Animal();  추상클래스는 객체 생성 불가
		
		Cat c = new Cat ("치즈","고양이과");
		c.printInfo();
		c.howl();
		c.eating("츄르");
		
		Tiger t = new Tiger("호랑","고양이과");
		t.printInfo();
		t.howl();
		t.eating("생고기");

	}

}
//호랑이
class Tiger extends Animal {
	
	public Tiger(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	void howl() {
		System.out.println(name+"어흥");
	}

	@Override
	void eating(String eat) {
		super.eat = eat;
		System.out.println(name+eat+"좋아해요");
	}
	
}

// 고양이
class Cat extends Animal {
	
	public Cat(String name, String category) {   //상속받은 멤버변수의 접근제어자가 protected여서
		super.name = name;                       //this도 가능 (private으로 안만들어 놓아서)
		super.category = category;
	}

	@Override
	void howl() {
		System.out.println(name+"야옹");	
	}

	@Override
	void eating(String eat) {
		super.eat = eat;
		System.out.println(name+eat+"좋아해요");
		
	}
	
}

// 강아지
class Dog extends Animal{
	private String eat;
	
	//생성자
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	void howl() {
		System.out.println(name+"멍멍");
		
	}

	@Override
	void eating(String eat) {
		this.eat = eat;
		System.out.println(name+eat+"좋아해요");
	}
	
}

//abstract : 상속 용도로 사용
abstract class Animal {
	public String eat;
	protected String name;
	protected String category;
	
	public void printInfo() {
		System.out.println("이름:"+name+"("+category+")");
	}
	
	//추상메서드
	abstract void howl();
	
	abstract void eating(String eat);
}
