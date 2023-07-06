package com.iu.ksg3.s3;

public class Phone {

	String company="APPLE";
	String brand="I PHONE 15";
	
	
	{
		// instance 초기화 블럭 
		this.company="LG";
		this.brand="가로본능";
	}
	
	public Phone() { 
		this.company="SAMSUNG";
		this.brand="S20";
	}
	
	public void info() {
		System.out.println("Company: "+ this.company);
		System.out.println("Brand: "+ this.brand);
	}
	
	
}
