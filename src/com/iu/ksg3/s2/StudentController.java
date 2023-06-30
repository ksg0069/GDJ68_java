package com.iu.ksg3.s2;

public class StudentController {
	
	public void start() {
		
		//1. 학생정보 생성 -- makeStudents 호출
		//2. 학생정보 출력 -- StudentView에서 출력
		//3. 프로그램 종료
		
		
		StudentService SS = new StudentService();
		
		Student[] students = SS.makeStudents();
		
		System.out.println(students[0].avg);
		
		
		
		
	}

}
