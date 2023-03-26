package java_logical_programs;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
		int i;
		float f;
		String s;
		
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter a String ");
		s=scr.nextLine();
		System.out.println("You Entered String is "+s);
		
		System.out.println("Enter a float value ");
		f=scr.nextFloat();
		System.out.println("You Entered float value is "+f);
		
		System.out.println("Enter a int value ");
		i=scr.nextInt();
		System.out.println("You Entered int value is "+i);
		

	}

}
