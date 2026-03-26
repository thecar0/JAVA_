package day09;

public class Class02 {

	public static void main(String[] args) {
		// toString() 은 안불러내고 적어도 알아서 찾아 출력
		// 객체 내부에 toSrting() 메서드가 없으면 주소 출력
//		Test2 t2 = new Test2();
//		t2.setX(20);
//		t2.setY(40);
		
		
		
		
		
		
		
		
		int x = 30;
		int y = 20;
//		t.setX(x);
//		t.setY(y);
		
//		String s = t.str();
//		System.out.println(s);
		
//		int sum = t.getX() + t.getY();  //다른 클래스로 가져 올때 get필요
//		System.out.println(sum);

	}

}
// default 접근제어자는 나 + 패키지
// 패키지별로 같은 이름의 클래스명을 가질 수 없음.
class Test2{
	private int x;
	private int y;
	
	// toString() => print() 메서드를 String으로 리턴하는 형식
	// 멤버변수의 값을 전부 나열해서 String으로 리턴
	
	// (x,y) => String으로 리턴하는 메서드
	public String str() {
		return "("+this.x+","+this.y+")";
	}
	
	// private의 멤버변수를 다른클래스에서 사용하기 위해서는 getter /setter메서드 필요
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {   // String으로 변환할때는 set만 있어도 됨
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}