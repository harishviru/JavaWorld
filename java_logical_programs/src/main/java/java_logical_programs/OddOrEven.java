package java_logical_programs;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int x;
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter an integer to check if it is odd or even ");
		x=scr.nextInt();
		if(x%2==0)
			System.out.println(x+"is an Even Number");
		else 
			System.out.println(x+"is an Odd Number");

	}

}
