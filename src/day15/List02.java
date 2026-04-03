package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		
		int i = 11;
		
		while(list.size() < 10) {
			list.add(i);
			i++;
		}
		System.out.println(list);

		
/*		for(int i = 11; i <= 20; i++) {
			list.add(i);
		}
*/		
		for( Integer in : list ) {
			System.out.println(in);
		}
		
		int sum = 0;
		for(Integer in : list) { //int로 누적
			sum += in; //안들어간다면 (int)in 형변환
			System.out.println(in);
		}
		System.out.println(sum);
		
		//Iterator(반복자) : index 가 없는 구조를 출력하기 위해 사용
		//set , map 처럼 index 가 없는 구조에서 사용
		//순서와 상관없이 값을 가져올 수 있는 구문을 사용
		System.out.println("- iterator 출력 -");
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {    //요소가 있는지 확인
			int tmp = it.next(); //요소 가져오기
			System.out.println(tmp);
		}
		
		//indexOf(값) : 해당값의 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(30));
		
		list.clear();
		
		list.add(45);
		list.add(35);
		list.add(26);
		list.add(94);
		list.add(30);

		Collections.sort(list); //정렬 (오름차순만 가능)
		System.out.println(list);

	}

}
