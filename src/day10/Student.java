package day10;

public class Student {
	/* 학생정보를 관리하기 위한 클래스 생성
	 * 학생의 기본 정보 : 이름 전화번호 주소 생년월일
	 * 학원정보 : 학원명 = "KOREAIT", 지점
	 * 수강정보 : 수강과목 , 기간
	 *        => 수강과목은 여러과목을 들을 수 있음.[5] /기간[5]
	 *        
	 * ex) 홍길동, 010 1111 1111, 서울, 010101
	 *     KOREAIT 강남
	 *     java      2026 01 01 ~ 26 02 28
	 *     웹개발 국비  2026 01 16 ~ 26 09 03
	 *     DB        2026 05 01 ~ 26 05 31
	 */
	
	/* 수강과목을 추가하는 메서드
	 * => 1번 호출될때마다 1개의 수강과목 / 기간 추가
	 */
	
	private String name;
	private int num;
	private String area;
	private int age;
	private String zone;
	private String[][] sub = new String [5][5];
	
	public Student(String name, int num , String area , int age , String zone) {
		this.name = name;
		this.num = num;
		this.area = area;
		this.age = age;
		this.zone = zone;
	}
	
	public void print() { 
		System.out.println(name +"\t"+ num +"\t"+ area +"\t"+ age);
		System.out.println("KOREA IT"+zone);
	}
	
	public void subject() {
		
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	
	
	
	
	
	
	
	
	

}
