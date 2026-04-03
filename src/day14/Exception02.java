package day14;

public class Exception02 {

	public static void main(String[] args) {
		/* 자주 발생하는 런타임 예외 코드들
		 * - ArithmeticException            : 0으로 나누었을 때 발생
		 * - ArrayIndexOutOfBoundsException : 배열의 범위가 넘어갔을때 발생
		 * - NullPointerException           : 객체값이 null 일 떄 발생
		 * - ClassCaseException             : 다운캐스팅이 잘못되었을 경우 발생
		 */
		int[] arr = new int[5];      //ArrayIndexOutOfBoundsException
		arr[5] = 1;
		
		int[] arr2 = null;
		System.out.println(arr[0]);  //NullPointerException
		
		

	}

}
