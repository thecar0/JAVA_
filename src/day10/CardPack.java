package day10;

public class CardPack {
	/* 52장의 Card를 배열로 저장 (pack)
	 * 
	 * - 멤버변수 : 52장의 Card 담을 수 있는 배열
	 * - 메서드
	 * 1. 카드 섞는 기능
	 * 2. 카드를 한 장 빼는 기능 (user에게 배부)
	 * 3. 카드 초기화
	 * 
	 * - 생성자
	 */
	
	private Card[] pack = new Card[52];  //Card클래스 안에 pack을 만들어 놓음
	private int index;
	
	public void pack() {
    
		String shape[] = {"♥", "◆", "♣", "♠"};
		
		for(int i=0; i<shape.length; i++) {
			for(int j=1; j<=13; j++) {
				
				Card c = new Card();   
				
				c.setShape(shape[i]);
				c.setNum(j);
				pack[index] = c;
				index++;
			}
		}
	}
	
	
	public void shuffle() {
		for(int i = 0; i < pack.length; i++) {
			
			int random = (int)(Math.random()*pack.length);  //랜덤으로 섞으려면
			
			Card t = pack[i];                     
			pack[i] = pack[random];                
			pack[random] = t;                   
			}
		}
	
	public Card pick() {
		if(index == 0) {
			return null;
		}
		index--;
		return pack[index];
	}
	
	public void init() {
		index = 52;
		shuffle();
	}
	
	
	
	
	
	
	public Card[] getPack() {
		return pack;
	}
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	

}
