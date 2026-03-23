package day06;

public class StringEx02 {

	public static void main(String[] args) {
		/* fileName.suffix
		 * 파일명 / 확장자를 분리하여 출력
		 * 확장자가 java면 "자바파일입니다." / "기타파일입니다."
		 */
		
		String file = "자바의 정성.java";
		
		
		int i = file.indexOf(".");
		String filename = file.substring(i);
		
		if (filename .equals(".java")) {
			System.out.println("자바파일입니다.");
		}else {
			System.out.println("기타파일입니다.");
		}
		
		// split => 특정 값을 기준으로 분리하여 배열로 리턴
		String[] fileArr = file.split("\\."); 
		//regexp패턴 문자 때문에 .을 기호로 인식못함 \\넣어줘야함
		
		for(String f : fileArr) {
		    System.out.println(f);
		}
		
		if(fileArr[1].equals("java")) {
			System.out.println("자바파일입니다.");
		}else {
			System.out.println("기타파일입니다.");
		}
		

	}

}
