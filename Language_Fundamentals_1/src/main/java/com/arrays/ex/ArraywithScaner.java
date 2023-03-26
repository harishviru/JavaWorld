package com.arrays.ex;

import java.util.Scanner;

public class ArraywithScaner {

	public static void main(String[] args) {
		
		int a[] = new int [5];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=4;i++) {
			System.out.println("ENter the Ages");
			
			a[i]=sc.nextInt();		}
		
		System.out.println("a[0] Value:="+a[0]);
		System.out.println("a[1] Value:="+a[1]);
		System.out.println("a[2] Value:="+a[2]);
		System.out.println("a[3] Value:="+a[3]);
		System.out.println("a[5] Value:="+a[4]);

	}

}

