package com.top.ten.exceptions;

/**It is the child class of Error and hence it is unchecked. Whenever we are trying 
to invoke recursive method call JVM will raise StackOverFloeError 
automatically. 
 * @author SALEEM
 *
 */
public class StackOverFlowError {
	
	public static void m1() {
		m2();
	}//m1 method
	
	public static void m2() {
		m1();
	}//m2 method

	public static void main(String[] args) {
		
		m1();

	}//main

}//class
