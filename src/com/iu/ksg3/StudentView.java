package com.iu.ksg3;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StudentView {
	
	//student 정보를 출력
	//view 메서드명
	
	public void view(Student s) {
		
		System.out.println(s.name);
		System.out.println(s.gender);
		
	}
	
	
	//viewAll
	//모든 student들 정보를 출력
	//단, viewAll 매개변수는 한개만 선언
	
	
	public void viewAll(Student[] st) {
		
		for(int i=0; i<st.length; i++) {
		System.out.println(st[i].name);
		System.out.println(st[i].gender);
		
		}
		
		
	}

}
