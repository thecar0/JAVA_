package day11;

public class Super02 {

	public static void main(String[] args) {
		/* 
		 */
		Dog d = new Dog("차몽" , "개과");
		d.printInto();
		d.howl();
		
		System.out.println("-------------");
		
		Cat c = new Cat("치즈" , "고양이과");
		c.printInto();
		c.howl();
		
		System.out.println("-------------");
		
		Tiger t = new Tiger("호랑" , "고양이과");
		t.printInto();
		t.howl();
		

	}

}


class Dog extends Animal{
	public Dog(String name, String category) {
		super(name, category); //부모 생성자 호출
		
//		super.setName(name);
//		super.setCategory(category);
	}

	@Override
	public void howl() {
		//부모의 메서드 내용
		super.howl();
		System.out.println("멍멍");
	}
	
	
}
class Cat extends Animal{
	public Cat(String name, String category) {
		super(name, category);
	}
	public void howl() {
		super.howl();
		System.out.println("야옹");
	}
}

class Tiger extends Animal{
	public Tiger(String name, String category) {
		super(name, category);
	}
	public void howl() {
		super.howl();
		System.out.println("어흥");
	}
}



class Animal{ //부모
	private String name;     //이름
	private String category; //종
	
	//생성자 (상속 안됨) 
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	//출력
	public void printInto() {
		System.out.println("이름 : "+name+"("+category+")");
	}
	
	//출력(울음소리)
	public void howl() {
		System.out.println("--"+name+"의 울음 소리--");
	}
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}