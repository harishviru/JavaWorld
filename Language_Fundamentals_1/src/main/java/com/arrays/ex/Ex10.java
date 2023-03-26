package com.arrays.ex;

class Ex10 
{
	public static void main(String[] args) 
	{
		String [] argh={"A","B"};
		args=argh;
		System.out.println(args.length);

		for (int i=0;i<args.length ;i++ )
		{
			System.out.println(args[i]);
		}//for
	}//main
}//class
