package com.iu.ksg1;

import java.util.Random;
import java.util.Scanner;

public class Study4_for2 {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
//			System.out.println(i+"*"+j+"="+i*j );
		}
		}
		
		//종료할 분, 초를 입력받아서 
		//해당 분초가 되면 종료
		 System.out.println("분 입력");
		 int inputmin= sc.nextInt();
		 System.out.println("초 입력");
		 int inputsec= sc.nextInt();
		 boolean check=false;
				 
		 for(int min=0; min < 6; min++ ) {
			 
			for(int sec=0; sec<60; sec++) {
				System.out.println(min+"분 "+sec+"초");
				if(min==inputmin && sec==inputsec) {
					check=true;
				    break;
				    
				    
				}
				
			
			}
			if(check) {
				break;
			}
			
		}
		 
		
			
	
		
		
		
//		for(int i=0; i<5; i++) {
//			int num = random.nextInt(3);
//			
//			switch(num) {
//			
//			case 0:
//				System.out.println(num);
//				i=5;
//				break;
//			case 1:
//				System.out.println(num);
//			default:
//				System.out.println(num);
//				
//				
//			}
//		}
		
		System.out.println("프로그램 종료");
	}

}
