package day04;

public class For09 {

	public static void main(String[] args) {
		// 이중 For문
		
		
		
		// *을 한줄에 5개 5줄
	    for(int i=1; i<=5; i++) {  //줄
		   for(int j=1; j<=5; j++) {  //별 개수
		    	System.out.print("*");
			}System.out.println(); //줄 바꿈
		} 
		    
		// *을 한줄에 하나씩 늘리기
		 for(int i=1; i<=5; i++) {  //줄 
			   for(int j=1; j<=i; j++) {  //별 개수
			    	System.out.print("*");
				}System.out.println(); //줄 바꿈
		 }
		
		// *을 한줄에 하나씩 줄이기
		 for(int  i=1; i<=5; i++) {  //줄
			   for(int j=1; j<=(6-i); j++) {  //별 개수 (6-i)
			    	System.out.print("*");
				}System.out.println(); //줄 바꿈
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
