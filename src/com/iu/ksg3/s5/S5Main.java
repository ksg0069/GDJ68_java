package com.iu.ksg3.s5;

public class S5Main {

	public static void main(String[] args) {
		//static 
		//클래스명.클래스변수명
		//StaticTest st  = new StaticTest();
	
		StaticTest.StaticNum=20;
		
		//클래스명.메서드명()
		StaticTest.staticMethod();
		
		
		MyCar.company="Kia";
		
		MyCar myCar = new MyCar();
		myCar.brand="A7";
		
		System.out.println(myCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar.brand="SL8";
		
		
		System.out.println(myCar.company);
		System.out.println(myCar.brand);
		}

}
