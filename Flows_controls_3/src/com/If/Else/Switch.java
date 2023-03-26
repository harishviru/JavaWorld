package com.If.Else;

/**If several options are available then it is not recommended to use if-else we should go 
for switch statement.Because it improves readability of the code.
Until 1.4 version the allow types for the switch argument are byte, short, char, int but 
from 1.5 version on wards the corresponding wrapper classes (Byte, Short, Character, 
Integer) and "enum" types also allowed.
 Curly braces are mandatory.(except switch case in all remaining cases curly 
braces are optional )
 Both case and default are optional.
 Every statement inside switch must be under some case (or) default. Independent 
statements are not allowed.
 * @author SALEEM
 *
 */
public class Switch {
	
/*	public static void ex1() {
		int x=10;
		switch(x) {
		System.out.println(x);
		}//switch
		
	}//ex1   */
//Every case label should be "compile time constant" otherwise we will get compile time error.	
/*	public static void ex2() {
		int x=10;
		int y=20;
		switch(x) {
		case 10:
			System.out.println("10");
		case y: 
			System.out.println("20"); 
		}//switch
		
	}//ex2 */
//If we declare y as final we won't get any compile time error. 	
	public static void ex3() {
		int x=10;
		final int y=20;
		switch(x) {
		case 10:
			System.out.println("10");
		case y: 
			System.out.println("20"); 
		}//switch
		
	}//ex3
//But switch argument and case label can be expressions , but case label should be constant expression.
	
	public static void ex4() {
		System.out.println("NO Output :- ex-4:-Every case label should be within the range of switch argument type.\r\n"
				+ "");
		int x=10;
		switch(x+1) {
		case 10:
		case 10+20:
		case 10+20+30:
		
//Every case label should be within the range of switch argument type.
			
		}//switch
	}//ex4
	
	public static void ex5(){
		byte b=10;
		switch(b) {
		case 10:
			System.out.println("10");
		case 100:
			System.out.println("100");
	//	case 1000: // Type mismatch: cannot convert from int to byte
		//	System.out.println("1000");
		}//switch
	}//ex5	
	
	public static void ex6() {
		byte b=10;
		switch (b+1) {
		
		case 11:
			System.out.println("10");
		case 100:
			System.out.println("100");
		case 1000:
			System.out.println("1000");
		}//switch
	}//ex6
	
	public static void ex7() {
		int x=99;
		switch(x) {
		case 97:
			System.out.println("97");
		case 99:
			System.out.println("99");
	//	case 'a':                     // Duplicate case labels are not allowed
			System.out.println("a");
		}//switch
	}//ex7
	
	public static void main(String[] args) {
		//ex1();
		//ex2();
		//ex3();
		//ex4();
		//ex5();
		//ex6();
		ex7();

	}//main

}//class


