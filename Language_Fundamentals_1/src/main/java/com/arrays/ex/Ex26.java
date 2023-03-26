package com.arrays.ex;

class Ex26
{
	public static void methodOne(int[]...x)
	{
		for (int[] a:x )
		{
			 for(int val:a){ 
               System.out.println(val);
			 }
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[] l={10,20,30};
		int[]m={40,50};
		methodOne(l);
		methodOne(m);  
	}
}
