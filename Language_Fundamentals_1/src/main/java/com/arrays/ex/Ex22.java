package com.arrays.ex;

class Ex22 
{
	public static void sum(int...x)
	{
		int total=0;
		for (int x1 : x )
		{
			total = total+x1;
		}//for
		System.out.println("The Sum : "+total);
	}//method

	public static void main(String[] args) 
	{
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30,40);
	}//main
}//class
