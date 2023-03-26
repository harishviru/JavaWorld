package com.For_Loop.IterativeStatements;

public class Unreachable_statement_in_for_loop_Ex_5 {

	public static void main(String[] args) {
		
		final int a=10,b=20;
		
		for(int i=0;a<b;i++){
			System.out.println("hello");  // (infinite times).
			}
	//		System.out.println("hi");    //unreachable statement  we  get  CE
			

	}//main

}//class
