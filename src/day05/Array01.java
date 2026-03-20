package day05;

import java.util.Arrays;
import java.util.Random;

public class Array01 {

	public static void main(String[] args) {
		
		
		
		/* int a;  // 초기화 안한 상태
		 * a = a + 1;  // 기본형 변수는 초기화를 안해준다.직접 반드시 초기화를 해야 사용 가능
		 * 참조형 변수는 초기화를 해준다.
		 * 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집학 (참조변수)
		 * - 기본 타입 8개 (기본변수) 빼고는 전부 참조변수
		 * - new 키워드로 생성
		 * - 배열 선언 방버
		 * 타입[] 배열명; // 기본값은 null
		 * 타입 배열명[];
		 * 
		 * 타입[] 배열명 = new타입[길이];  // 배열명 = new타입 [길이]
		 * 생성된 배열안의 변수값은 자동으로 초기화가 이루어 진다.
		 * 숫자 타입 =0 , 문자타입 = null
		 * 
		 * int[] arr = new int[5]; // 기본 방법 (가장 많이 사용)
		 * int[] arr = new int[]{1,2,3,4,5};    //test할때 많이 사용
		 * int[] arr ={1,2,3,4,5};              //test할때 많이 사용
		 * 
		 * - 배열의 길이는 0이상이여야 한다.(-는 허용안됨 exception)
		 * - 배열의 index는 0부터 시작
		 * - 배열[5] => 0 1 2 3 4  => 마지막 번지는 [개수 - 1]
		 * - 배열의 총 길이는 => length => 마지막 번지 [length - 1]
		 * 
		 */

		
		
		
		
		
		
		
		int[] arr; //배열 선언 (null)
		arr = new int[5]; // 선언한 변수에 객체 연결
		
		int arr1[] = new int[5]; //5개의 배열한 값은 0으로 초기화
		int arr2[] = new int[] {1,2,3,4,5}; //초기값은 1,2,3,4,5
		int arr3[] = {10,20,30,40,50}; //위에 arr2 처럼 해도 되고 이 줄 처럼 해도 됨.
		
		System.out.println(arr); //주소가 뜸
		System.out.println(arr[0]); //0번지 값을 보여줌   //없는 번지수 찍으면 오류
		
		
		System.out.println("---------------------");
		// 0부터 마지막 번지와 같은 것 까지 출력
		for (int i = 0; i <= arr3.length-1; i++) {
			System.out.println(arr3[i]);                 //모든 번지 띄우는 for문
		}  
		
		System.out.println("---------------------");
		// 0부터 개수까지 출력 (마지막 개수의 번지는 포함x)
		for (int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);                 
		}
		
		System.out.println("---------------------");
		//arr에 값을 추가
		arr[0] = 78;
		arr[1] = 89;
		arr[2] = 85;
		arr[3] = 95;
		arr[4] = 63;  
		// arr[5] = 60; 으로 넣으면 구문상 에러는 없어서 작성은 가능하지만 실행때 에러남(exception)
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);                 
		}
		
		
		System.out.println("---------------------");
		// 10의 칸을 가지는 int 배열을 생성하고, 1~10까지 반복 저장  =>출력
		int arr4[] = new int[10];
		int a = 1;
		for (int i=0; i<arr4.length; i++) { 
			arr4 [i] = arr4[i]+a;  //값을 담아야함      //a를 생성해서 만든 방법
			System.out.println(arr4[i]);
			a++;
		}
		
		System.out.println("---------------------");
		for (int i=0; i<arr4.length; i++) {
			arr4 [i] = i+1;//값을 담아야함  
			System.out.println(arr4[i]);       //i로 만든 방법
		}
		
		
		System.out.println("---------------------");
		//arr5를 5개 생성 => 랜덤 값(1~10) => 출력
		int arr5[] = new int [5];
		for(int i=0; i<arr5.length; i++) {
			arr5 [i] = (int)(Math.random()*10)+1;
			System.out.println(arr5[i]);
		}
		
		System.out.println("-----향상된 for문-----");
		/* 배열이나 리스트 같은 전체 탐색
		   index(번지)로 접근이 불가능한 경우 사용
		   배열 내부 값을 변경 불가능
		   향상된 for
		 */
		for(int tmp : arr5) {
			System.out.println(tmp);
		}
		
		System.out.println("----arr5.toString()----");
		
		
		/* Arrays 클래스 toString
		 */
		System.out.println(Arrays.toString(arr5)); //간편하게 보는 방법
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
