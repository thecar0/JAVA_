package day04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* ---menu---
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 두 수를 입력해주세요 > 2 3
		 * menu1 = 2+3=5
		 * menu2 = 2-3=-1
		 * menu3 = 2*3=6 
		 * menu4 = 2/0 num2를 다시 입력해주세요. (반복)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int menu = 0;
		
		while(true) {
		    System.out.println("--menu--");
			System.out.println("1.+ | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu >");
			menu = scan.nextInt();
			
			if(menu == 6) {
				break;
			}
			
			System.out.println("계산 할 두 수를 띄어서 입력 해주세요 >");
			num1 = scan.nextInt(); num2 = scan.nextInt();
			
			while((menu == 4 || menu == 5)&& num2 == 0) {
				System.out.println("num2를 다시 입력하세요.");
				num2 = scan.nextInt();
			}
			
			
			switch(menu) {
			case 1 : System.out.println(num1+" + "+num2+" = "+(num1+num2)); break;
			case 2 : System.out.println(num1+" - "+num2+" = "+(num1-num2)); break;
			case 3 : System.out.println(num1+" * "+num2+" = "+(num1*num2)); break;
			case 4 : System.out.println(num1+" / "+num2+" = "+(num1/num2));break;
			case 5 : System.out.println(num1+" % "+num2+" = "+(num1%num2));break;
			case 6 : System.out.println("종료"); break;
			default: System.out.println("잘못된 메뉴입니다."); break;
			}
		}
		

	
		
			
		
	scan.close();
		

	}

}
