package com.iu.ksg3;

public class StudyMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		
//		Card card = new Card();
//		Card card2 = new Card();
//		
//		card.cardNum =3.1;
//		System.out.println(card.cvc);
//		System.out.println(card.name);
//		
		Student s1 = new Student();
		s1.name="ksg";
		s1.gender='M';
		
		Student s2 = new Student();
		s2.name="iu";
		s2.gender='F';
		
		
		StudentView SV = new StudentView();
		SV.view(s1); //주소를 보냄

		Student[] st1 = new Student[2];
		st1[0]= s1;
		st1[1]= s2;
		
		SV.viewAll(st1);
		
		
	
		
		
		
//		Student s2 = new Student();
//		s2.name="iu";
//		s2.gender='F';
//		
//		Student[] students = new Student[3];
//		students[0]= s1;
//		students[1]= s2;
//		
//		System.out.println(students[2].name); //java.lang.NullPointerException 옲
//		
//		for(int i=0; i<students.length; i++) {
//			
//			System.out.println(students[i].name);
//			System.out.println(students[i].id);
//		}
		
		
//		
//		s2=s1;
//		System.out.println(s2.name); // 얕은 복사 s2가 GC가 됨
		
		
		
		
		
		
	
	
		System.out.println("프로그램 종료");
	}

}
