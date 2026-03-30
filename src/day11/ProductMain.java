package day11;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		/* 키오스크
		 * 상품 class : 품목, 가격(판매금액)
		 * 주문 class : 품목, 개수, 가격(판매금액), 총금액
		 * 
		 * 주문 출력 (하나의 주문에 대한 출력)
		 * 최종 결제 금액
		 */
		
		/* 1. 전체 메뉴(상품) 보여주기
		 * 2. 주문 > 상품, 수량 받기
		 * 3. 반복주문 가능 => 종료 키워드 생성하여 반복 주문 가능하도록
		 * 4. 종료 => 주문이 완료되었습니다. => 주문내역 /결제금액
		 * 
		 * ex) 
		 * 김밥 2 3000 => 6000
		 * 라면 2 4500 => 9000
		 * 음료 2  500 => 1000
		 * -------------------
		 * 총 지불금액     16000
		 */
		
		//{"김밥","참치김밥", "라면", "떡볶이" , "음료"};
		//{3000 , 3500 , 4500 , 5000 , 1000};
		
		Scanner scan = new Scanner(System.in);
/*		
		Product pd = new Product();                                 //5개의 배열로 받기
		
		String[] manu = {"김밥","참치김밥", "라면", "떡볶이" , "음료"};    //번지마다 내용 같이 넣기
		int [] price = {3000 , 3500 , 4500 , 5000 , 1000};

		System.out.println("메뉴를 선택하세요");
		
		for (int i = 0; i < manu.length; i++) {
			System.out.println((i+1)+"."+manu[i] + "(" + price[i]+")");
			}
			
		System.out.println("메뉴 > ");
		int manuindex = scan.nextInt();
		
		
*/		
		
		
		
		
		
		
		// 1. 판매할 상품 등록 Product[]
				Product[] menu = new Product[5];
				
				// 배열에 등록 객체생성(생성자이용)
				menu[0] = new Product("김밥", 3000);
				
				// 객체 생성 후 => insertProduct 호출 => 배열에 등록
				Product p =  new Product();
				p.insertProduct("라면", 1500);
				menu[1] = p;
				
				// 생성자를 활용 바로 객체 생성 => 배열에 등록
				Product p1 = new Product("제품", 100);
				
				// 객체 생성 후 => set을 이용하여 객체 추가 => 배열에 등록
				Product p2 = new Product();
				p2.setManu("제품2");
				p2.setPrice(500);
				
				menu[2] = new Product("떡볶이", 4000);
				menu[3] = new Product("볶음밥", 5000);
				menu[4] = new Product("사이다", 500);
				
				// 주문을 담을 변수 []
				Order[] order = new Order[5];
				int cnt=0;
				
//				String ok = "y";
//				while(!ok.equals("n")) {
//					
//				}
				
				char ok = 'y';
				while(ok != 'n') {
					System.out.println("주문하시겠습니까? (y/n)");
					ok = scan.next().charAt(0);
					
					if(ok == 'n') {
						System.out.println("주문을 종료합니다.");
						break;
					}
					if(ok == 'y') {
						// 처리
						// 메뉴 출력
						for(int i=0; i<menu.length; i++) {
							System.out.println((i+1)+"."+menu[i]);
						}
						
						System.out.println("메뉴를 선택해주세요>");
						// name, price
						int menuNo = scan.nextInt();
						
						System.out.println("수량>");
						// count
						int count = scan.nextInt();
						
						String menuName = menu[menuNo-1].getManu();
						int price = menu[menuNo-1].getPrice();
						
						// 주문 객체 생성
						Order o = new Order(menuName, price, count);
						// 주문 배열에 객체 넣기
						
						// 배열이 꽉 차서 넣을 공간이 없을경우.
						// 배열 복사
						if(order.length == cnt) {
							//새배열 생성
							Order[] tmp = new Order[order.length+3];
							// 복사
							System.arraycopy(order, 0, tmp, 0, order.length);
							// 주소 변경
							order = tmp;
						}
						order[cnt] = o;
						cnt++;
						
						
					}else {
						System.out.println("y/n 을 선택해주세요.");
					}
					
				}
				System.out.println("--주문 내역 출력--");
				int sum = 0; // 총 지불금액
				for(int i=0; i<cnt; i++) {
					System.out.println(order[i]);
					sum += order[i].getTotal();
				}
				if(cnt == 0) {
					System.out.println("주문내역이 없습니다.");			
				}
				
				System.out.println("-----------------");
				System.out.println("총 지불금액 : "+sum);		
		
		
		scan.close();
		
		

	}

}



	