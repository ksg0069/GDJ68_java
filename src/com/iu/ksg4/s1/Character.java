package com.iu.ksg4.s1;

public abstract class Character {
	
	private int hp;
	private int damage;
	private int level;
	
	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getDamage() {
		return damage;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public final void getItem(){
		System.out.println("아이템 줍기");
		
	}
	public abstract void hit(); //미완성


}





































