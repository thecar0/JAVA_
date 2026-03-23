package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 그림파일만 출력 => jpg, png
		 * 그림파일이 없습니다.
		 */
		
		String[] fileName = {
				"이것이 자바다.java" , "java의 정석.java", "array.txt", 
				"array.java" , "String.txt", "StringMethod.jpg",
				"ArrayMethod.png", "method.jpg", "javaMethod.png"
		};
		
/*		
        int count = 0;
     
		for(int i = 0; i < fileName.length; i++ ) {
			
			int name = fileName[i].lastIndexOf(".");
			
			if(name == "png"  ) {
				System.out.println(fileName[i]);
				count ++;
			}
		}if (count == 0) {
			System.out.println("그림파일이 없습니다.");  
		}
*/
		
		//---------------나
		
       boolean check = false; 
       
       for(int i = 0; i<fileName.length; i++) {
    	   String suffix = fileName[i].substring(fileName[i].lastIndexOf(".")+1);
    	   if(suffix.toLowerCase().equals("jpg") || suffix.toLowerCase().equals("png")) {
    		   System.out.println(fileName[i]);
    		   check = true;
    	   }
       }if(!check) {
    	   System.out.println("그림파일이 없습니다.");
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
