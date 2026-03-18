package day03;

public class While01 {

	public static void main(String[] args) {
		// While문
		/* for : 반복의 횟수가 정해져 있는 경우 사용
		 * While : 실행 횟수가 정해져 있지 않는 경우 사용
		 * while (조건식){실행문}
		 * 
		 */
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		int count = 1;
		while(count<=10) {
			System.out.println(count);
			//반복변수가 종료되기 위한 조건 포함해야함.
			count++;
			
			// 종료 조건
			if(count ==5) {
				break; //반복문 빠져나가기
			}
		}
		
		System.out.println("-----------------------");
		
		count = 1;
//		while(count<=10) {
//			System.out.print(count+" ");
//			count++;
//		}
//		System.out.println();
		
		//짝수 1
		while(count<=10) {
			if(count % 2 == 0) {
				System.out.print(count+" ");}
				count++;
		}
		
		//짝수2
		while(true) {
			if(count % 2 == 0) {
				System.out.print(count+" ");
				}
			if(count > 10)	{
				break;
			}}
			count++;
		
		
		
		
		
		
		
		

	}

}
