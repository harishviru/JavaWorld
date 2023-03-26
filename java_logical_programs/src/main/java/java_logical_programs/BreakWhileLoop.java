package java_logical_programs;

import java.util.Scanner;

public class BreakWhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner scr=new Scanner(System.in);
		
		while(true) {
			System.out.println("Input an Integer");
			n=scr.nextInt();
			
			if(n==0) {
				break;
			}
			System.out.println("You entered"+n);
		}
	}

}
