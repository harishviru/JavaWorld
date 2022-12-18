package com.top.ten.exceptions;

/**It is the child class of RuntimeException and hence it is unchecked. Raised 
explicitly by the programmer or by the API developer to indicate that a method 
has been invoked at inappropriate time.Once session expires we can't call any method on the session object otherwise we 
will get IllegalStateExceptio
 * @author SALEEM
 *
 */
public class IllegalStateException {

	public static void main(String[] args) {
		
	/*	HttpSession session=req.getSession();
		System.out.println(session.getId());
		session.invalidate();
		System.out.println(session.getId()); */
	}//main

}//class
