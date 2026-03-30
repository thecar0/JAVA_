package Superproduct;

public class Order2 extends Product2 {
	
	
	public Order2() {}
	
	public Order2(String menu, int price, int count) {
	    super.setMenu(menu);
		super.setPrice(price);
		super.setCount(count);
		super.cost(); 
	}
	
	public void insertOrder(String menu, int price, int count) {
		super.setMenu(menu);
		super.setPrice(price);
		super.setCount(count);
		super.cost();  
	}
	
	public void insertProduct(String menu, int price) {
		super.setMenu(menu);
		super.setPrice(price);
	}

	public void print() {
		System.out.println("total" + super.getMenu() + super.getPrice() + super.getCount() + "=" + super.getTotal());
	}
	
}	
	


