package day04;

public class For06 {

	public static void main(String[] args) {
		// 배수 : 1부터 값을 곱해서 나오는 값
		/* 10의 배수 : 10 20 30 40 .....
		 * 공배수 : 두 배수의 공통된 값
		 * 최소 공배수 : 30
		 */
		
	
		int num1 = 10;
		int num2 = 15;
		
		for(int i = 1; ; i++) {     //(int i = num1; ; i=i+num1)
			if(i % num1 == 0 && i % num2 == 0 ) {
				System.out.println(i);break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
