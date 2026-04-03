package Superproduct;

public class Order2 extends Product2 {
	
	private int count; 
	private int total;
	
	// 기본 생성자
	public Order2() {}
	
	// 생성자
	public Order2(String menu, int price, int count) {
	    super.setMenu(menu);
		super.setPrice(price);
		this.count = count;
		this.cost(); 
	}
	
	// 이름과 가격, 수량을 추후 등록하는 메서드
	public void insertOrder(String menu, int price, int count) {
		super.setMenu(menu);
		super.setPrice(price);
		this.count = count;
		this.cost();  
	}
	
	// total 계산 메서드
	public void cost() {
		this.total = this.count * super.getPrice();   
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return " total " + super.getMenu() + " "+ super.getPrice() + " "+ this.count + " = " + this.total;
	}
	
}	
	


