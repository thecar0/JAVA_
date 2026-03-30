package day11;

public class Product {
	private String menu;
	private int price;
	
	public Product() {}
	
	public Product(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	// 상품 추가하는 메서드 (편리성을 위해 추가 - 없어도 됨)
		// 객체 생성 이후에 값을 추가해야 할 경우
		public void insertProduct(String menu, int price) {
			this.menu = menu;
			this.price = price;
		}

//----------------------------------------------	
	
	
	public String getManu() {
		return menu;
	}

	public void setManu(String menu) {
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
		return "manu=" + menu + ":" + price; //잘 보이게 만들어도 됨
	}

	
}
