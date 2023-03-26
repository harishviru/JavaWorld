package java_logical_programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String Orginal, reverse="";
		Scanner scr=new Scanner(System.in);
		
		System.out.println("Enter a string to reverse");
		Orginal=scr.nextLine();
		
		int length=Orginal.length();
		for(int i=length-1;i>=0;i--)
			reverse=reverse+Orginal.charAt(i);
		System.out.println("Reverse of entered string is:"+reverse);
	}

}
