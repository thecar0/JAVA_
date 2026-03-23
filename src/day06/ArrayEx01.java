package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 파일명을 저장하고 있는 배열
		 * 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		 * 검색어를 포함하는 파일이 존재하지 않는다면
		 * 일치하는 항목이 없습니다. => 출력
		 */


		Scanner scan = new Scanner(System.in);
		
		String[] fileName = {
				"이것이 자바다.java" , "java의 정석.java", "array.txt", 
				"array.java" , "String.txt", "StringMethod.jpg",
				"ArrayMethod.png", "method.jpg", "javaMethod.png"
		};
		
		// 대소문자 구분없이 검색
/*				
		System.out.println("검색어를 입력하세요>");
		
		String name = scan.next();    //next뒤에 int 지우면 string으로 받아짐
		//(num)toUpperCase();         //옆에다 붙히면 됨
		
		int count = 0;
		
		for(int i = 0; i < fileName.length; i++ ) {
			if (fileName[i].contains(name)) {
				System.out.println(fileName[i]);
				count ++;
			}if (count == 0) {
				System.out.println("일치하는 항목이 없습니다.");  //하나하나 다 비교해서 나옴 (for문 밖으로 빼면 해결)
			}
		}
		
*/		
		//--------------------나
		
		System.out.println("검색어를 입력하세요>");
		String search = scan.next().toLowerCase();
		
		int count = 0;
		
		for(int i = 0; i < fileName.length; i++ ) {
			if(fileName[i].toLowerCase().contains(search)) {
				System.out.println(fileName[i]);
				count ++;
			}
		}if (count == 0) {
			System.out.println("일치하는 항목이 없습니다.");  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		

	}

}
