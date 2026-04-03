package day15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {
	
	public static void main(String[] args) {
		// set에 1~45 까지 중복되지 않는 랜덤수 6자리 생성 => 출력
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		while(set.size() < 6) {
			treeSet.add((int)(Math.random()*45)+1);
		}
		System.out.println(treeSet);
		
		//first() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		//headSet(값) / tailSet(값) : 값 기준으로 앞쪽 / 뒤쪽 값을 출력
		System.out.println(treeSet.headSet(20)); //기준값보다 작은거
		System.out.println(treeSet.tailSet(20)); //기준값보다 큰거
		
		//subSet(start , end) : 범위의 값 출력 (끝 값은 미포함)
		System.out.println(treeSet.subSet(10, 20));
		
			
	}

}
