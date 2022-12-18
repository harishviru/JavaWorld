package com.operators.assingments;




/**1. Increment & decrement operators we can apply only for variables but not for 
constant values.other wise we will get compile time error .
2. We can't perform nesting of increment or decrement operator, other wise we will 
get compile time error 
3.For the final variables we can't apply increment or decrement operators ,other 
wise we will get compile time error 
4. We can apply increment or decrement operators even for primitive data types 
except boolean . 
If we are applying any arithmetic operators b/w 2 operands 'a' & 'b' the result type is 
max(int , type of a , type of b)
In the case of Increment & Decrement operators internal type casting will be performed 
automatically by the compiler

 * @author SALEEM
 *
 */
public class Increment_01 {

	public static void main(String[] args) {
		
		//increment01();
		notApllicable02();
		//nmnt_dmnt_for_pdt_xctp_bln();
		//Diff_bw_two_oprnds();

	}//main
	
	public static void increment01() {
		int x=4;
		System.out.println(x);
		int y=++x;
		System.out.println(x);
		System.out.println(y);
		
	}//method01
	
	public static void notApllicable02() {
		
	//	int x=4;
	//	int y=++4;	
	//	System.out.println(y);
		
	//	int z=4;
	//	int r=++(++z);
	//	System.out.println(r);
		
	//	final int z=10;
	//	z++;
	//	System.out.println(z);

		
	}//method02
	
	public static void nmnt_dmnt_for_pdt_xctp_bln() {
		
		int x=10;
		x++;
		System.out.println(x);
		
		char ch='s';
		ch++;
		System.out.println(ch);
		
		double d=10.5;
		d++;
		System.out.println(d);
		
	//	boolean b=true;
	//	b++;
	//	System.out.println(b);    //Type mismatch: cannot convert from boolean to int

		
	}//method3
	
	public static void Diff_bw_two_oprnds()//Difference between b++ and b = b+1
	{
		byte a=10;
		byte b=20;
		byte c=(byte) (a+b);
		System.out.println(c);
		
		byte d=10;
		byte f=(byte) (d+1);
		System.out.println(f);
		
		
		
	}

}//class
