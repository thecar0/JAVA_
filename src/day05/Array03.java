package day05;

public class Array03 {

	public static void main(String[] args) {
		// 합계와 평균을 구해주세요.
		//최대값, 최소값
		
		int arr[] = {32, 54, 36, 57, 35, 23, 24, 14};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
		   sum = sum + arr[i];
		}
		System.out.println(sum); 
		
		
		//52 78
		int max = arr[0];   //배열의 값이 있을때 사용 가능
		int min = arr[0];
		
		for(int i=0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}if(min > arr[i]) {
				 min = arr[i];
			}
			
		}
		System.out.println(max +" "+ min);
		
		
		
		//Math.amx() Math.min()
		int x = 0;
		int n = 100;
		
		for(int i=0; i<arr.length; i++) {
			x = Math.max(x, arr[i]);
			n = Math.min(n, arr[i]);
		}
		System.out.println(x +" "+ n);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
