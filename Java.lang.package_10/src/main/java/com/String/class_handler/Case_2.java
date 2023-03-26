package com.String.class_handler;

public class Case_2 {

	public static void main(String[] args) {

		String s1=new String ("shaik");
		String s2=new String ("shaik");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1=new StringBuffer("saleem");
		StringBuffer sb2=new StringBuffer("saleem");
		StringBuffer sb3=sb1;
		
		System.out.println(sb1==sb2);
		System.out.println(s1.equals(sb2));
		System.out.println(sb1==sb3);

		
	}

}
