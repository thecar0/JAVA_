package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		// toLowerCase() / toUpperCase() : 소 / 대문자 변환
		System.out.println("---case---");
		System.out.println("abc".toUpperCase());
		System.out.println("ABC".toLowerCase());
		
		// isEmpty() : 값이 비었는지 확인
		System.out.println("---isEmpty---");
		System.out.println(" ".isEmpty());   //공백 포함O
		
		// isBlank() : 값이 비었는지 확인
		System.out.println("---isBlank---");
		System.out.println(" ".isBlank());   //실 값이 없으면 인정하지 않음(공백 포함X)
		
		// trim() : 불필요한 공백 제거
		System.out.println("---trim---");
		System.out.println("      abc        ".trim()); 
		
		//replace() : 글자를 치환(변환)
		System.out.println("---replace---");
		String str = "apple, banana, kiwi, orange";
		// 2026-03-20 => 2026/03/26
		System.out.println(str.replace(",","/"));
		
		// split : 특정기준 값을 기준으로 나누기 => 배열로 리턴
		System.out.println("---split---");
		String[] strArr = str.split(", ");
		System.out.println("---Arrays.toString---");
		System.out.println(Arrays.toString(strArr));
		
		System.out.println("---for---");
		for(String tmp : strArr) {
			System.out.println(tmp);
		}
		
		System.out.println("---향상된 for---");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		
		// 문자를 숫자로 Integer.parslInt()
		String num = "123";
		int num2 = Integer.parseInt(num);
				
		//숫자를 문자로 변경 String.valueOf()
		String num3 = String.valueOf(num2);
		
		// instanceof : 같은 클래스가 맞는지 확인한은 연산자 (클래스만 가능)
		System.out.println(num3 instanceof String);
		
		
		
		
		
		
		

	}

}
