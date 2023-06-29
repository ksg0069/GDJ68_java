package com.iu.ksg1;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++){
			System.out.println("hello");
			
		}
		
		int j=567;
		for(j=3; j>0;j--) {
			
		}
		
	//---------------
		
		Scanner sc = new Scanner(System.in);
		
		//hello출력
		//키보드로부터 출력 횟수르 입력받음
		
		System.out.println("횟수를 입력");
		int count = sc.nextInt();
		
		for(int c=0; c<count; c++) {
			System.out.println("출력");
		}
		
		

	}

}
