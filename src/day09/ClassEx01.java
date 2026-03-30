package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		
		TV t = new TV();
		
		t.chUp();
		t.chDown();                    //전원 OFF시 조작 확인
		t.volUp();
		t.volDown();
		
		t.Power();
		
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();                       //채널 5일때 0으로 돌아오는지 확인
		t.chUp();                       //채널이 다시 오르는지 확인
		
		System.out.println("----------");
		
		t.chDown();
		t.chDown();                     //채널 0일때 5으로 돌아오는지 확인
		t.chDown();                     //채널이 다시 내리는지 확인
		t.chDown();
		t.chDown();
		t.chDown();                    
		t.chDown();                   
		
		System.out.println("----------");
		
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		
		System.out.println("----------");
		
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		
		
		/* 선호채널 등록
		 * 5개 등록가능
		 * 1. 선호채널 등록메서드 (배열)
		 * 2. 선호채널 리스트 보기
		 */
		
	}

}
class TV{
	// 멤변 : brand, power, ch(0~10순환) , vol 20
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	private int[] favor = new int[5];
	private int index;
	
	
	public TV() {
		ch = 0;
		vol = 0;
	}
	
	// 생성자 
    public TV(String brand) {
		this(); //생성자 호출 : 첫줄만 가능
    	this.brand = brand;
	}
	
	// 메서드
  	public void Power() {
		power = !this.power;
		System.out.println("전원 : "+(this.power ? "0N" : "OFF"));
	}
	
	public void chUp() {
		if(this.power) {
			ch++;
			if(this.ch > 5) {
				ch = 1;
			}
			System.out.println("채널 : "+this.ch);
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	
	public void chDown() {
		if(this.power) {
			ch--;
			if(this.ch < 1) {
				ch = 5;
			}
			System.out.println("채널 : "+this.ch);
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
	
	public void volUp() {
		if(this.power) {
			vol++;
			if(this.vol > 5) {
				System.out.println("최대볼륨입니다");
			}
		}else {
			System.out.println("전원을 켜주세요");
		}
		System.out.println("볼륨 : "+this.vol);
	}
		
   	public void volDown() {
		if(this.power) {
			vol--;
			if(this.vol == 0) {
				System.out.println("음소거");
			}else if (this.vol < 0) {
				System.out.println("더이상 볼륨을 내릴수 없습니다.");
			}
			System.out.println("볼륨 : "+this.vol);
		}else {
			System.out.println("전원을 켜주세요");
		}
	}
   	
/*  (나)	
   	public void Favor(int[] favor) {
		for(int i=0; i<favor.length; i++) {
		   favor[i] = this.ch;
		}
	}
*/
   	public void pick() {
   		if(this.power) {
   			if(favor.length == index) {
   				index = 0;
   			}
   			favor[index] = ch;
   			index++;
   			System.out.println(ch+"선호채널 등록");
   		}
   	}
   	
   	public void printArray() {
		for(int i =0; i<index; i++) {     //비어있는 선호채널 나타내려면 favor.length
			if(favor[i] == 0) {
				System.out.println("X");
			}else {
				System.out.println(favor[i]+" ");
			}
		}
   	}
	// g s
		
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getCh() {
		return ch;
	}
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public int getVol() {
		return vol;
	}
	
	public void setVol(int vol) {
		this.vol = vol;
	}
	
}
