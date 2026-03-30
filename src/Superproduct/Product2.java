package Superproduct;

public class Product2 {
	private String menu;
	private int price;
	private int count;
	private int total;
	
	public Product2() {}
	
	public Product2(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	public void cost() {
		this.total = this.count * this.price;
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
		return menu +" "+ price;
	}

	


}
