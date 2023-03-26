package com.If.Else;


/**With in the switch we can take the default only once
 If no other case matched then only default case will be executed
 With in the switch we can take the default any where, but it is convension to take 
default as last case.

 * @author SALEEM
 *
 */
public class Default_Case {

	public static void main(String[] args) {
		
		int x=10;
		switch (x) {
		default :
			System.out.println("default");
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		}

	}//main

}//class
