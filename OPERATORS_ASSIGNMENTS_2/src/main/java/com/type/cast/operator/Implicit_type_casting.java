package com.type.cast.operator;

/**1. The compiler is responsible to perform this type casting.
2. When ever we are assigning lower datatype value to higher datatype variable 
then implicit type cast will be performed .
3. It is also known as Widening or Upcasting.
4. There is no lose of information in this type casting.
5. The following are various possible implicit type casting.

 * @author SALEEM
 *
 */
public class Implicit_type_casting {

	public static void main(String[] args) {
		
		int x='a';
		System.out.println(x);
//Note: Compiler converts char to int type automatically by implicit type casting.
		double d=10;
		System.out.println(d);
//Note: Compiler converts int to double type automatically by implicit type casting. 		
		
		

	}//main

}//class
