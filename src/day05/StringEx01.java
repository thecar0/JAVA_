package day05;

public class StringEx01 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 나이 성별을 출력
		//String regNum = "990101-1234567";  //1(남) 2(여)
		String regNum = "000101-4234567";  //3(남) 4(여)		
		
		int today = 2026;
		
		/* 출력결과
		 * 생년월일 : 990101 
		 * 성별 : 남            
		 * 나이 : 27              
		 */
		
		
		
		String gender = String.valueOf(regNum.charAt(7));  //char는 문자 비교가 안되서 변환 해줘야함
			
		System.out.println(regNum.substring(0, 6));
		if(gender.equals("1") || gender.equals("3")) {
				System.out.println("남자");
			}else if (gender.equals("2") || gender.equals("4")) {  
				System.out.println("여자");
			}
		
		String a = regNum.substring(0, 2);
		
		if(gender.equals("1") || gender.equals("2")) {
			int age = Integer.parseInt("19" + a); //변환해서 String 말고 int로 써줘야함
			System.out.println(2026 - age);
		}else if (gender.equals("3") || gender.equals("4")) {
			int age = Integer.parseInt("20" + a); //변환
			System.out.println(2026 - age);
		}
			
		
		//---------------------------------나
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
