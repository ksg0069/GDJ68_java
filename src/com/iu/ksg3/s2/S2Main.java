package com.iu.ksg3.s2;

public class S2Main {

	public static void main(String[] args) {
		
		StudentService SS = new StudentService();
		
//		Student student = SS.makeStudent1();
//		System.out.println(student.avg);

		
		Student[] students = SS.makeStudents();
		
		System.out.println(students[0].avg);
		
		
		

	}

}
