package com.iu.ksg1;

import java.util.Scanner;

public class Study4_for_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		boolean result = false;
		
		//로그인 시도 최대 5번까지
		
		for(int i=0; i<5; i++) {
			
			System.out.println("아이디 입력");
			int inputid = sc.nextInt();
			System.out.println("비밀번호 입력");
			int inputpw = sc.nextInt();
			
			if(id==inputid && pw==inputpw) {
				System.out.println("로그인 성공");
				result = true;
				break;
				
				
			}else if(i==4) {
				
				System.out.println("로그인 실패 ");
			}else {
				
				System.out.println("로그인 실패 다시입력");
			}
			
			
		}
		
		
		//로그인 성공시 급여계산 출력
		if(result) {
			System.out.println("급여계산");
		}
		
		
		System.out.println("프로그램 종료");
		

	}

}
