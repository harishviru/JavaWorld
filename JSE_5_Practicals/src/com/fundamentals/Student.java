package com.fundamentals;

import java.util.ArrayList;
import java.util.Random;

public class Student {
	
	private int studId;
	private String studName;
	private String schoolName;
	
	public Student(int studId,String studName,String schoolName) {
		this.studId=studId;
		this.schoolName=schoolName;
		this.studName=studName;
	}
	
	public static void main(String[] args) {
		Student stud =new Student(100, "Virat", "XYZ School");
		System.out.println(stud);    //stud.toString()
		Student studOne =new Student(200, "YuvaRaj", "ABC School");
		System.out.println(studOne);    //stud.toString()
		System.out.println("+++++++++++++++++++++++++");
		String s1=new String("Gopal");
		System.out.println(s1);   //s1.toString()
		
		StringBuffer sb =new StringBuffer("Saleem");
		System.out.println(sb);      //sb.toString()
		
		Voter v =new Voter("Ramesh",20);
		System.out.println(v);       //v.toString()
	
		Random ra =new Random();
		System.out.println(ra);
		
		
	}

	@Override
	public String toString() {
		   return "Student [studId=" + studId + ", studName=" + studName + ", schoolName=" + schoolName + "]";
         //return super.toString();    
	}
	
	
	
	
	
}
