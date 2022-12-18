package com.top.ten.exceptions;

/**It is the child class of RuntimeException and hence it is unchecked. Raised 
automatically by the JVM, whenever we are trying to call any method on null.
 * @author SALEEM
 *
 */
public class NullPointerException {

	public static void main(String[] args) {
		
		String s=null;
		
		System.out.println(s.length());

	}//main

}//class
