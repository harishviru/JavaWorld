package com.Constructor.saleem;

public class Sample {

	public static void main(String[] args) {
		
		int[] arr=new int[2];
		try {
			
			System.out.println(arr[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("+++++++++++++++++++++");
			System.out.println(e.toString());
			System.out.println("+++++++++++++++++++++");
			e.printStackTrace();

		}
		
	}  

}
