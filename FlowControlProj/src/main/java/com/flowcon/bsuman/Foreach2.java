package com.flowcon.bsuman;

public class Foreach2 {
	public static void main(String[] args) {
		int [][] a= {{10,20,30},{40,50}};
		for(int[] a1: a) {
			for (int b : a1) {
			System.out.println(b);	
			}
		}
		
	}

}
