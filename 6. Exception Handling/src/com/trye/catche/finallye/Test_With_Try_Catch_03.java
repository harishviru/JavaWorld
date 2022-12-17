package com.trye.catche.finallye;



/**Here Normal Termination because we are handling the risky code by try catch block
 * 
 * @author SALEEM
 *
 */
public class Test_With_Try_Catch_03 {
	
	public static void main(String[] args) {
		
		System.out.println("Statment-1");
		
		try {
			System.out.println(10/0);
		}//try
		catch(ArithmeticException e){
			System.out.println(10/2);
		}//catch
		
		System.out.println("Statement-3");
		
	}//main

}//Class


