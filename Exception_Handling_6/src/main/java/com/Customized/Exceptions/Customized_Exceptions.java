package com.Customized.Exceptions;

/**Sometimes we can create our own exception to meet our programming requirements. 
Such type of exceptions are called customized exceptions (user defined exceptions).

 * @author SALEEM
 *
 */
class TooyoungException extends RuntimeException{
	
	TooyoungException(String s) {
		super(s);
	}//constructor
	
}//class TooyoungException

class TooOldException extends RuntimeException {
	TooOldException(String s) {
		super(s);
	}//Constructor
}//class TooOldException



public class Customized_Exceptions {

	public static void main(String[] args) {
		
		int age=70;
		System.out.println(age);
		if(age>60) {
			throw new TooyoungException("please wait some more time.... u will get best match");
		}//if block
		else if(age<20) {
			throw new TooOldException("u r age already crossed....no chance of getting married");
		}//if  else block
		else {
			System.out.println("you will get match details soon by e-mail");
		}//else block

	}//mian

}//class
