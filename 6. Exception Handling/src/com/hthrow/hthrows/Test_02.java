package com.hthrow.hthrows;



/**After throw statement we can't take any statement directly otherwise we will get 
compile time error saying unreachable statement. 
 * @author SALEEM
 *
 */
public class Test_02 {

	public static void main(String[] args) {
		
		//System.out.println(10/0);
		//System.out.println("hhhhh");
		
		throw new ArithmeticException("/by zero");
		//System.out.println("hhhhh");

		

	}//main

}//class

