package day02;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료형 변환
		/* a = b : 두변수의 자료형이 맞지 않으면 오류
		 * 
		 * 자동 자료형 변환 : auto casting
		 * 
		 * byte < short < char < int < long
		 * fllat < double
		 * 
		 * 명시적 형변환 : 리터럴 값 앞에 (타입) 
		 */
		
		int a = 10;
		// String b = "11";
		// a = b;  // int <- byte  => 자동 형변환
		
		
		byte b = 11;
		a = b;
		
		b = (byte)a;
		
		char ch = 'a'; // 아스키 코드의 문자로 표시
		System.out.println((int)ch); //int로 형변환 하면 아스키 코드값 확인가능
		
		double d = 3.14159;
		System.out.println((int)d); // 소수점 날아감
		
		int num = 100;
		System.out.println((double)num); //소수점 생김
		
		long l2 = (long)num; //()붙혀도 되고 안해도 되고
		float f = (float)l2;
		System.out.println(f);
		
		
		//-----
		//문자를 숫자로 : String -> int
		String str = "123";
	    // int 기본 자료형 => 추가 기능을 제공하는 클래스 자료형 제공(래퍼클래스)
	    // int -> Integer
		
		int strNumber = Integer.parseInt(str); //문자를 숫자로
		System.out.println();
		
		// 숫자를 문자로 : int -> String
		int numberStr = 1123;
		
		
	}

}
