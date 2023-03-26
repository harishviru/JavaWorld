package java_logical_programs;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner scr=new Scanner(System.in);
		System.out.println("Input an Integer");
		
		while ((n=scr.nextInt())!=0) {
			System.out.println("You entered"+n);
			System.out.println("Input an integer");
		}
		System.out.println("Out of loop");

	}

}
