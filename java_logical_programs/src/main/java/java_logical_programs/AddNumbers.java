package java_logical_programs;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("Enter two Integer to calculate their sum");
		Scanner scr=new Scanner(System.in);
		x=scr.nextInt();
		y=scr.nextInt();
		z=x+y;
		System.out.println("Sum of Integer= "+z);
	}

}
