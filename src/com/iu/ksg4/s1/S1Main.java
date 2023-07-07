package com.iu.ksg4.s1;

public class S1Main {

	public static void main(String[] args) {
		
		Warrior warrior = new Warrior();
		warrior.getItem();
		
		Magician magician = new Magician();
		magician.getItem();
		
		
//		warrior.axe.name="sdf";
		Character character = magician;
		
		magician.setMp(20);
		magician=(Magician)character;
		magician.setMp(0);
		
		character = warrior;
		
		Character[] w = new Character[2];
		w[0]=warrior;
		w[1]=magician;
		
		magician = (Magician)w[1];
		magician.setMp(20);
		
		
		//=----------------------------------------
//		Character ch1 = new Character();
//		magician = (Magician)ch1;
//		magician.setMp(0);                   // mp에 접근 불가능 형변환 하더라도 부모타입에는 mp가 없으므로 

		
		
		
		
		
		
		

	}

}
