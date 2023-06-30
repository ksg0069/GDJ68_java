package com.iu.ksg3;

public class Solider {

	String grade;
	int num;
	int[] ar;
	
	public void attack(int n) {
		
		Rifle rifle = new Rifle();
		rifle.shoot1(n);
		
	}

}
