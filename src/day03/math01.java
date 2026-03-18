package day03;

import java.util.Random;

public class math01 {

	public static void main(String[] args) {
		// Math 클래스 : 수학관련 기능이 있는 클래스
		/* Math.round(값) : 반올림 소수 자리수는 0
		 * Math.ceil(값) : 올림 소수 자리수는 0
		 * Math.floor(값) : 버림 소수 자리수는 0
		 * Math.random() : 0~1사이의 아무수를 double 리턴
		 */
		
		
		double num = 3.14159;
		
		long roundNum = Math.round(num); //return long
		// int------- => (int)Math.---
		System.out.println(roundNum);
		
		double ceilNum = Math.ceil(num);
		// int------- => (int)Math.---
		System.out.println(ceilNum);
		
		int floorNum = (int)Math.floor(num);
		System.out.println(floorNum);
		
		//Math.max(값1, 값2) / math.min(값1, 값2)
		int num1 =10 , num2 = 20;
		System.out.println(Math.max(num1, num2)); //최대값
		System.out.println(Math.min(num1, num2)); //최소값
		
		System.out.println("-----------------");
		
		
    	// Math.random()
		//((int)() +1) => 1~10
		System.out.println((int)(Math.random()*10)); //()우선 순위 둬야 int가능
		
		// 1~6까지의 난수
		// ((int) (Math.fandom()*count)+start)
		System.out.println((int)(Math.random()*6)+1);
		
		System.out.println("-----------------");
		
		// Random 클래스
		Random random = new Random();
		System.out.println(random.nextInt(10)); //0~9까지 난수 (1~10 => +1추가)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
