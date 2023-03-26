package com.langfun.bsuman;

public class VariableEx {
	int x=10;
	static int y=20;
	public static void main(String[] args) {
		VariableEx v= new VariableEx();
		v.x=888;
		v.y=111;
		VariableEx v2= new VariableEx();
		System.out.println(v2.x+"  "+v2.y);
		
	}

}
