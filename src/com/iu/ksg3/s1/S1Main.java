package com.iu.ksg3.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Hap hap = new Hap();
		
		int sum = hap.h1(10, 20);
		
		//*2
		sum = sum * 2;
		
		System.out.println(sum);
		
		
		//h2 출력
		
		boolean result = hap.h2(5);
		System.out.println(result);
		
		//h3 length 출력  
		
		int[] nums = hap.h3(5);
		
		System.out.println(nums.length);
		

	}

}
