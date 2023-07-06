package com.iu.ksg3.s4;

public class Product {
	
	private String name;   //멤버변수의 접근지정자는 대부분 private를 씀 
	private int price;
	
	public void setPrice(int price) {
		
		if(price<1) {
			this.price=1000;
		}
		this.price=price;
		
	}
	
	public int getPrice() {
		
		if(price<1) {
			this.price=1000;
		}
		return this.price;
		
	}

	
	public void info() {
		System.out.println(this.name);
	}

}
