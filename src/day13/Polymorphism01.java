package day13;

public class Polymorphism01 {

	public static void main(String[] args) {
		/* 다형성( Polymorphism ) - 다양한 객체로 형변환 가능
		 * - 하나의 클래스가 (부모객체) 여러자료형 (자식객체)으로 구현되어 실행되는 형태에서 사용
		 * - 코드는 같은데, 들어오는 객체에 따라 다른 실행결과를 얻을 수 있음.
		 * - 다형성을 잘 활용하면 유연, 확장성, 유지보수가 편리한 코드를 만들수 있음.
		 */
		
		//객체를 각자 생성해서 move메서드 호출 => 출력
		
		Dog d = new Dog();
		d.move();
		d.walk();
		
		Cat c = new Cat();
		c.move();

		Tiger t = new Tiger();
		t.move();
		t.hunting();
		
		Eagle e = new Eagle();
		e.move();
		e.flying();
		
		Human h = new Human();
		h.move();
		h.reading();
		
		Animal a = new Animal();
		a.move();
		
		System.out.println();
		
				
		System.out.println("-부모타입으로 자식객체를 생성-");
		//조상타입으로 자식 객체를 생성하는것 가능
		//조상타입으로 자식객체를 생성하면 자식의 고유 값은 사용 불가능
		Animal d1 = new Dog();
		d1.move();
		
		//자식객체로 조상타입을 생성하는건 불가능
		//Dog d2 = new Animal();
		
		
		//상속을 안받은 객체 불가능
		//Animal c1 = new Cat();

		Animal t1 = new Tiger();
		t1.move();
		
		Animal e1 = new Eagle();
		e1.move();
		
		Animal h1 = new Human();
		h1.move();
		
		//Animal 객체의 배열에 자식 객체 추가 가능
		Animal[] aniList = new Animal[5];
		int cnt = 0;
		aniList[cnt] = d1; cnt++;
		aniList[cnt] = t1; cnt++;
		aniList[cnt] = e1; cnt++;
		aniList[cnt] = h1; cnt++;  //animal 객체로 형변환 (업케스팅)
		
		System.out.println("--aniList 배열출력--");
		for(int i = 0; i <cnt; i++) {
			aniList[i].move();
		}
		
		//자식객체가 가지고 있는 고유값을 사용하려면 자신의 객체로 다운케스닝을 해야 사용가능
		Dog d_1 = (Dog)aniList[0]; //다운케스팅
		d_1.walk();
		
		//처음부터 에러는 안나지만 구현 불가능 Tiger 로만 가능
		//Dog t_1 = (Dog)aniList[1];
		//t_1.walk();
		
		System.out.println(aniList[1] instanceof Tiger);
	    System.out.println(aniList[1] instanceof Dog);
	    
	    for(int i = 0; i < cnt; i++) {
	    	if(aniList[i] instanceof Dog) {
	    		((Dog)aniList[i]).walk();
	    	}else if(aniList[i] instanceof Tiger) {
	    		((Tiger)aniList[i]).hunting();
	    	}else if(aniList[i] instanceof Eagle) {
	    		((Eagle)aniList[i]).flying();
	    	}else {
	    		((Human)aniList[i]).reading();
	    	}
	    }System.out.println();
	    
	    System.out.println("다형성 메서드 활용");
	    Polymorphism01 p1 = new Polymorphism01();
	    p1.moveAnimal(d_1);
	    
	    for(int i = 0; i < cnt; i++) {
	    	p1.moveAnimal(aniList[i]);
	    }
	}
	
	//main끝
	
	//각 객체의 move() 실행해주는 메서드
	public void moveAnimal(Human human) {
		human.move();
	}
	
	public void moveAnimal(Dog dog) {
		dog.move();
	}
	
	//다형성을 활용한 메서드
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}


class Human extends Animal{
	@Override
	public void move() {
        System.out.println("사람은 두 발로 걷습니다..");
	}
	
	public void reading() {
		System.out.println("사람은 책을 읽을 수 있습니다.");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
        System.out.println("독수리가 하늘을 날아다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 날아다니며 사냥을 합니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
        System.out.println("호랑이가 멋지게 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Cat{
	public void move() {
        System.out.println("고양이가 살금살금 걷습니다.");
	}
}

class Dog extends Animal{
	@Override
	public void move() {
        System.out.println("강아지가 아장아장 걷습니다.");
	}
	
	public void walk() {
		System.out.println("강아지는 아침저녁으로 산책을 합니다.");
	}
	
}

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}