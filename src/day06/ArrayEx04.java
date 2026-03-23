package day06;

import java.util.Arrays;

public class ArrayEx04 {

	public static void main(String[] args) {
		/* 정수배열[10] => 1~100까지의 랜덤수 저장 => 출력
		 * 오름차순 정렬 => 출력
		 * 
		 */
		
		int arr[] = new int [10];
		//Random r = new Random(); //arr[i] = r.nextInt(100)+1;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		//Arrays.sort(arr); //오름차순
		System.out.println(Arrays.toString(arr));
		
		
		/* 내림차순 정렬방법 
		 * 기본 자료형은 불가능. => object(모든 객체의 부모) 형태로만 가능 (래퍼클래스로)
		 * 
		 * Collections.reversOrder() 
		 * wrapper class => 래퍼클래스
		 * 기본타입의 자료형값을 박싱(포장) 해서 객체로 만드는 것
		 * int => Integer
		 * byte => byte
		 * char => Character
		 * float => Float
		 * double => Double
		 * long => Long
		 * short => Short
		 * boolean => Boolean
		 */ 
		 
		
		 /* Integer arr[] = new Integer[10];
		 * Arrays.sort(arr, Collections.reversOrder());
		 */
		
		
		
		
		
		
		
		

	}

}
