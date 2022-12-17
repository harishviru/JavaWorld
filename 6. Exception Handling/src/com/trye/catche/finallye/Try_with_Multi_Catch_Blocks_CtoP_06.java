package com.trye.catche.finallye;



/**Here we are able to reach to catch block of ArithmeticException 
   because of we are not handling the if before Exception
   
   (Because ArithmeticException is child of Exception(parent able to handle the child))
 * @author SALEEM
 *
 */
public class Try_with_Multi_Catch_Blocks_CtoP_06 {

	public static void main(String[] args) {

		try {
			System.out.println(10/0);
		}//catch
		catch(ArithmeticException e){
			System.out.println(10/2);
			e.printStackTrace();
		}//catch
		catch(Exception e) {
			e.printStackTrace();		
		}//catch
	}//main

}//Class
