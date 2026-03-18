package day03;

public class While03 {

	public static void main(String[] args) {
		// 1~50까지 짝수만 출력
		//2 4 6 8 10
		//12 14 ---
		
		
		//10의 자리수가 출력될때마다
//		int i = 1;
//		while(i <= 50) {
//			if(i % 2 == 0) {
//				System.out.print(i+" ");
//				if(i % 10 == 0) {   //안에 있든 밖에 있든 상관없음
//					System.out.println();
//				}
//			}i++;
//		}
		
		
		//5개가 출력 할때마다
		int i = 1;
		int count = 0; 
		while(i <= 50) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
				count++;   //i가 증가할때마다 count도 증가 해주는 용도
				if(count % 5 == 0) {  //(count == 5) 하고 count=0;추가 하는 방법도 있음
					System.out.println();
				}
			}i++;
		}
		
		
		
		
		
		
		
		
		
	}

}
