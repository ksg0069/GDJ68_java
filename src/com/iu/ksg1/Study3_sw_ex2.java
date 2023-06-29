package com.iu.ksg1;

import java.util.Scanner;

public class Study3_sw_ex2 {

	public static void main(String[] args) {
		
		int pay;
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 데이터
		int id = 1234;
		int pw = 5678; 
		boolean result =false;
		int worker;
		//로그인 과정
		//ID와 PW를 입력받아서 로그인 처리
		//로그인성공, 로그인 실패
		
		System.out.println("id 입력");
		int inputid =sc.nextInt();
		System.out.println("pw 입력");
		int inputpw =sc.nextInt();
		
		if(id==inputid && pw== inputpw) {
			System.out.println("로그인 성공");
			result = true;
			
		}else {
			System.out.println("로그인 실패");
			result = false;
		}
		
		
				
//		if(id==inputid && pw== inputpw) {
//			System.out.println("로그인 성공");
//			System.out.println("정규직:1, 계약직:2 누르시오");
//			int worker =sc.nextInt();
//				if(worker==1) {
//					System.out.println("급여를 입력하세요");
//					pay =sc.nextInt();
//					pay = (int)(pay*0.93);
//					System.out.println("실급여 :" +pay);
//				}else if(worker ==2) {
//					System.out.println("급여를 입력하세요");
//					pay = sc.nextInt();
//					pay = (int)(pay*0.967);
//					System.out.println("실급여: " +pay);
//					
//				}
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		
		
		//--- 로그인 처리 후 작성
		//로그인이 성공한 사람만 실행 가능
		//1. 정규직, 2.계약직
		//급여 입력
		//정규직 : 건강보험 3%, 국민연금 2%, 고용보험 1%, 산재 보험 1%
		//계약직 : 원천징수 3.3%
		//실급여 출력
		
		if(result) {
			System.out.println("1. 정규직, 2.계약직");
			worker = sc.nextInt();
			
			System.out.println("급여를 입력하세요");
			pay =sc.nextInt();

			
			switch(worker) {
			case 1:
				double tax1 = pay*0.03;
				tax1 = tax1 + pay*0.02;
				tax1 = tax1 + pay*0.01;
				tax1 = tax1 + pay*0.01;
				pay = (int)(pay-tax1);
//				System.out.println("실급여 :" + pay);
				break;
			case 2:
				pay = (int)(pay*0.967);
//				System.out.println("실급여 :" + pay);
				break;
			default:
				System.out.println("잘못 눌렀습니다");
				result =false;
			
			
			
			}
			if(result) {
			System.out.println("실급여 :" + pay);
			}
		}

	}

}
