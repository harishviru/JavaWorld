package com.top.ten.exceptions;

/**It is the child class of RuntimeException and hence it is unchecked. Raised 
explicitly by the programmer (or) by the API developer to indicate that a method 
has been invoked with inappropriate argument.
 * @author SALEEM
 *
 */
public class IllegalArgumentException {

	public static void main(String[] args) {
		
		Thread t=new Thread();
		t.setPriority(10);
		System.out.println(t);
		t.setPriority(7);
		System.out.println(t);
		t.setPriority(11);
		System.out.println(t);

	}//main

}//class
