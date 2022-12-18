package com.hthrow.hthrows;



/**We can use throw keyword only for Throwable types otherwise we will get compile time 
error saying incomputable types. 
 * @author SALEEM
 *
 */
/*
public class Test_03 {

	public static void main(String[] args) {
		
		throw new Test_03();

	}//main

}//class

*/

public class Test_03 extends RuntimeException {
	

	public static void main(String[] args) {
		
		throw new Test_03();

	}//main

}//class