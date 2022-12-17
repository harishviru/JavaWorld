package com.trye.catche.finallye;



/**There is only one situation where the finally block won't be executed is whenever we are 
using System.exit(0) method. 
When ever we are using System.exit(0) then JVM itself will be shutdown , in this case 
finally block won't be executed. 
i.e., System.exit(0) dominates finally block.
 * @author SALEEM
 *
 */
public class Finally_vs_Systemexit_09 {

	public static void main(String[] args) {
		
		try {
			System.exit(0);
		}
		catch(ArithmeticException e){
			
			System.out.println("catch block executed");
		}
		finally {
			System.out.println("final block executed");
		}
		

	}//main

}//class
