package java_logical_programs;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int marksObtained,passingMarks;
		
		passingMarks=40;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter marks Scored by you");
		marksObtained=scr.nextInt();
		if(marksObtained>=passingMarks)
			System.out.println("You passed the exam Congratlations");
		else
			System.out.println("failed in exam better luck next time Don't give up");

	}

}
