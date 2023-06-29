package com.iu.ksg2;

public class Array6 {
	public static void main(String[] args) {
		
		double[] ar = new double[3];
		
		ar[0]=1.2;
		ar[1]=3;
		
		int[] nums1 = new int[3];
		int[] nums2 = new int[3];
		
		System.out.println(nums1 == nums2);
		nums1 =nums2;
		System.out.println(nums1==nums2);
		
//		int[][] ars = new int[2][3];
		
		int [][] ars= {{1,2},{3,4}};
		
		ars = new int[2][];
		ars[0] = new int[3];
		ars[1] = new int[6];    //쓰기전에는 비워둔것을 선언 해줘야 함

		for(int i=0; i<ars.length; i++) {
			for(int j=0; j< ars[i].length; j++) {
				System.out.println(ars[i][j]);
				
			}
		}
	}

}
