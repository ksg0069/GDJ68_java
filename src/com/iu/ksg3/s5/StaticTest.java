package com.iu.ksg3.s5;

public class StaticTest {
	
	public int instanceNum;
	
	public static int StaticNum;
	
	public void instanceMethod() {
		
		StaticTest.StaticNum=20;
		instanceNum=20;
		StaticTest.staticMethod();
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		
		StaticTest.StaticNum=20;
//		instanceNum =20; 오류
//		instanceMethod(); 오류    
	 	System.out.println("클래스메서드");
	}
}
