package com.If.Else;

/**The argument to the if statement should be Boolean by mistake if we are providing any 
other type we will get "compile time error".
Both else part and curly braces are optional.
Without curly braces we can take only one statement under if, but it should not be 
declarative statement.
Semicolon(;) is a valid java statement which is call empty statement and it won't 
produce any output.
 * @author SALEEM
 *
 */
public class If_else {
	
/* 	public static void ex() {
		int x=0;
		if(x) {
			System.out.println("hello");
		}//if 
		else {
			System.out.println("hi");
		}//else
	}//ex()         */
	
/*	public static void ex1() {
		int x=10;
		if(x=20) {
			System.out.println("hello");
		}//if
		else {
			System.out.println("hi");
		}//else
		
	}//ex1  */
	
	public static void ex2() {
		
		int x=10;
		if (x==20) {
			System.out.println("ex-2()-hello");
		}//if
		else {
			System.out.println("ex-2()-Hi");
		}//else
		
	}//ex2
	
	public static void ex3() {
		boolean b=false;
		if(b=true) {
			System.out.println("ex-3()-Hello");
		}//if
		else {
			System.out.println("ex-3()-Hi");
		}//else
	}//ex3
	public static void ex4() {
		boolean b= false;
		if (b==true) {
			System.out.println("ex-4-Hello");
		}//if
		else {
			System.out.println("ex-4-Hi");
		}//else
	}//ex4
	
	public static void ex5() {
		if(true) {
			System.out.println("ex-5-Hello");
		}//if
	}//ex5
	
	public static void ex6() {
		if(true) {
		}//if
	}//ex6
	
/*	public static void ex7() {
		if(true) 
			int x=10;
	
	}//ex7  */
	
	public static void ex8() {
		if(true) {
			int x=10;
	
	}//if
	}//ex8
	
	public static void ex9() {
		if(true) {
     System.out.println("ex-9-Hello");	
     System.out.println("ex-9-Hi");	

	}//if
	}//ex9
	
	public static void main(String[] args) {
	//	ex();
	//	ex1();
		ex2();
		ex3();
		ex4();
		ex5();
		ex6();
	//	ex7();
		ex8();
		ex9();
		
	}//main

}//class
