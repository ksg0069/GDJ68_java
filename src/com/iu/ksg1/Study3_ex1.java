package com.iu.ksg1;

import java.util.Scanner;

public class Study3_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점, 평균(int) 계산
		//90이상A, 80이상 B, 70이상 C, 60이상 D 그외F 
		
		Scanner sc = new Scanner(System.in);
				
		int kl = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int sum = kl+eng+math;
		int avg = sum/3;
		
		
		switch(avg/10){
		
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		default : 
			System.out.println("F");
		
	
		}

	}

}
