package com.operators.assingments;

public class Short_circuit_operators {
	
	public static void m1() {
		
		int x=10, y=15;
		if(++x <10 || ++y>15) {
			
		}//if
		else {
			y++;
		}//else
		
		System.out.println(x+"**********"+y);
		
	}//m1

	public static void m2() {
		
		int x=10;
		if(++x<10 && ((x/0)>10)) {
			System.out.println("Hello");
		}//if
		else {
			System.out.println("Hi");
		}//else
		
	}//m2
	
	
	public static void main(String[] args) {
		
		m1();
		m2();
		

	}//main

}//class
