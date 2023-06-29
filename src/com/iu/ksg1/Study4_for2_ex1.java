package com.iu.ksg1;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		
		//FPS
		//30발, 3탄창
		//M16, 2가지: 단발, 3점사
		
		//1. 단발, 2.점사
		//탕 30번, 타타탕 10번
		
		int select;
		int tan;
	

		Scanner sc = new Scanner(System.in);
		
			for(tan=0; tan<3; tan++){
				System.out.println("1.단발, 2.점사");
				select = sc.nextInt();
				int count=10;
				String sound="타타탕";
				
				if(select ==1) {
					count=30;
					sound="탕";
				}
//				else{
//					count=10;
//					sound="타타탕";
//				
//				}
				for(int b=0; b<count; b++) {
					System.out.println(sound);
				}
					
				
				}
			
			
	}
}
			
			
			
		
	
		
	
		
		
	


