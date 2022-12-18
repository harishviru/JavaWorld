package com.operators.assingments;

public class Strings_Concatenation_operator_04 {

	public static void main(String[] args) {
		
		String a="Saleem";
		int b=10,c=20,d=30;
		
		System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);
		System.out.println(b+c+a+d);
		System.out.println(b+a+c+d);
		System.out.println("*************************");
		
//		a=b+c+d;
//      System.out.println(c);
		
		a=a+b+c;
		c=b+d;
	//	c=a+b+d;
		
		System.out.println(a);
		System.out.println(c);
		//System.out.println(c);
		
		
		

	}

}
