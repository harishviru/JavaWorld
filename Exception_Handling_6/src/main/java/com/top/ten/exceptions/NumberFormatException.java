package com.top.ten.exceptions;

/**It is the child class of IllegalArgumentException and hence is unchecked. Raised 
explicitly by the programmer or by the API developer to indicate that we are 
attempting to convert string to the number. But the string is not properly 
formatted.
 * @author SALEEM
 *
 */
public class NumberFormatException {

	public static void main(String[] args) {
		
		int i= Integer.parseInt("10");
		int j= Integer.parseInt("ten");
		
		System.out.println(i);
	   System.out.println(j);


	}//main

}//class
