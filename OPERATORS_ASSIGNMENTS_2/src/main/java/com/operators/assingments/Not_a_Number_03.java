package com.operators.assingments;




/**NaN(Not a Number) in integral arithmetic (byte , short , int , long) there is no 
way to represent undefine the results. Hence the result is undefined we will get 
ArithmericException in integral arithmetic
But floating point arithmetic (float , double) there is a way to represents 
undefined the results .
For the Float , Double classes contains a constant NaN , Hence the result is 
undefined we won't get ArithmeticException in floating point arithmetics .
 * @author SALEEM
 *
 */
public class Not_a_Number_03 {
	
	public static void main(String[] args) {
		
		System.out.println(0.0/0.0);
		System.out.println(-0.0/0.0);
		
		System.out.println(10<Float.NaN);
		System.out.println(10<=Float.NaN);
		System.out.println(10>Float.NaN);
		System.out.println(10>=Float.NaN);
		System.out.println(10==Float.NaN);
		System.out.println(Float.NaN==Float.NaN);
		System.out.println(10!=Float.NaN);
		System.out.println(Float.NaN!=Float.NaN);
		

	}

}
