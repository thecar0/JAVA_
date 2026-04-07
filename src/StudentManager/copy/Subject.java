package StudentManager.copy;

import java.util.Objects;

public class Subject {
	//과목 정보 => 과목 한개
	//과목정보(subject class) : 과목코드, 과목명, 시수, 강사명, 강의장
	
	private String  subjectcode;  //연산을 하지 않을때 굳이 int로 쓸 필요 없음
	private String subjectname;
	private String subjectday;
	private String tname;
	private String classroom;
	
	public Subject() {}
	
	//equals를 위한 생성자
	public Subject(String subjectcode) {
		this.subjectcode = subjectcode;
	}
	
	public Subject(String  subjectcode, String subjectname, String subjectday, String tname, String classroom) {
		this.subjectcode = subjectcode;
		this.subjectname = subjectname;
		this.subjectday = subjectday;
		this.tname = tname;
		this.classroom = classroom;
	}
	
	//과목에 대해 추가 메뉴가 있어서 간편하게 쓰고싶다면 만들어 놓기
	public Subject(String  subjectcode, String subjectname) {
		this.subjectcode = subjectcode;
		this.subjectname = subjectname;
		this.subjectday = "3";
		this.tname = "정모씨";
		this.classroom = "A";
	}
	
	//출력을 하고싶다면
	public void printSubject() {
		System.out.println(subjectname+"("+subjectcode+")"+"/"+classroom);
	}
	
	
	public String  getSubjectcode() {
		return subjectcode;
	}
	public void setSubjectcode(String  subjectcode) {
		this.subjectcode = subjectcode;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getSubjectday() {
		return subjectday;
	}
	public void setSubjectday(String subjectday) {
		this.subjectday = subjectday;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	
	@Override
	public String toString() {
		return "Subject : " + subjectcode + subjectname + subjectday + tname + classroom ;
	}
	
    //source -> hash equals
	@Override
	public int hashCode() {
		return Objects.hash(subjectcode);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return Objects.equals(subjectcode, other.subjectcode);
	}
	
	
	
	

}
