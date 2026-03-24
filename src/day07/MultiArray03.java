package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/* 성적산출인원 > 3(입력)
		 * 이름  국어 영어 수학 합계 평균 등수 \t
		 * hong 89  85  78  00  00  00
		 * kim  89  85  78  00  00  00 
		 * lee  89  85  78  00  00  00  
		 * 
		 * 
		 */

		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("명수를 입력하세요 >");
		
		int n = scan.nextInt(); 
		
		int arr [][] = new int [n][3];
		
		String name [] = new String [n];
		int sum [] = new int [n];
		double avg [] = new double[n];
		int R [] = new int [n];		
		
		for (int i =0; i<arr.length; i++) {
			
			System.out.println("이름을 입력하세요 >");
			name[i] = scan.next();
			
			for (int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = (int)(Math.random()*71)+30;
				
				sum[i] += arr[i][j];
				
														
			}
			avg[i] = sum[i] / n ; 
			
		}
		
		
		
		int r = 1;					
		
		for (int i= 0; i <arr.length; i++) {
			for (int j =0; j<arr[i].length; j++) {
				if(i < j) {
					r++;
					R[i] = r;
				}
			}
		}
		
		//출력해보기 (나,,,) (미완)
		
/*		
		System.out.println("성적산출인원 > ");
		int tester = scan.nextInt(); //인원수
		int subject = 3; //과목수
		
		String[] name = new String[tester];
		int[][] scores = new int[tester][subject];
		int[] total = new int[tester];
		double[] avg = new double[tester];
		int[] ranking = new int[tester];
		
		// 이름 점수 입력받기
		for(int i=0; i<tester; i++) {
			System.out.println((i+1)+"번째 학생>");
			name[i] = scan.next();
			System.out.println(name[i]+"의 성적(국어 영어 수학) >");
			for(int j=0; j<scores[i].length; j++) {
				//scores[i][j] = scan.nextInt();  // 콘솔에서 직접 입력받기
				scores[i][j] = (int)(Math.random()*70)+30; // 랜덤 성적입력
				total[i] += scores[i][j]; // 합계누적
			}
			avg[i] = total[i] / (double)subject;
		}
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(int i=0; i<tester; i++) {
			System.out.print(name[i]+"\t");
			// 성적만 2차원 배열
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print(total[i]+"\t");
			System.out.printf("%.2f \t",avg[i]); // 소수 2자리만
			
			// 순위
			int r = 1;
			for(int j=0; j<tester; j++) {
				if(avg[i] < avg[j]) {
					r++;
				}
			}
			ranking[i] = r;
			
			System.out.println(ranking[i]);
		}
		
*/		
		
		
		
		
		
		scan.close();
		
		
		
	}

}
