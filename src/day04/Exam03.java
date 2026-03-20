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
			default: System.out.println("잘못된 메뉴입니다."); break;
			}
		}
		

	
	    // -------------------------------------나
		
		
/*		
		int mu = 0;
		do {
			System.out.println("---menu---");
			System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료");
			System.out.println("menu>");
			mu = scan.nextInt();
		
			if(mu == 6) {
				System.out.println("종료합니다.");
				break;
			}else if(mu <=0 || mu > 6){
				System.out.println("잘못된 메뉴!!");
			}else {
			
				
				System.out.println("두 숫자를 입력해주세요 (2 3)>");
				int n1 = scan.nextInt();
				int n2 = scan.nextInt();
				
				while(n2 == 0 && (mu == 4 || mu == 5)) {
					System.out.println("피연산자가 0입니다. ");
					System.out.println("num2를 다시 입력해주세요.");
					n2 = scan.nextInt();
				}
				
				switch(mu) {
				case 1: System.out.println(num1+"+"+n2+"="+(num1+num2)); break;
				case 2: System.out.println(num1+"-"+n2+"="+(num1-num2)); break;
				case 3: System.out.println(num1+"*"+n2+"="+(num1*n2)); break;
				case 4: System.out.println(num1+"/"+n2+"="+(num1/n2)); break;
				case 5: System.out.println(num1+"%"+n2+"="+(n1%n2)); break;
				case 6:  break;
				default: break;
				}
			}
			
	
		
	*/	
		
		
		
			
		
	scan.close();
		

	}

}
