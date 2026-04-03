package day13;

public class CustomerMain {

	public static void main(String[] args) {
		/* 백화점 고객
		 * 등급
		 * Silver / Gold / vip
		 * - Silver : 할인 0% / 적립 1%
		 * - Gold   : 할인 5% / 적립 3%
		 * - vip    : 할인 10% / 적립 5% / 상담사 (멤 변 : agentName, agentNum)
		 *  
		 *  일반고객 => Customer (부모)
		 * - 멤 변 : 고객ID, 고객명, 등급, 보너스포인트(적립), 적립비율
		 */
		
		/* 다운 캐스팅 사용
		 * 상담사 영이(1001) => 철이(1003)
		 * VIP고객 리스트
		 */
/*	
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] instanceof VIP) {
				//VIP고객이라면,,(다운캐스팅)
				VIP v = (VIP)customer[i];
				if(v.getAgentName().equals("영이")) {
					v.setAgentName("철이");
				    v.setAgentNum("1003");
				}
			}
		}
		//VIP고객 리스트
		System.out.println("VIP 고객 리스트");
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] instanceof VIP) {
				customer[i].print();
			}
		}
*/	
	}

}

class Ctm{
	private String id;
	private String name;
	private String grande;
	private double point;
	private double ratio;
	
	public Ctm() {}

	public Ctm(String id, String name) {
		this.id = id;
		this.name = name;
		this.grande = "SILVER";
		this.point = 0.01;
	}
	
	/* 1. 보너스 적립 계산 메서드
	 * - 구매금액의 적립 보너스 계산 => 누적적립
	 * - 보너스 적립, 할인여부도 체크하여 구매 금액 리턴
	 */
	public int grandeBonuse(int cost) {
		int point = (int)(cost * ratio);
		this.point += point;
		return cost;
		
//		cost *= point;     가능한건지 확인하기
//		return cost;
	}
	
	/* 2. 출력
	 * - 홍길동님은 vip고객이며, 현재 보너스포인트는 5000점입니다. <- 모든고객
	 * - 전담 상담사는 짱구이고, 번호는 1111입니다. <- vip고객만
	 */
	public void print() {
		System.out.println(name + grande +"고객님, 사용가능한 포인트는 " + point + "점 입니다.");
	}


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGrande() {
		return grande;
	}



	public void setGrande(String grande) {
		this.grande = grande;
	}



	public double getPoint() {
		return point;
	}



	public void setPoint(double point) {
		this.point = point;
	}



	public double getRatio() {
		return ratio;
	}



	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	
	
}

class Gold extends Ctm{
	//상속받은 Ctm에 없는 멤버변수만 선언
	//할인율 따로 작성
	private double saleRitio;

	public Gold() {}

	public Gold(String id, String name) {
		super(id, name); //부모 생성자 호출
		super.setGrande("Gold");
		super.setPoint(0.03);
		this.saleRitio = 0.05;
	
	}

	@Override
	public int grandeBonuse(int cost) {
		super.grandeBonuse(cost);
		return cost - (int)(cost * saleRitio);
		}
	
	@Override
	public void print() {
		super.print();
		}
	

	public double getSaleRitio() {
		return saleRitio;
	}

	public void setSaleRitio(double saleRitio) {
		this.saleRitio = saleRitio;
	}

	@Override
	public String toString() {
		return "Gold [saleRitio=" + saleRitio + "]";
	}
	
	

	
}

class Vip extends Ctm {
	private double saleRitio;
	String agentName;
	String agentNum;

	public Vip() {}

	public Vip(String id, String name, String agentName, String agentNum) {
		super(id, name); //부모 생성자 호출
		super.setGrande("VIP");
		super.setPoint(0.05);
		this.saleRitio = 0.1;
		this.agentName = agentName;
		this.agentNum = agentNum;
	}

	@Override
	public int grandeBonuse(int cost) {
		super.grandeBonuse(cost);
		return cost - (int)(cost * saleRitio);
	}

	@Override
	public void print() {
		super.print();
		if(super.getGrande() == "VIP") {
			System.out.println("전담상담사는 " + agentName + "번호는" + agentNum + "입니다.");
		}
	}

	public double getSaleRitio() {
		return saleRitio;
	}

	public void setSaleRitio(double saleRitio) {
		this.saleRitio = saleRitio;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}

	@Override
	public String toString() {
		return "Vip [saleRitio=" + saleRitio + ", agentName=" + agentName + ", agentNum=" + agentNum + "]";
	}
	
	
	
}
