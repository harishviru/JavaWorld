package java_logical_programs;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		String s1,s2;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first String");
		s1=scr.nextLine();
		System.out.println("Enter the second String");
		s2=scr.nextLine();
		if(s1.compareTo(s2)>0)
			System.out.println("First String is grater then second String");
		else if(s1.compareTo(s2)<0)
			System.out.println("First String is smaller then second String ");
		else
			System.out.println("Two Strings are Equal");

	}

}
