package com.arrays.ex;

//Internally var-arg parameter implemented by using single dimensional array hence 
// within the var-arg method we can differentiate arguments by using index.

class Ex21 
{
	public static void sum(int... x)
	{
		int total = 10;
		for (int i=0;i<x.length;i++ )
		{
			total=total+x[i];
		}//for


	System.out.println("The sum :"+total);

		}//method

	public static void main(String[] args) 
	{
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30,40);

	}//main
}//class
