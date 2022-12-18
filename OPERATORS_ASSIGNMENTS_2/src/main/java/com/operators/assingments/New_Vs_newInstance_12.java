package com.operators.assingments;

/**1. new is an operator to create an objects , if we know class name at the beginning 
then we can create an object by using new operator .
2. newInstance( ) is a method presenting class " Class " , which can be used to 
create object.
3. If we don't know the class name at the beginning and its available dynamically 
Runtime then we should go for newInstance() method 
10. If dynamically provide class name is not available then we will get the 
RuntimeException saying ClassNotFoundException 
11. To use newInstance( ) method compulsory corresponding class should contains 
no argument constructor , otherwise we will get the RuntimeException saying 
InstantiationException.
 * @author SALEEM
 *
 */
public class New_Vs_newInstance_12 {
	
	public static void main(String[] args) throws Exception {
		Object o=Class.forName(args[0]).newInstance( ) ;
		System.out.println(o.getClass().getName( ) );
		}//main
	


}//class
