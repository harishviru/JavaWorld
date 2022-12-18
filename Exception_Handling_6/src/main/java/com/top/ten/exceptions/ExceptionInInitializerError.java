package com.top.ten.exceptions;

/**It is the child class of Error and it is unchecked. Raised automatically by the 
JVM, if any exception occurs while performing static variable initialization and 
static block execution
 * @author SALEEM
 *
 */
public class ExceptionInInitializerError {
	
	static int i=10/0;
	
	static {
		String s=null;
		System.out.println(s);
	}//static block

	public static void main(String[] args) {
		
		

	}//main

}///class
