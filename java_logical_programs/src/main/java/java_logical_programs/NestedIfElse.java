package java_logical_programs;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int passingMarks,marksObtained;
		char grade;
		
		passingMarks=40;
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter your marks");
		marksObtained=scr.nextInt();
		if(marksObtained>=passingMarks) {
			if(marksObtained>90)
				grade='A';
			else if(marksObtained>75)
				grade='B';
			else if(marksObtained>60)
				grade='c';
			else
				grade='D';
			System.out.println("You passed the Exam & your Grade= "+grade);
		}
		else {
			grade='F';
			System.out.println("You failed in Exam & your Grade= "+grade);
		}
			

	}

}
