package com.trye.catche.finallye;



/**return Vs finally:
Even though return statement present in try or catch blocks first finally will be executed 
and after that only return statement will be considered. i.efinally block dominates 
return statement.
 * @author SALEEM
 *
 */
public class Return_vs_Finally_08 {
	
	public static void main(String[] args) {
		
		System.out.println("*****If_There_no_Exception*****");
		If_There_no_Exception();
		System.out.println("*****Finally block return*****");
		int s= finally_block_return();
		System.out.println(s);
		
	}//main
	
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

    public static int finally_block_return(){
    	
    	try {
    		System.out.println(10/0);
    		return 777;
    	}
    	catch(ArithmeticException e) {
    		return 888;
    	}
    	finally {
    		return 786;
    	}
    }


}//Class
