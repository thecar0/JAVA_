package day04;

public class For05 {

	public static void main(String[] args) {
		// 공약수
		/* 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * 공약수 : 1 2 3 6   최대공약수: 6
		 */
		
		int num1 = 6;
		int num2 = 12;
		
/*		for ( int i = 1; i <= num2; i++ ) {
		    if ( num1 % i == 0 && num2 % i == 0) {
		    	
		    	System.out.println(i);
		    }
		}

		// 최대공약수 출력
		int gcd = 0;
		
        for ( int i = 1; i <= num2; i++ ) {
		    if ( num1 % i == 0 && num2 % i == 0) {
		    	System.out.println(i);
		    	gcd = i;
		    }
   		}
*/		
		
		// num1 1씩 감소 / 첫 조건 맞으면 출력 
		for ( int i = num1; ; i-- ) {
		    if ( num1 % i == 0 && num2 % i == 0) {
		    	System.out.println(i);break;
		    }
		}
		}
		
		

	

}
