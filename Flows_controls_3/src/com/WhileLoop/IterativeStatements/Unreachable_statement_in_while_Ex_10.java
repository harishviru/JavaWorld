package com.WhileLoop.IterativeStatements;

public class Unreachable_statement_in_while_Ex_10 {

	public static void main(String[] args) {
		
	final int a=10;
	while (a<20) {
		System.out.println("Hi");
	}
//	System.out.println("Hello");  // CE: Unreachable code

	}//main

}//class

/*
 Every final variable will be replaced with the corresponding value by compiler.
 If any operation involves only constants then compiler is responsible to perform 
that operation.
 If any operation involves at least one variable compiler won't perform that 
operation. At runtime jvm is responsible to perform that operation.

 */