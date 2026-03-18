package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~10까지의 합계 while
		int i = 0;
		int sum = 0; //합계
		while(i<=10) {
			sum += i;
			i++;
		}System.out.println(sum);
		
		
		
		//1~10까지의 짝수 합계
		i = 1;
		sum = 0;
		while( i <= 10) {
			if(i % 2 == 0) {
				sum += i;
			}i++;
		}System.out.println(sum);
		
	
		
		
		
		

	}

}
