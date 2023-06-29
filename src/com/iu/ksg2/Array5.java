package com.iu.ksg2;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		int[] nums = new int[6];
		
		Random rd = new Random();
		//중복코드확인
		//i:0= 이면 x
		//i:1 이면 0비교
		//i:2 이면 0,1 비교
		//...
		for(int i=0; i<nums.length; i++) {
			nums[i]=rd.nextInt(45)+1;
			
			for(int j=0; j<i ;j++) {
				if(nums[i]==nums[j]) {
					i--;
				}
				
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length-i-1; j++) {
				if(nums[j] > nums[j+1]) {
	                int temp = nums[j+1];
	                nums[j+1] = nums[j];
	                nums[j] = temp;
	            }
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	
		

	}

}
