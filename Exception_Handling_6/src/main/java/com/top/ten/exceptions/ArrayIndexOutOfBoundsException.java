package com.top.ten.exceptions;

/**It is the child class of RuntimeException and hence it is unchecked. Raised 
automatically by the JVM whenever we are trying to access array element with 
out of range index
 * @author SALEEM
 *
 */
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		int[] x= new int[10];
		System.out.println(x[0]);
		System.out.println(x[100]);
		System.out.println(x[-100]);

	}//main

}//class
