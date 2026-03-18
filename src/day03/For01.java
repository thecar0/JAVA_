package day03;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할때 사용하는 문법
		 * for, while, do~while
		 * -for, while은 동작 방식이 같음.
		 * => 조건에 따라 조건이 맞지 않으면 한번도 실행 안될수도 있음.(조건 먼저 비교)
		 * 
		 * do~shile문 : 먼저 실행 하고, 조건을 나중에 비교함. 무조건 1번은 실행됨.
		 * 
		 * for(1초기화; 2 5조건식; 4 7증감식){
		 * 3 6실행문;
		 * }
		 * 
		 * - 초기화 : 실행문을 반복하기 위한 변수를 초기화(처음1번만 실행)
		 * - 조건식 : 반복을 결정하는 기능 (true 반복) : 생략가능
		 * - 증감식 : 조건식에서 사용하는 변수를 증가/ 감소 시켜 반복 횟수를 결정 : 생략가능
		 */
		
		//int i = 0;
	   
		for(int i=0; i<=5; i++) {  //초기화 생략하면 밖에 쓸수 있음
	    	System.out.println(i);
	        System.out.println("Hello");
	    }
		//syso (i) => 6
		
		System.out.println("-------------------");
		
		
	    // 1~10
	    for(int i=1; i<=10; i++) {
	    	System.out.println(i); // ln지우고 (i+" ") =>옆으로 나옴
	    }
	    
	    System.out.println(); //줄바꿈
	    
	    
		
	}

}
