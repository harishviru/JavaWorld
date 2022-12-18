package com.operators.assingments;

/**There is no precedence for operands before applying any operator all operands will be 
evaluated from left to right. 
 * @author SALEEM
 *
 */
public class Evaluation_order_of_java_operands_11 {

	public static void main(String[] args) {
		
		int i=1;
		i+=++i + i++ + ++i + i++;
		System.out.println(i);

	}//main

}//class
