package day06;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		/* 10개의 숫자를 가지는 배열 생성
		 *  1~50까지 랜덤수를 배열에 저장 => 출력
		 *  최대 최소 합계 평균 출력
		 */
		
		
		int arr[] = new int[10];
		int max = 0 , min = 51 , sum = 0; //한번에 적어도 됨
			
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (int)(Math.random()*50) + 1;
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			sum = sum + arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(max +" "+ min);		
		System.out.println(sum);
		System.out.println((sum / (double)arr.length)); //double형변환 arr갯수
		
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
