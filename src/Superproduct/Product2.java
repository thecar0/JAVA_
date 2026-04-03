package Superproduct;

public class Product2 {
	private String menu;   
	private int price;
/*	private int count;  // count, total 멤버변수는 order에 넣으면 됨
	private int total;
*/	
	// 기본생성자
	public Product2() {}
	
	// 생성자
	public Product2(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
/*	public void cost() {
		this.total = this.count * this.price;   // order로
	}
*/	
	// 이름과 가격을 추후 등록하는 메서드
	public void intsertProduct (String name, int price) {
		this.menu = menu;
		this.price = price;
	}

//----------------------------------------------	
	
	
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return menu +" "+ price;
	}

	


}
