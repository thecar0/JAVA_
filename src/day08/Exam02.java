package day08;

import java.util.Arrays;

public class Exam02 {
	
	public void user(int[] u) {
		
		for(int i = 0; i < u.length; i++) {
			u[i] = (int)(Math.random()*10)+1;
			for(int j = 0; j < i; j++) {
				if(u[i] == u[j]) {
					i--;
					break;	
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
//		return l;
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
//		int ua[] = me.user();
//		int la[] = me.loto();
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
		
		
		
	}

}
