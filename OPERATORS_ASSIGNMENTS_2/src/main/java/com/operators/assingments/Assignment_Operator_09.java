package com.operators.assingments;

/**Compound assignment: 
1. Sometimes we can mixed assignment operator with some other operator 
to form compound assignment operator. 
In the case of compound assignment operator internal type casting will be 
performed automatically by the compiler (similar to increment and 
decrement operators.)
 * @author SALEEM
 *
 */
public class Assignment_Operator_09 {
	
	public static void simple_Assignment() {
		
		int x=10;
		System.out.println("simple_Assignment intx=10;--op:-x="+x);
		
	}//simple_Assignment()
	
	public static void chained_Assignment() {
		
		int a,b,c,d;
		a=b=c=d=10;
		System.out.println(a+"--"+b+"--"+c+"--"+d);
		int e , f , g ;
		int x=e=f=g=30;
		System.out.println(x);
		
//We can't perform chained assignment directly at the time of declaration. 
	/* 	int k=h=i=j=30;
		System.out.println(k);*/
		
	}//Chained assignment()
	
	public static void compound_Assignment() {
		
		int a=20;
		a+=20;
		System.out.println(a);
		
	/* 	byte b=10;
		b=b+1;
		System.out.println(b); */
		
		byte b=10;
		b++;
		System.out.println(b);
		
		byte c=10;
		c+=1;
		System.out.println(c);
		
		byte d=127;
		d+=3;
		System.out.println(d);
		
	}//Compound assignment()

	public static void main(String[] args) {
		System.out.println("simple_Assignment();");
		simple_Assignment();
		System.out.println("chained_Assignment();");
		chained_Assignment();
		System.out.println("compound_Assignment();");
		compound_Assignment();

	}//main

}//class
