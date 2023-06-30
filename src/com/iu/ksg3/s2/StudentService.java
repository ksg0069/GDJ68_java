package com.iu.ksg3.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student makeStudent1() {
		//학생 1명 만들어서 이름, 번호, 국어, 영어, 수학
		//총점 평균 계산
		//학생을 리턴
		Scanner sc = new Scanner(System.in);
		
		
		Student s1 = new Student();
		
		System.out.println("이름 입력");
		s1.name=sc.next();
		System.out.println("번호 입력");
		s1.num=sc.nextInt();
		System.out.println("국어점수 입력");
		s1.kor=sc.nextInt();
		System.out.println("영어점수 입력");
		s1.eng=sc.nextInt();
		System.out.println("수학점수 입력");
		s1.math=sc.nextInt();
		
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		
		
		return s1;
		
		
	}
	
	public Student[] makeStudents() {
		
		//학생수 입력 , 스캐너이용
		//학생수 만큼 학생들이 만들어짐 -> student 객체만들라는것
		//이름,번호,국어,영어,수학 점수 입력
		//총점, 평균 계산
		//학생들을 리턴
		//1. 학생 배열을 생성
		//2. 학생 수만큼 반복문 실행
		//3. 반복문 내에서 이름,번호,국어, 영어, 수학 입력 총점 평균
		//4. 해당 학생을 배열에 대입
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("학생수 입력");
		int stuNum = sc.nextInt();
		
		Student[] st = new Student[stuNum];
		
		
		for(int i=0; i<stuNum; i++) {
		
		    
			Student s1 = new Student();
			
			System.out.println("이름 입력");
			s1.name=sc.next();
			System.out.println("번호 입력");
			s1.num=sc.nextInt();
			System.out.println("국어점수 입력");
			s1.kor=sc.nextInt();
			System.out.println("영어점수 입력");
			s1.eng=sc.nextInt();
			System.out.println("수학점수 입력");
			s1.math=sc.nextInt();
			
			s1.total = s1.kor+s1.eng+s1.math;
			s1.avg = s1.total/3;
			
		
			st[i]=s1;
			
			
		 }
		
		return st;
	}
	
	
	

}
