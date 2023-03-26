package java_logical_programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("Enter three integers");
		
		Scanner scr =new Scanner(System.in);
		x=scr.nextInt();
		y=scr.nextInt();
		z=scr.nextInt();
		if(x>y&&x>z)
			System.out.println("First number is largest");
		else if(y>x&&y>z)
			System.out.println("Second number is largest");
		else if(z>x&&z>y)
			System.out.println("Third number is largest");
		else
			System.out.println("Entered numbers are not distinct50");
	}

}
