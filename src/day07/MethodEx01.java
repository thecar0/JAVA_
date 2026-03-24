package day07;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --menu--
		 * 1. 덧셈 | 2. 
		 * 메뉴 선택 > 
		 * 숫자 입력 (두 정수) > 1 3\
		 * >> 결과 : 1 +3 = 4
		 */
		
		int num1 = 0;
		int num2 = 0;
		int menu = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		    System.out.println("--menu--");
			System.out.println("1.+ | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu >");
			menu = scan.nextInt();
			
			if(menu == 6) {
				System.out.println("종료");break;
			}
			
			System.out.println("계산 할 두 수를 띄어서 입력 해주세요 >");
			num1 = scan.nextInt(); num2 = scan.nextInt();
			
			while((menu == 4 || menu == 5)&& num2 == 0) {
				System.out.println("오류. num2를 다시 입력하세요.");
				num2 = scan.nextInt();
			}
		
		Method01 me01 = new Method01();
		int s = me01.sum2(num1, num2);
		int m = me01.sub(num1, num2);
		
		Method03 me03 = new Method03();
		int x = me03.x(num1, num2);
		
		double z = me03.z(num1, num2);  
		int y = me03.y(num1, num2);
		
		switch(menu) {
		case 1 : System.out.println(num1+" + "+num2+" = "+s); break;
		case 2 : System.out.println(num1+" - "+num2+" = "+m); break;
		case 3 : System.out.println(num1+" * "+num2+" = "+x); break;
		case 4 : System.out.println(num1+" / "+num2+" = "+z);break;
		case 5 : System.out.println(num1+" % "+num2+" = "+y);break;
		default: System.out.println("잘못된 메뉴입니다."); break;
		}
		}
		
		
		scan.close();
		

	}

}
