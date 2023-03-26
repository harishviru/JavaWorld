package com.arrays.ex;

class Ex28 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<args.length ;i++ )
		{
			System.out.println(args[i]);
		}
		for (int i=0;i<=args.length ;i++ )
		{
			System.out.println(args[i]); //xception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		}
	}
}
