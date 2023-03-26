package com.WhileLoop.IterativeStatements;

public class Unreachable_statement_in_while_Ex_11 {

	public static void main(String[] args) {
		
	 int a=10;
	while (a<20) {
		System.out.println("Hi");  //  (infinite times).

	}
	System.out.println("Hello");  //  Unreachable code

	}//main

}//class

