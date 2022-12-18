package com.top.ten.exceptions;

/**It is the child class of RuntimeException and hence it is unchecked. Raised 
automatically by the JVM whenever we are trying to type cast parent object to 
child
 * @author SALEEM
 *
 */
public class ClassCastException {
	
	public static void test1() {
		
		String s=new String("Saleem");
		Object o=(Object)s;
		System.out.println(o);
	}//method test1
	public static void test2() {
		
		Object o=new String("Shaik");
		String s=(String)o;
		System.out.println(s);
	}//method test2
	public static void test3() {
	
	Object o=new Object();
	String s=(String)o;
	System.out.println(s);
}//method test3
	

	public static void main(String[] args) {
		
		test1();
		test2();
		test3();

	}//main

}//class
