package com.arrays.ex;

//For the var-arg methods we can provide the corresponding type array as argument.

class Ex24 
{
	public static void methodOne(int... i)
	{
		System.out.println("var-arg method");
	}
	public static void main(String[] args) 
	{
		methodOne(new int[]{10,20,30});
				methodOne();
						methodOne(10);
												methodOne(10,20);
	}
}
