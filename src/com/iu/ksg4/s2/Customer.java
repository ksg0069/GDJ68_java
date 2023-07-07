package com.iu.ksg4.s2;

public class Customer {
	
	private int money;
	private int point;
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}
	
	public void buy(Product p) {
		
		this.money = this.money-p.getPrice();
		this.point = this.point+p.getPoint();
		
		System.out.println(this.money);
		System.out.println(this.point);
	}
	
		public void buy(Product[] pro) {
		
		for(int i=0; i<pro.length; i++) {
			
			this.buy(pro[i]);
			
	
		}
		
	
	}
	
	
	
	

}
