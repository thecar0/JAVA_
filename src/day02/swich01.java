package day02;

public class swich01 {

	public static void main(String[] args) {
		// switch
		/* switch(변수 / 식){
		 *     case 값 1:  실행문;  break;
		 *     case 값 2:  실행문;  break; 
		 *     case 값 3:  실행문;  break; 
		 *     
		 *     default : 실행문;
		 *     }
		 *     
		 * break : 구문을 강제로 빠져나갈때 사용(조건문 동반)     
		 * 
		 */
		
		
		int number = 6;
		
		// switch 이용하여 짝수 / 홀수 구분
		// number % 2
		
		switch(number % 2){
		case 0:
				System.out.println("짝수");
				break;
			
		case 1:
				System.out.println("홀수");
				break;
				default:
					System.out.println("잘못된 값 입니다.");
		}
		
		
		// num 값은 1, 2, 3 이라고 가정하고, 
		// num 값이 1이면 1칸전진, 2면 2칸전진, 3이면 3칸전진
		// num의 값이 1, 2, 3 아닌 나머지는 다시입력하세요.
		
		
		int num = 5;
		
		switch(num) {
		case 1:
			System.out.println("1칸 전진");
			break;
		case 2:
			System.out.println("2칸 전진");
			break;
		case 3:
			System.out.println("3칸 전진");
			break;
		default:
			System.out.println("다시입력하세요.");
		}
		
		
		// (num +"칸 전진) case1,2,3묶어서도 가능
        
		switch(num) {
		case 1: case 2: case 3:
			System.out.println(num +"칸 전진");
			break;
		default:
			System.out.println("다시입력하세요.");
		}
		
		
		int month = 3;
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
			
		default:
			System.out.println("잘못된 월입니다.");
		}

	}

}
