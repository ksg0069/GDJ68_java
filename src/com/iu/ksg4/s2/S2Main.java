package com.iu.ksg4.s2;

public class S2Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModelName("갤럭시북");
	    computer.setCpu("i9");
	    computer.setColor("white");
	    computer.setPrice(2000000);
	    computer.setPoint(30);
	
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModelName("LGM");
		tv.setInch(100);
		tv.setColor("black");
		tv.setPrice(3000000);
		tv.setPoint(40);

		Phone phone = new Phone();
		phone.setCompany("Apple");
		phone.setModelName("IPHONE 14");
		phone.setOs("IOS");
		phone.setColor("red");
		phone.setPrice(1000000);
		phone.setPoint(15);
		
		
		Customer customer = new Customer();
		
//		customer.buy(computer); 한개
		
		//두개
		Product[] products = new Product[2];
		products[0]=tv;
		products[1]=phone;
		
		customer.buy(products);
		
		
		

	}

}
