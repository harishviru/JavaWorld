package com.trye.catche.finallye;



/**finally block is it will be executed always irrespective of whether the 
exception raised or not raised and whether handled or not handled
 * @author SALEEM
 *
 */
public class Finally_07 {

	public static void main(String[] args) {
		System.out.println("*****If_There_no_Exception*****");
		If_There_no_Exception();
		System.out.println("*****If_an_exception_raised_but_the_corresponding_Catch_block_matched*****");
		If_an_exception_raised_but_the_corresponding_Catch_block_matched();
		System.out.println("*****If_an_exception_raised_but_the_corresponding_Catch_block_not_matched*****");
		If_an_exception_raised_but_the_corresponding_Catch_block_not_matched();

	}//Main
	
	public static void If_There_no_Exception() {
		
		try {
			System.out.println("try block executed");
		}//try
		catch(ArithmeticException e) {
			
			System.out.println("Catch block executed");
		}//catch
		finally {
			
			System.out.println("finally block executed");
			
		}//finally
	}//method 1
	
	
	public static void If_an_exception_raised_but_the_corresponding_Catch_block_matched() {
		
		try {
			System.out.println("try block executed");
			System.out.println(10/0);
		}//try
		catch(ArithmeticException e) {
			
			System.out.println("catch block executed");
		}//catch
		finally {
			
			System.out.println("finally block executed");
			
		}//finally
	}//method 2
	
public static void If_an_exception_raised_but_the_corresponding_Catch_block_not_matched() {
		
		try {
			System.out.println("try block executed");
			System.out.println(10/0);
		}//try
		catch(NullPointerException e) {
			
			System.out.println("catch block executed");
		}//catch
		finally {
			
			System.out.println("finally block executed");
			
		}//finally
	}//method 3

}//Class
