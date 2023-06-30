package com.iu.ksg3;

import java.util.Scanner;

public class RifleMain {
	public static void main(String[] args) {
		
		Rifle rf = new Rifle();
		
		//멤버들 사용법
		//1. 멤버변수 참조변수명.멤버변수명
		//2. 멤버메서드 참조변수명.멤버메스드명()
		
		//메서드 호출
//		rf.shoot1();
//		rf.shoot2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.단발 2. 점사");
		int select = sc.nextInt();
		
		
		System.out.println("총알 수 입력");
		int b=sc.nextInt();
		
		if(select==1) {
			
			rf.shoot1(b);
			System.out.println(b);
			
		}else {
			rf.shoot2(1,"s" , null);
			
			
		}
		
	}

}
