package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	
	
	
	
	
	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * 12345
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
	 
		
		
		
		
		
		
		
//		while((menu == 4 || menu == 5)&& num2 == 0) {
//			System.out.println("오류. num2를 다시 입력하세요.");
//			num2 = scan.nextInt();
//		}
		
		
		while(true) {
			
			System.out.println("계산 할 수를 입력 해주세요 >");
			String num = scan.next();

				
			String[] str = num.split("");
			
			for(int i=0; i<str.length; i++) {
				//String n[i] = Integer.parseInt(str[i]);
			}
			//System.out.print("user :"+Arrays.toString(n));
		}
			
		
		
	}

}
