package com.operators.assingments;

/**We can use the instanceof operator to check whether the given an object is 
perticular type or not*****To use instance of operator compulsory there should be some relation between 
argument types (either child to parent Or parent to child Or same type) 
Otherwise we will get compile time error saying inconvertible types 
instanceof an operator which can 
be used to check whether the 
given object is perticular type or 
not 
We know at the type at beginning 
it is available 
 * @author SALEEM
 *
 */
public class Instanceof_operator_07 {

	public static void main(String[] args) {
		
		Thread t= new Thread();
		System.out.println(t instanceof Thread );
		System.out.println(t instanceof Object );
		System.out.println(t instanceof Runnable);
		
		Thread t1 = new Thread();
		//System.out.println(t1 instanceof String);
		
//Whenever we are checking the parent object is child type or not by using 	instanceof operator that we get false. 
		System.out.println("*************");
		
		Object o = new Object();
		System.out.println(o instanceof String);
		
		Object o1 = new String("Saleem");
		System.out.println(o1 instanceof String);

		System.out.println(null instanceof Object);
		
	}//main

}//class
