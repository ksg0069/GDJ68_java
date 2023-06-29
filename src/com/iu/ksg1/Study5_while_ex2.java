package com.iu.ksg1;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		//TRPG
		int hp=40; //user hp
		int monHp=60; //monster hp
		int monPower =random.nextInt(41); // monster power
		int select;
		int basic = random.nextInt(10); //평타
		int skill = random.nextInt(30); //스킬
		int rec = random.nextInt(41);   //회복
		boolean flag =true;			    //도망
		int skillcount=3;
		
		
		//유저 정보 :hp, mon 정보: hp
		//1.평타 2.스킬 3.hp회복 4.도망
		//평타 : 0~10 미만의 공격이 몬스터에 적용
		//스킬 : 0~30 미만의 공격이 몬스터에게 적용(최대 3번)
		//회복 : 회복량 0~40 까지 회복 최대 40까지 회복
		//도망 : 50% 확률로 성공 , 실패
		
		//몬스터 턴
		//1 : 유저공격 0~40까지 공격을 유저에게

		while(flag) {
		System.out.println("1.평타 2.스킬 3.회복 4. 도망");
		select = sc.nextInt();
		

		if(select==1) {
			//평타
			//데미지
			select = random.nextInt(10);
			monHp = monHp-select;
			System.out.println("몬스터에게" +select+ "피해를 주었습니다");
			if(monHp<1) {
				System.out.println("몬스터 죽음");
				break;
			}
				
		}else if(select ==2) { //스킬
			
			if(skillcount>0) {
				
				select = random.nextInt(30);
				monHp = monHp-select;
				System.out.println("몬스터에게" +select+ "피해를 주었습니다");
				if(monHp<1) {
					System.out.println("몬스터 죽음");
					break;
				}
				skillcount--;
			}else {
				System.out.println("마나가 부족합니다");
			}
			
		}else if(select ==3) {//회복
			
			select =random.nextInt(41);
			hp = hp+select;
			if(hp>=40) {
				hp=40;
			}
			System.out.println("hp회복");
			
		}else {
			select =random.nextInt(2);
			if(select==0) {
				System.out.println("도망 성공");
				break;
			}else {
				System.out.println("도망 실패");
			}
			
		}//유저 끝
		
		
		System.out.println("몬스터 hp " + monHp );
		
		System.out.println("몬스터 공격");
		select =random.nextInt(41);
		hp=hp-select;
		System.out.println("유저에게" +select+ "피해를 주었습니다");
		System.out.println("내 hp: " +hp);
		
		if(hp<1) {
			System.out.println("you die");
			break;
		}
		
		
		
		}//while 끝
		
	}

}
















