package com.arrays.ex;

class Ex9 
{
	public static void main(String[] args) 
	{
		String [] argh={"A","B"};
		args=argh;
		System.out.println(argh.length);

		for (int i=0;i<=args.length;i++)
		{
           //System.out.println(args[i]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0at Ex9.main(Ex9.java:11)
		
		}//for
	}//main
}//class
