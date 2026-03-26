package day08;

import java.util.Arrays;

public class Exam02 {
	
	public void user(int[] u) {
		
		for(int i = 0; i < u.length; i++) {
			u[i] = (int)(Math.random()*10)+1;
			for(int j = 0; j < i; j++) {
				if(u[i] == u[j]) {
					i--;
					break;	                   //배열 랜덤 메서드롸 중복체크 메서드 따로 만들기
				}
			}
		}
	}

//	public int[] loto() {
//		int l [] = new int [6];
//		for(int i = 0; i < l.length; i++) {
//			l[i] = (int)(Math.random()*36)+10;
//			for(int j = 0; j < i; j++) {
//				if(l[i] == l[j]) {
//					i--;
//					break;	
//				}
//			}
//		}
//		return l;         따로 할거면 7배열 받아서 분리
//	}
	
		
		public static void main(String[] args) {
		/* 로또번호 생성 -> 당첨여부
		 * user번호 6개
		 * 1~45까지 번호중 6개 선택 (랜덤 자동선택)
		 * 
		 * 당첨번호 7개 -> 6개 + 보너스 번호 (랜덤 자동선택)
		 * 
		 * 유저번호와 당첨번호는 중복 불가능
		 * 당첨여부 확인
		 * 
		 * 6개 일치 = 1등 (순서는 상관X , 보너스 제외)
		 * 5개 일치 + 보너스 번호 = 2등
		 * 5개 일치 = 3등
		 * 4개 일치 = 4등
		 * 3개 일치 = 5등
		 * 나머지 꽝
		 */

		
		Exam02 me = new Exam02();
		int[] ua = new int[6];
		me.user(ua);
		System.out.println(Arrays.toString(ua));
		
		int[] la = new int[6];
		me.user(la);
		System.out.println(Arrays.toString(la));
		int bo = (int)(Math.random()*10)+1; 
		int count =0 , count2 =0;
		
		System.out.println(bo);
		
		
		
		for(int i = 0; i < ua.length; i++) {
			for(int j = 0; j < la.length; j++) {
				if (ua[i] == la[j]) {
					count++;
				}if (ua[i] == bo) {
					count2++;
					break;
				}
			}
		}
		
		System.out.println(count);
		System.out.println(count2);
		
		if (count == 6) {
			System.out.println("1등");
		}else if (count == 5 && count2 == 1) {
			System.out.println("2등");
		}else if (count == 4) {
			System.out.println("3등");
		}else if (count == 3) {
			System.out.println("4등");
		}else if (count == 2) {
			System.out.println("5등");
		}else {
			System.out.println("꽝");
		}
		
	//--------------------------------------
	
		
    //메서드 만들기
		
	/* 1. 배열을 매개변수로 받아 랜덤수로 채워주는 메서드
	 * 매개변수 : 배열 => int[] arr
	 * 리턴타입 : void => 매개변수의 배열을 채우는 	
	 */
/*	public void randomArray(int[] arr) {
		// 랜덤 값을 넣을때 중복을 제거하고 채우기. (1-1불러와서 if로 돌리기)
		int cnt = 0;
		while(cnt < arr.length) {
			int random = (int)(Math.random()*45)+1;
			if(!isContains(arr, random)) {
				arr[cnt] = random;
				cnt++;
			}
		}
	}
*/
		
		
	/* 1-1. 중복 확인 메서드 
	 * 매개변수 : 배열 , 값 => int[]arr, int random
	 * 리턴타입 : boolean => true /false 
	 */
/*	public boolean isContains(int[] arr, int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		return false; //리턴값은 0이여야 해서 false
	}
*/			
	
	
	/* 2. 배열 출력 메서드
	 * 매개변수: 배열 => int[] arr
	 * 리턴타입 : void => 출력
	 */
/*	public void printArray(int[] arr) {
		for(int i =0; i<6; i++) {
			System.out.println(arr[i]+" ");
		}
		if (arr.length == 7) {
			System.out.println("["+arr[arr.length-1]+"]");
		}
	}
*/
		
		
	/* 3. 당첨확인 메서드
	 * 매개변수 : 배열 2개 => int[] user, int[] lotto
	 * 리턴타입 : int => 등수 리턴  (void로 해도 상관 없음)
	 */
/*	public int lootoRank(int[]user, int[] lotto) {
		//user/lotto 위치가 바뀌어서 들어오면 exception	
		if(user.length >= lotto.length) {
			System.out.println("배열이 잘못들어왔습니다."); //통일성을 위해 출력을 아래에서
			return -999;
		}
		int count = 0; //일치개수 카운트 (보너스는 제외)
		for(int i =0; i < user.length; i++) {
			if(isContains(user, lotto[i])) {    //로또 번호가 유저에 있으면 카운트를 올리겠다
				count++;
			}
		}
		
		//순위
		int bonus = lotto[lotto.length-1]; //보너스 번호 추출
		switch(count) {
		case 6 : return 1;
		case 5 : if (isContaeturn ins(user, bonus)) {
			r2;
		}else {
			return 3;              // = return (isContains(user, bonus) ? 2 : 3;
		}                                     
		case 4 : return 4;
		case 3 : return 5;
		default : return -1;
		}
	}
*/		
		
		
	//main	
/*	int[] user = new int [6];
	int[] lotto = new int [7];
		
	Exam02 e = new Exam02();
	e.randomArray(user); //user배열에 랜덤배열 채우기
	e.randomArray(lotto);
	e.printArray(user); //채운 배열 출력
	e.printArray(lotto);	
		
	//등수 리턴 -999(배열오류) -1 꽝
	int ranking = e.lottoRank(user, lotto);
		if(ranking == -999) {
			System.out.println("배열 오류입니다.");
		}else if(ranking == -1) {
			System.out.println("꽝~!!");
		}else {
			System.out.println("축~!! "+ranking+"등 당첨!!");
		}
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
