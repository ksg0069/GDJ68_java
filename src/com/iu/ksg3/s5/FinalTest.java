package com.iu.ksg3.s5;

public final class FinalTest { //상속불가
	
	public static final int SIZE=50;   // 그외지정자 2개 이상 사용 가능 
	
	public final int MAX_NUM; //상수- 한번 입력한 값은 변경이 불가 , 직접 변경
	//멤버변수 초기화 : 직접변경, 인스턴스 블록, 생성자
	
//	{   // 인스턴스 블록
//		this.num=20;
//	}
	
	public FinalTest() {//생성자
		this.MAX_NUM=20;
	}
	
	public final void finalMethod() { //오버라이딩 불가
		final int a =10;  //상수- 한번 입력한 값은 변경이 불가
//		a=20; 에러
	}

}
