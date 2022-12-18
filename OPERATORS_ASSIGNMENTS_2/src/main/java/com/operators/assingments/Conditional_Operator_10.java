package com.operators.assingments;

/**Conditional Operator (? :) 
The only possible ternary operator in java is conditional operator
 * @author SALEEM
 *
 */
public class Conditional_Operator_10 {

	public static void main(String[] args) {
		
		int x=(10>20)?30:40;
		System.out.println(x);
		
		int y=(10>20)?30:((40>50)?60:70);
		System.out.println(y);

	}//main

}//class
