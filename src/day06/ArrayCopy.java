package day06;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		/* ArrayCopy
		 * 배열은 길이가 정해져 있음.
		 * 처음 배열을 선언할 때 정해서 생성
		 * 이후 배열을 증가 / 감소 할수 없음.(필요에 의해 늘이거나 줄일수 없음.)
		 * 배열의 길이를 조절해야 할때 arrayCopy를 이용
		 * 
		 * System.arraycopy(이전배열, 시작번지, 새배열, 시작번지, 개수)
		 * 이전배열 = 새배열;
		 */
		
		int[] arr = new int[5];
		
		arr[0] = 48;
		arr[1] = 67;
		arr[2] = 34;
		arr[3] = 17;
		arr[4] = 94;
		
		System.out.println(Arrays.toString(arr));
		
		
		// 새배열 생성 기존배열에 5개 추가
		// 데이터 복사 후 주소 공유
		// 출력
		
		int []arr2 = new int[arr.length+5];
		
	//	System.arraycopy
		
	//	arr = arr2;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
