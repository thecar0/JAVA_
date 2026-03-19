package day04;

public class For07 {

	public static void main(String[] args) {
		// 소수 : 1과 자기 자신만을 약수로 가지는 수
		/* 2 3 5 7 11 13 ...
		 * 
		 */
		
/*		int num = 3;
		int count = 0;
		for(int i = 2; i <num ; i++) {    
			if(num % i == 0) {
				count++;
			}
		}if(count == 0) {
			System.out.println("소수");
		}else {
			System.out.println("소수 아님");
		}
*/		
		
		
		
		
		
		
		for(int i=2; i<=100; i++) {
			int count=0;
			// i 의 수가 num가 됨.
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		

	}

}
