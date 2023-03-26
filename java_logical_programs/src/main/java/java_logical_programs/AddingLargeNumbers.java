package java_logical_programs;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	public static void main(String[] args) {
		
		String number1,number2;
		
		Scanner scr =new Scanner(System.in);
		System.out.println("Enter first large number");
		number1=scr.nextLine();
		System.out.println("Enter second large number");
		number2=scr.nextLine();
		BigInteger first=new BigInteger(number1);
		BigInteger second=new BigInteger(number2);
		
		BigInteger sum;
		
		sum=first.add(second);
		
		System.out.println("Result of addition="+sum);
		

	}

}
