package com.iu.ksg1;

import java.util.Random;
import java.util.Scanner;

public class Study5_while {
	public static void main(String[] args) {
		
		boolean check =true;
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int result = random.nextInt(10);
		
		while(check) {
			
			System.out.println("0~10 미만 숫자를 입력");
			int num = sc.nextInt();
			
			if(result==num) {
				System.out.println("정답입니다");
				check=false;
			}else {
				System.out.println("틀렸습니다");
			}
			
		}
		
		
	}

}
