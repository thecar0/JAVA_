package day04;

import java.util.Scanner;

public class Exam01 {

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
		 * 
		 *  / 연산은 0으로 나눈때 exeiption 발생
		 *  피연산자가 0이면 "0으로 나눌수 없습니다."출력
		 */
		
		
        Scanner scan = new Scanner(System.in);
        
        
		System.out.println("띄어씌기 후 입력>");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		char op = scan.next().charAt(0);
		
		int ifResult=0;
		
		
		//-----------------나
		if(op=='+') {
			ifResult = n1+n2;
		}else if(op=='-') {
			ifResult = n1-n2;
		}else if(op=='*') {
			ifResult = n1*n2;
		}else if(op=='/') {
			if(n2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
				return;
				} else {
					ifResult = n1/n2;
				}
		}else if(op=='%') {
			if(n2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
				return;
			    }else {
			    	ifResult = n1%n2;
			    }
		}else {
			System.out.println("잘못된 연산자");
		}
		
		
		if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
			System.out.println(""+n1+op+n2+"="+ifResult);			
		}
		
		
		
/*		//(안에 if써서 예외 만들기)
		switch(op) { 
		case '+': System.out.println(n1+n2);break;
		case '-': System.out.println(n1-n2);break;
		case '*': System.out.println(n1*n2);break;
    	case '/': 
    	if(n2 == 0){
    		System.out.println("0으로 나눌수 없습니다.");
    	}else {
    		System.out.println(n1/n2); 
    	}break; 
		case '%': 
		if(n2 == 0) {
			System.out.println("0으로 나눌수 없습니다.");
		}else {
			System.out.println(n1%n2);
		}break;
		default: System.out.println("오류");
		}
*/		
		
		
/*		// 미리 안되는 케이스를 빼기
		
		String op = scan.next(); //String
		
		if((op.equals("/") || op.equals("%")) && n2 == 0){
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
				
		switch(op) {
		case "+": ifResult = n1 + n2; break;
		case "-": ifResult = n1 - n2; break;
		case "*": ifResult = n1 * n2; break;
		case "/": ifResult = n1 / n2; break;
		case "%": ifResult = n1 % n2; break;
		default: System.out.println("잘못된 연산자");
		}
				
		if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
			System.out.println(n1+op+n2+"="+ifResult);		
		} //equals : 문자 비교
*/				
       		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
				
				
	
}}
 
