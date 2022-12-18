package com.trye.catche.finallye;



/** Here Abnormal Exception is happend because we are not handling the riskycode.
 * @author SALEEM
 *
 */
public class Test_abnormal_exception_02 {

	public static void main(String[] args) {
		
		doStuff();
		
	}//main
	
	public static void doStuff() {
		
		doMoreStuff();
		
	}//Method doStuff
	
	public static void doMoreStuff() {
		
		System.out.println(10/0);
	}// method doMoreStuff
	
}//class
