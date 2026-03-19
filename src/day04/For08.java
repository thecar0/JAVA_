package day04;

public class For08 {

	public static void main(String[] args) {
		// 구구단
		
		
	
		for(int i=2; i<=9; i++) {
		for(int j=1; j<=9; j++) {
			System.out.println(i +"*" + j +"=" +(i*j));
		}
		}

		
		
		
		
		//단이 끝나면 다음줄
	    for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i +"*" + j +"=" +(i*j)+" ");
			}System.out.println();
			} // i는 고정 j가 돈다
	    
	    System.out.println();

		//다음규칙
	    for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j +"*" + i +"=" +(i*j)+" ");
			}System.out.println();
			} //
	    	
	    		

	}

}
