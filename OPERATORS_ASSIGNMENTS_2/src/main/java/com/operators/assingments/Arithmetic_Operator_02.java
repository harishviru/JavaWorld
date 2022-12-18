package com.operators.assingments;




/**In integral arithmetic (byte , int , short , long) there is no way to represents 
infinity , if infinity is the result we will get the ArithmeticException / by zero 
System.out.println(10/0); // output RE : ArithmeticException / by zero 
But in floating point arithmetic(float , double) there is a way represents infinity. 
System.out.println(10/0.0); // output : infinity 

Hence , if infinity is the result we won't get any ArithmeticException in floating 
point arithmetics 

 * @author SALEEM
 *
 */
public class Arithmetic_Operator_02 {
	
	public static void main(String[] args) {
		
 	/*   byte+short=int 
		 short+short=int
		 short+long=long
		 double+float=double
		 int+double=double
		 char+char=int
		 char+int=int
		 char+double=double   */
		
		char a = 'a';
		int  b=a;
		System.out.println(b);
		System.out.println('a'+'b');
		System.out.println('a'+1);
		System.out.println('a'+1.2);
		
		m01();

	
		
	}//main
	
	public static void m01() {
		
		System.out.println(10/0.0);
		//System.out.println(10/0);
		
		//POSITIVE_INFINITY 
		//NEGATIVE_INFINITY
		
		System.out.println(10/0.0);
		System.out.println(-10/0.0);
		
	}//m01

}//class
