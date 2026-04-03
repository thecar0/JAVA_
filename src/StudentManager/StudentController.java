package StudentManager;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController implements StudentProgram{
	
	// 학생 배열 생성
	private Student[] student = new Student[5];
	private int cnt;
	
	//수강 신청을 위한 과목 목록 배열 : 수강신청이 가능한 모든 과목 목록
	private Subject[] subList = new Subject[5];
	
	//생성자(지금은 별로 필요하지 않음) 배열 생성을 생성자 안에 생성해도 상관없음
	
	//학생 미리 등록
	public void addStudent() {
		student[cnt] = new Student("12345", "홍길동", 20, "1234-5678", "서울시"); cnt++;
		student[cnt] = new Student("67890", "이순신", 21, "2345-6789", "서울시"); cnt++;
		student[cnt] = new Student("13579", "광개토", 22, "3456-7890", "서울시"); cnt++;
		}
	
	//수강과목 미리 등록
	public void addSubject() {
		subList[0] = new Subject("123", "java", "1" , "김모씨", "A");
		subList[1] = new Subject("456", "DB", "2" , "이모씨", "B");
		subList[2] = new Subject("789", "C언어", "3" , "박모씨", "C");
		subList[3] = new Subject("135", "javaScript", "4" , "최모씨", "D");
		subList[4] = new Subject("246", "python", "5" , "배모씨", "E");
	}
	
	//수강신청시 신청 가능한 목록을 출력하는 메서드
	public void printSubList() {
		int i = 1;
		System.out.println("--수강신청목록--");
		for(Subject s: subList) {
			System.out.println(i+". ");
			s.printSubject();
			i++;
		}
		System.out.println("---------------");
	}
	
	@Override
	public void intsertStudent(Scanner scan) {
		// 학생 배열에 추가
		System.out.println("학번 >");
		String studentno = scan.next();
		
		//학번에 대한 중복 불가 처리
		for(int i = 0; i < cnt; i++) {
			if(student[i].getStudentno().equals(studentno)) {
				System.out.println("학번이 중복됩니다.");
				return;
			}
		}
		System.out.println("이름 >");
		String name = scan.next();
		System.out.println("생년월일 >");
		int age = scan.nextInt();
		System.out.println("전화번호 >");
		String phone = scan.next();
		//번호에서 입력후 enter 가 스캐너 버퍼에 남아있음.
		scan.nextLine(); //버퍼에 남은 공백을 버림
		System.out.println("주소 >");
		String address = scan.nextLine(); //한 단어로 입력이 힘들때(Line) - 공백포함 (라인 한번더 처리)
		
		Student s = new Student(studentno, name, age, phone, address);
		
		student[cnt] = s;
		cnt++;
	}

	@Override
	public void printStudentList() {
		// 학생 배열 리스트 (전체 학생 목록 출력)
		for(int i = 0; i < cnt; i++) { //i가 제한되어야 해서 향상된 for문 안씀 (배열이 다 차있지 않아서)
			System.out.println((i+1)+". ");
			student[i].printInfo();
			student[i].printSubjectList();
		}
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 학생 배열에서 검색 (학생정보 출력)
		System.out.println("검색 학번 >");
		String num = scan.next();
		
		//학생번지 확인
		for(int i = 0; i < cnt; i++) {
			if(student[i].getStudentno().equals(num)) {
				student[i].printInfo();
				student[i].printSubjectList();
			}
			System.out.println("입력된 정보가 없습니다.");
		}
	}
/*
	@Override
	public void insertSubject(Scanner scan) {
		// 수강신청은 개인별로 한다.
		System.out.println("과목을 선택해주세요 >");
		for(int i=0; i<subList.length; i++) {
			System.out.println((i+1)+". "+"["+subList[i]+"]");
		}
		int subjectIndex = scan.nextInt();
		
		//student[index] = subList[subjectIndex-1];  //왜 안들어가는지? 비어있는 곳에 넣는거 넣어야될듯
			
	}
*/	
	@Override
	public void insertSubject(Scanner scan) {
		// 수강신청은 개인별로 한다.
		//수강신청할 학생의 학번을 받아 수강과목 리스트 출력
		//과목 선택후 => 해당과목의 객체를 Student 클래스의 insertSubject로 전달
		System.out.println("학번 >");
		String num = scan.next();
		
		for(int i=0; i<subList.length; i++) {
			if(student[i].getStudentno().equals(num)) {
				//해당학생이 있는 경우
				System.out.println((i+1)+". "+"["+subList[i]+"]");
				System.out.println("과목을 선택해주세요 >");
				int subIndex = scan.nextInt();
				if(subIndex <= 0 || subIndex > subList.length) {
					System.out.println("없는 과목입니다.");
					return;
				}
				//선택한 과목 객체
				//학생 클래스에서 과목추가 메서드 호출
				student[i].insertSubject(subList[subIndex-1]);
			}
		}
		System.out.println("학생정보가 없습니다.");
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강철회는 개인별로 한다.
		System.out.println("학번 >");
		String num = scan.next();
		
		for(int i=0; i<subList.length; i++) {
			if(student[i].getStudentno().equals(num)) {
				//내가 신청한 수강신청 리스트 출력
				System.out.println("--수강과목--");
				student[i].printSubjectList();
				System.out.println("철회 과목 코드 >");
				String subNum = scan.next();
				
				//Subject 객체에 과목코드만 담아 전송
				Subject s = new Subject();
				s.setSubjectcode(subNum);
				
				student[i].removeSubject(s);
			}
		}
		System.out.println("학생정보가 없습니다.");
	}
	
}
