package com.hthrow.hthrows;

 
/**In our program with in the try block, if there is no chance of rising an exception then we 
can't right catch block for that exception otherwise we will get compile time error 
sayingexception XXX is never thrown in body of corresponding try statement. But this 
rule is applicable only for fully checked exception. 
*****We can use throws keyword only for constructors and methods but not for classes.
 * @author SALEEM
 *
 */
public class Test_04 {

	public static void main(String[] args) {
		
	/*	try {
			System.out.println("hello");
		}
		catch(InterruptedException e){
			
		}  */
		
		try {
			System.out.println("hello");
		}
		catch (Error e){
			
		}
		
		/* We can use throws keyword only for constructors and methods but not for classes.
		 * 
		 class Test throws Exception{  //invalid
		 
		 Test() throws Exception{} // valid
		 
		 method one() throws Exception{}
		 
		 }
		 */
		

	}//main

}//class
