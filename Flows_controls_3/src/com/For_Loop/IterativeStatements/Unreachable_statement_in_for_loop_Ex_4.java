package com.For_Loop.IterativeStatements;

public class Unreachable_statement_in_for_loop_Ex_4 {

	public static void main(String[] args) {
		
		int a=10,b=20;
		
		for(int i=0;a<b;i++){
			System.out.println("hello");  
			}
			System.out.println("hi");    //unreachable statement but we don't get any CE
			

	}//main

}//class
