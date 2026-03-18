package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 과제
		/* 정수 2개와 연산자 1개를 입력받아 두 정수의 연산의 결과를 출력
		 * ex) 2 3 + => 2 + 3 = 5
		 * ex) -
		 * ex) ! => 잘못된 연산자
		 * 연산자는 + - * / % 만 가능
		 * String 문자열 == "+" => 불가능
		 * 
		 * char == '+' => 가능
		 * scan.next() : 한단어 => String
		 * 
		 * String op = scan.next() (return String)
		 * char op = scan.next().charAt(0); // (return char)
		 * if(op == '+'){}
		 */
		
		
		//-------------------나
		Scanner scan = new Scanner(System.in);
		
		System.out.println(">");
		int num1 = scan.nextInt();
		
		System.out.println(">");
		int num2 = scan.nextInt();
		
		char op = scan.next().charAt(0);
		
		switch(op) {
		case '+': System.out.println(num1+num2);break;
		case '-': System.out.println(num1-num2);break;
		case '*': System.out.println(num1*num2);break;
    	case '/': System.out.println(num1/num2);break;
		case '%': System.out.println(num1%num2);break;
		default: System.out.println("오류");
		}
		//------------------나
		
		
		//------------------여러가지 방법 day03
		
		
//		System.out.println("두 정수 띄어쓰기 입력 >");
//		int n1 = scan.nextInt();
		
		//System.out.println("2 >"); //둘다 가능(한줄 생략 가능)
//		int n2 = scan.nextInt();	
		
//		System.out.println(">");
//		char op = scan.next().charAt(0);
		
		//switch 사용
//		switch(op) {
//		case '+': System.out.println(n1+n2);break;  //1.(""+n1+op+n2+"="+(n1+n2))
//		case '-': System.out.println(n1-n2);break;  //2.result = n1-n2;
//		case '*': System.out.println(n1*n2);break;
//		case '/': System.out.println(n1/n2);break;
//		case '%': System.out.println(n1%n2);break;
//		default: System.out.println("잘못된 연산자");
//		}
		
		//2. if(op =='+' || -----){ (잘못된 결과값 줄이기)
		//syso (""+n1+op+n2+"="+result)}
		
		
		//if 사용 (char)
//		int ifResult=0;
//		if(op=='+') {
//			ifResult = n1+n2;
//		}else if(op=='-') {
//			ifResult = n1-n2;
//		}else if(op=='*') {
//			ifResult = n1*n2;
//		}else if(op=='/') {
//			ifResult = n1/n2;
//		}else if(op=='%') {
//			ifResult = n1%n2;
//		}else { System.out.println("잘못된 연산자");}
		
		//2. if(op =='+' || -----){ (잘못된 결과값 줄이기)
		//syso (""+n1+op+n2+"="+ifresult)}
		
		
		// ifresult = 0; (앞에 쓴 변수 초기화)
		
		//if 사용 (string)
		/* if(opStr.equals("+")){
		 *     ifResult = n1+n2;}
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * if(op =='+' || -----){ (잘못된 결과값 줄이기)
		   syso (""+n1+op+n2+"="+ifResult)}
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		scan.close();

	}

}
