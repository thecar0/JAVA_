package day06;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 정수배열 [10] 생성 후
		// 1~10 저장 후 출력
		//
		
		int arr[] = new int[5];
		
		for(int i =0; i<arr.length; i++) {      
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		for(int i =0; i<arr.length; i++) {    //for문 추가로 모든 번지 랜덤
		
	    // 번지를 랜덤으로 생성 (번지 : 0~9) 
		// 섞기
		int index = (int)(Math.random()*arr.length);
		//System.out.println(index);
	
		// 교환
		int t = arr[0];                      //여기까지는 하나만 교환
		arr[0] = arr[index];                 //여기까지는 하나만 교환
		arr[index] = t;                      //여기까지는 하나만 교환
		}
		
		System.out.println(Arrays.toString(arr));  
		
		// 원래대로 정렬 (선택정렬)
		// 작은수부터 정렬 => 오름차순   if(앞 > 뒤) {교환};
		// 큰수부터 정렬 => 내림차순
		// [3, 5, 4, 1, 2] -> 1pass [1, 5, 4, 3, 2] -> 2pass [1, 2, 5, 4, 3] ->
		
		for(int i = 0; i < arr.length-1; i++) {     //끝번지는 비교당하는 수가 없어서 -1
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		//Arrays.sort : 오름차순
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		

	}

}
