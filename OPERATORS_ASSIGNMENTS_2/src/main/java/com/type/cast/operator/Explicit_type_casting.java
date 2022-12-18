package com.type.cast.operator;

/**1. Programmer is responsible for this type casting.
2. Whenever we are assigning bigger data type value to the smaller data type 
variable then explicit type casting is required.
3. Also known as Narrowing or down casting.
4. There may be a chance of lose of information in this type casting.
5. The following are various possible conversions where explicit type casting is 
required.
methos m2() When ever we are assigning higher datatype value to lower datatype value 
variable by explicit type-casting ,the most significant bits will be lost i.e., we have 
considered least significant bits.
methosm3()When ever we are assigning floating point value to the integral types by explicit 
type casting , the digits of after decimal point will be lost .
 * @author SALEEM
 *
 */
public class Explicit_type_casting {
	
	public static void m1() {
		int x=130;
		byte b=(byte)x;
		System.out.println(b);
		
	/*	int x1=130;
		byte b1=x1;
		System.out.println(b1);  */
		
	}//m1
	
	public static void m2() {
		
		int x=150;
		short s=(short) x;
		byte b=(byte) x;
		System.out.println(s);
		System.out.println(b);
		
	}//m2
	
	public static void m3() {
		double d=130.456;
		int i=(int) d;
		byte b=(byte) d;
		System.out.println(i);
		System.out.println(b);
		
	}//m3

	public static void main(String[] args) {
		System.out.println("m1()************");
		m1();
		System.out.println("m2()************");
		m2();
		System.out.println("m3()************");
		m3();
		


	}//main

}//class
