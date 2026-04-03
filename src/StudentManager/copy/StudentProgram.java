package StudentManager.copy;

import java.util.Scanner;

public interface StudentProgram {
	/* 1. 학생등록
	 * 2. 학생 리스트 출력
	 * 3. 학생 검색 (학생정보, 수강정보)
	 * 4. 수강신청 (한 학생에 대한)
	 * 5. 수강철회 (한 학생에 대한)
	 */
	
	void intsertStudent(Scanner scan); //등록
	void printStudentList();           //리스트 출력
	void searchStudent(Scanner scan);  //검색
	void insertSubject(Scanner scan);  //수강신청
	void deleteSubject(Scanner scan);  //수강철회
}
