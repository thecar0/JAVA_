package day06;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// 배열
		/* 숫자 5개의 값을 가지는 배열을 생성
		 *  1 2 3 4 5 입력하고 출력
		 */
		
		int arr[] = new int[5];
		
		for (int i=0; i<arr.length; i++) {
			arr [i] = i+1;  
			System.out.println(arr[i]);
		}
		
		for(int tmp : arr) {
			System.out.println(tmp);
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
