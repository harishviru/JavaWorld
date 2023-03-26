package com.WhileLoop.IterativeStatements;

public class Unreachable_statement_in_while_Ex_9 {

	public static void main(String[] args) {
		
	final int a=10,b=20;
	while (a<b) {
		System.out.println("Hi");
	}
//	System.out.println("Hello");  // CE: Unreachable code

	}//main

}//class
