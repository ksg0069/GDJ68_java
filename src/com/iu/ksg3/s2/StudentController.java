package com.iu.ksg3.s2;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		
		//1. 학생정보 생성 -- makeStudents 호출
		//2. 학생정보 출력 -- StudentView에서 출력
		//3. 프로그램 종료
		
		StudentService ss = new StudentService();
		Student[] students=null;
		StudentView sv = new StudentView();
		 while(true){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1.학생정보 생성");
			System.out.println("2.학생정보 출력");
			System.out.println("3.학생정보 검색");
			System.out.println("4.프로그램종료");
			
			int select = sc.nextInt();
			
			
			if(select==1) {
				
				students  = ss.makeStudents();
				
				
			}else if(select==2) {
				
				sv.view(students);
				
				
			}else if(select==3){
				//findbynum 
				Student student= ss.findByNum(students);
				//view8
				sv.view(student);
				
			}else {
				
				System.out.println("프로그램 종료");
				break;
				
			}
		
		}
		
		
		
	}

}
