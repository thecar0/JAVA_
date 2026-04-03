package day14;

public class Exception01 {

	public static void main(String[] args) {
		/* Exception : 예외 (컴파일 오류 , 런타임 오류)
		 * 
		 * 오류의 종류
		 * - 논리적 오류 : 실행은 되지만 의도와 다르게 작동하는 오류
		 * - 컴파일 오류 : 컴파일 시 발생하는 오류 (문법 구문 오류 : syntax error) => 빨간밑줄
		 * - 런타임 오류 : 실행 시 잘못된 결과를 얻거나, 오류가 나는 케이스 
		 * 
		 * 자바는 크게 세가지로 예외 처리함
		 * Error / Exception  (Checked) (UnChecked) 
		 * - Error     : 개발자가 복구할수 없는 심각한 오류 (코드의 문제가 아닌 외부요인이 원인)
		 * - Exception : 개발자의 코드에 의해 실수가 발생되는 경우 (개발자가 코드로 수정가능)
		 * - Checked   : 컴파일 시점에서 예외처리가 일어나는 예외 => IOException / SQLExcption / FileNotFoundException...
		 * - UnChecked : 문법적인 오류는 없으나 (컴파일 시점에서는 문제가 되지 않았음) 실행시 발생되는 예외 (개발자의 코드 실수)
		 * 
		 * 실행시 (Unchecked) 발생할수 있는 오류들 => RunTimeException
		 * - 문제가 발생할 떄를 대비해여 이에 대응하는 코드를 미리 작성함 => 예외처리
		 * - 예외처리를 통해 비정상 종료를 막을 수 있음.
		 * - 예외가 발생되면 예외 발생시점부터 코드는 중지 => 예외문구 출력 (빨간글씨)
		 * - 예외처리를 하게되면 => 예외가 발생되는 시점부터 코드는 중지. 예외처리 구문 이후는 정상처리
		 * 
		 * try ~ catch
		 * try ~ catch ~ finally
		 * 
		 * - try     : 예외가 발생할 가능성이 있는 구문을 작성
		 * - catch   : try 구문에서 발생한 예외를 처리
		 * - finally : try 구문외 반드시 실행되어야 하는 문구를 작성 (생략가능)
		 */
		
		int a = 10;
		int b = 0;
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a-b);                   // 예외 지점 위로 try안에 들어가면 실행됨
		
		try {
			
			System.out.println(a/b);               // b가 0이라 실행 후 오류 (런타임) 이후로 실행 중지
			System.out.println(a%b); 	           // b가 0이라 실행 후 오류 (런타임) 이후로 실행 중지
		
		} catch (Exception e) {
			
			e.printStackTrace();                   // 출력구문 포함
			System.out.println(e.getMessage());    // Error메세지 ( /by zero ) 를 띄우거나
			System.out.println("0으로 나누었습니다."); // 직접 작성
		
		}
		
		System.out.println(a+b);                   // 예외 지점 밑으로 try안에 들어가면 실행되지 않음
		System.out.println(a*b);
		System.out.println(a-b);

	}

}
