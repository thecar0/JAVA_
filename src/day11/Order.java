package day11;

public class Order {
	private String manu;
	private int price;
	private int count;
	private int total;
	
	public Order() {}
	
	public Order(String manu, int price, int count) {
		this.count = count;
		this.manu = manu;
		this.price = price;
		cost();  // 총금액 계산까지 한번에
	}
	
/*	public void totalPrint () {
		int sum = 0;
		for(int i = 0; i < this.total; i++) {       //없어도 되는듯
			sum += this.total;
		}
		System.out.println(sum);
	}
*/
	
	public void cost() {
		this.total = this.count * this.price;
	}
	
	// 주문 추가 메서드 
		public void insertOrder(String menu, int price, int count) {
			this.manu=manu;
			this.price = price;                                          //추가 메서드 넣기
			this.count = count;
			cost();  // 총금액 계산까지 한번에
		}

//-----------------------------------------------
	
	public String getManu() {
		return manu;
	}

	public void setManu(String manu) {
		this.manu = manu;
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
		return "total" + manu + price + count + "=" + total;
	}
    
	
	
	
	
	
	
	
	
	
	
	
	
}



