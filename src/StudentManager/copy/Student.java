package StudentManager.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
	//학생정보 => 학생한명
	//학생정보(student class) : 학번, 이름, 나이, 전화번호, 주소, 수강과목[5](배열추가 가능 기능)
	//멤버변수에 배열이 존재하면 index역할 하는 변수가 필요
	
	private String studentno;
	private String studentname;
	private int age;
	private String phone;
	private String address;
	
	//private String[] subject = new String [5];
	private List<Subject> subjectList = new ArrayList<Subject>();
	
	public Student() {}
	
	public Student(String studentno, String studentname, int age, String phone, String address) {
    	this.studentno = studentno;
		this.studentname = studentname;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	//기본값으로
	public Student(String studentno, String studentname) {
    	this.studentno = studentno;
		this.studentname = studentname;
		this.age = 20;
		this.phone = "5555-5555";
		this.address = "서울시";
	}
	
	//수강과목이 존재하는지 확인하는 메서드
	public boolean nullCheck(Subject sub) {
		if(sub == null) {
			return false;
		}
		
		if(sub.getSubjectcode().isBlank()) {  //기본키 (DB)에 나오는 개념 => 코드로 확인
			System.out.println("수강정보가 없습니다."); return false;
		}
		return true;
	}
	
	//수강과목 객체가 들어오면 내 수강배열에 추가
	//1. 해당 배열에 이미 동일과목이 있는 경우 => 이 추 과
	
	public void insertSubject(Subject sub) {
		//1번
		//cnt 까지 배열을 순회하여 subjectcode가 일치하는 값이 있다면
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getSubjectcode().equals(sub.getSubjectcode()));
			System.out.println("이미 추가한 과목입니다."); return; //여기서 메서드 종료 후 뒷 부분 실행 X
		}
		System.out.println("수강신청 완료");
		
	}
	
	//수강과목 객체가 들어오면 내 수강배열에서 삭제 (배열은 삭제의 개념이 없음)
	//뒷 배열번지 앞으로 불러와서 덮어쓰기 (마지막 번지는 따로 null처리 해줘야함)
	//배열복사로 새 배열로 옮겨도 됨
	//순번이 중요하지 않으면 철회하는 번지를 마지막번지와 바꿔도 됨 (마지막 번지는 따로 null처리 해줘야함)
	public void removeSubject(Subject sub) {
	    //subjectList에서 sub가 몇번지에 있는지 찾기(equals로 비교 방법도 있긴함)
		int index = -1; //없는 번지로 설정
		
		//nullCheck로 분리
		if(nullCheck(sub)) {
			return;
		}
		
		//배열에서 번지 찾기
		for(int i = 0; i < subjectList.size(); i++) {
			if(subjectList.get(i).getSubjectcode().equals(sub.getSubjectcode())) {
				index = i;
				break; //번지를 찾았다면 반복문 벗어나기
			}
		}
	}

// 출력 메서드
	//개인정보 출력 메서드
	public void printInfo() {
		System.out.println("Student : " + studentno +" "+ studentname +" "+ age +" "+ phone +" "+ address);
	}
	
	//수강정보 확인 후 있으면 출력하는 메서드
	public void printSubjectList() {
		if(subjectList.size() == 0) {
			System.out.println("수강과목이 없습니다."); return;
		}
		for(int i = 0; i < subjectList.size(); i++) {
			subjectList.get(i).printSubject();
			//System.out.println(subjectList[i]); //둘다 가능
		}
		System.out.println("----------------------");
	}

	
	
	public String getStudentno() {
		return studentno;
	}
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	

	
	

}
