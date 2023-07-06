package com.iu.ksg3.s3;

public class Car {
	
	String company; //제조회사
	String brand;
	public String color;
	int price=9885;
	
	//생성자(Constructor)
	//접근지정자 메서드명(클래스명과 동일)([매개변수 선언]){}
	public Car() {
		//기본 생성자
		this("A7");
		
//		company="AUDI";
//		brand="A7";
//		color="black";
//		price=9885;
	}
	
	public Car(String brand) {
		
		this(brand, "black");
//		company="AUDI";
//		this.brand= brand;
//		color="black";
//		price=9885;
	}
	
	public Car(String brand, String color) {
		
		this(brand,color,9985);
//		company="AUDI";
//		this.brand= brand;
//		this.color= color;
//		price=9885;
		
	}
	
	public Car(String brand, String color, int price) {
		
		company="AUDI";
		this.brand= brand;
		this.color= color;
		this.price=price;
		
		
	}
	public void info() {
		
		System.out.println("Company: " + this.company);
		System.out.println("Brand: " + this.brand);
		System.out.println("Color: " + this.color);
		System.out.println("Wheel: " + this.price);
		
	}
	
}
