package day10;

public class Report {
	/* 멤버변수 : 이름  국어 영어 수학 합계 평균 등수 \t
	 * 생성자 (이름, 국어, 영어, 수학)
	 * 합계, 평균 계산
	 * 출력
	 * 평균은 소수점 2자리 DecimalFornat("##.00")
	 * getter , setter
	 */
	

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum ;
	private double avg ;
	private int ranking ;
	
	public Report(String name, int kor , int eng , int math) {
         this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        t();
	}
	
	public void t() {
		this.sum = this.kor + this.eng + this.math;
		this.avg = this.sum / (double)3;
	}
	
	public void print() {  //tostring으로 생성해도 됨
		System.out.println(name +"\t"+ kor+"\t"+eng +"\t"+ math +"\t"+ sum +"\t"+ avg +"\t"+ ranking);
	}
	
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	
	
	
	
	
	
	
	
	

}
