package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// 배열의 값을 리스트로 생성
		String[] arr1 = {"h", "b" , "k", "e", "j"};
		String[] arr2 = {"r", "u" , "c", "n", "q"};
		
		//2개의 배열을 하나의 리스트로 생성 => 출력
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
			list.add(arr2[i]);
		}
		System.out.println(list);

/*		//--------나
		for(String s : arr1) {
			list.add(s);
		}
		for(String s : arr2) {
			list.add(s);
		}
*/
		
//		list = Arrays.asList(arr1); //얕은 복사 : 배열의 값을 연결하여 리스트로 옮김
		
/*		List<String> list1 = new ArrayList<String>(Arrays.asList(arr1)); //깊은 복사 : 복사해서 가져오기
		List<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
		
		//addAll(list) : 모든요소 추가
		list1.addAll(list2);
*/
		//정렬 => 출력
		Collections.sort(list);
		System.out.println(list);

	}

}
