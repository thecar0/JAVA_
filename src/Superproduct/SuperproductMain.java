package Superproduct;

import java.util.Scanner;

import day11.Order;
import day11.Product;

public class SuperproductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Product2[] menu = new Product2[5];  //판매제품을 담는 배열
		
		menu[0] = new Product2("김밥", 3000);
		menu[1] = new Product2("라면", 4000);
		menu[2] = new Product2("떡볶이", 4000);
		menu[3] = new Product2("볶음밥", 5000);
		menu[4] = new Product2("사이다", 500);

		Order2[] od = new Order2[5];        //주문내역을 담는 배열
		int cnt=0;
		
		char ok = 'y';                      //String ok = "y";
		while(ok != 'n') {                  //(!ok.equals("n")
			// "y"를 사용하지 않는 이유 : 다른 키워드가 왔을때 반복처리
			System.out.println("주문하시겠습니까? (y/n)");
			ok = scan.next().charAt(0);     //ok = scan.next();
			
			if(ok == 'n') {                 //else if (ok.toSowerCase().equals("n")
				System.out.println("주문을 종료합니다.");
				break;
			}
			
			if(ok == 'y') {                 //(ok.toSowerCase().equals("y")
				for(int i=0; i<menu.length; i++) {
				System.out.println((i+1)+"."+menu[i]); //toString
			}
				
				System.out.println("메뉴를 선택해주세요>");
		        int menuNo = scan.nextInt();
				
				System.out.println("수량>");
				int count = scan.nextInt();
			
				
				String menuName = menu[menuNo-1].getMenu();
				int price = menu[menuNo-1].getPrice();
				
			
				Order2 o = new Order2(menuName, price, count);
				
				// 배열 추가 전 배열이 꽉 찼는지 확인
				if(od.length == cnt) {
					// 새배열 생성
					Order2[] tmp = new Order2[od.length+3]; 
					// 배열 복사
					System.arraycopy(od, 0, tmp, 0, od.length);
					// 주소 변경(이동)
					od = tmp;
				}
				od[cnt] = o;
				cnt++;
						
			}else {
				System.out.println("y/n 을 선택해주세요.");
			}
			
		}
		System.out.println("--주문 내역 출력--");
		
		int sum = 0; // 총 지불금액
		
		for(int i=0; i<cnt; i++) {
			System.out.println(od[i]);
			sum += od[i].getTotal();
		}
		if(cnt == 0) {
			System.out.println("주문내역이 없습니다.");			
		}
		
		System.out.println("-----------------");
		System.out.println("총 지불금액 : "+sum);		


        scan.close();
		

	}

}
