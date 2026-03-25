package day08;

import java.util.Arrays;

public class Method06 {
	//Random random = new Random();     여기에 쓰면 모든 메서드들이 사용 가능
	
	
	/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => int[]
	 * 매개변수 : 없음
	 * 리턴타입 : int[]
	 */
	public int[] arr() {
		int arr [] = new int [5];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			//arr[i] = random.nextInt(100);
		}
		return arr;
	}
	
	/* 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드
	 * 매개변수 :
	 * 리턴타입 : 
	 */
	public double average(int number[]) {
		double avg = 0;
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum / (double)number.length;
	}
	
	/* 3. 정수 배열을 매개변수로 받아 출력하는 메서드
	 * 매개변수 :
	 * 리턴타입 :
	 */
	public void print(int number[]) {
		for(int num : number) {
			System.out.println(num +" ");
		}
		System.out.println();  //enter(줄바꿈)포함
		//System.out.print();  //enter(줄바꿈)미포함 값을 꼭 넣어야 쓸수 있음
	}
	

	public static void main(String[] args) {
		// 매서드 배열 활용
		
		Method06 m6 = new Method06();
		int arr[] = m6.arr();
		
		m6.print(arr);   //출력
		
		System.out.println(m6.average(arr));  //평균 호출후 출력
		
		
		

	}

}
