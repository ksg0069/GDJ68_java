package com.iu.ksg3.s1;

public class Hap {
	
	public int h1(int num1, int num2) {
		
		int sum;
		sum = num1+num2;
		
		System.out.println(sum);
		
		return sum;
		
		
	}
	
	public boolean h2(int num) {
		//홀수먄 true. 짝수면 false;
		
		boolean result =false;
		if(num%2 == 0) {
			
			result = true;
		}else if(num%2 == 1) {
			
			
			
		}
		
		return result;
	}
	
	public int[] h3(int count) {
		//count 수만큼 정수를 담을 배열을 만들어서 리턴
		
		int[] nums = new int[count];
		
	
		return nums;
	}
	
	
	

}
