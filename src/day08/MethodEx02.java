package day08;

import java.util.Arrays;

public class MethodEx02 {

	public void print(int number[]) {
		for(int num : number) {
			System.out.print(num +" ");
		}
	}	
	
	public void Array(int number[]){
		for(int i = 0; i < number.length; i++) {
			for(int j = i+1; j < number.length; j++) {
				if(number[i] > number[j]) {
					int t = number[i];
					number[i] = number[j];
					number[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(number));
	}
	
	public void print2(int number[]) {
		double avg = 0;
		int sum = 0 , max = 0 , min = 100;
				
		for(int i = 0; i < number.length; i++) {
			//sum = number[i];
			sum += number[i];
			if(max < number[i]) {
				max = number[i];
			}
			if(min > number[i]) {
				min = number[i];
			}
		}
		avg= sum / (double)number.length;
		System.out.println(sum +" "+ avg +" "+ max +" "+ min);
	}	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {90,87,83,92,49,30,47,63,22,89};
		
		//메서드 생성
		/* 1. 배열을 매개변수로 받아 출력하는 메서드
		 * 2. 배열을 매개변수로 받아 오름차순으로 정렬하는 메서드
		 * 3. 배열을 매개변수로 받아 합계, 평균, 최대, 최소값을 출력하는 매서드
		 */
		MethodEx02 m7 = new MethodEx02();
		
		m7.print(arr);
		System.out.println();
		m7.Array(arr);
		m7.print2(arr);
		

	}

}
