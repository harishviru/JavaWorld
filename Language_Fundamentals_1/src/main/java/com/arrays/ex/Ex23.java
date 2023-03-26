package com.arrays.ex;

/*In general var-arg method will get least priority that is if no other method matched then 
only var-arg method will get the chance this is exactly same as default case inside a 
switch.*/


class Ex23
{
	public static void methodOne(int i)
	{
		System.out.println("general method");
	}// method 1

	public static void methodOne(int... i)
	{
		System.out.println("var-arg- method");
	}
	public static void main(String[] args) 
	{
		methodOne(10);
		methodOne();
		methodOne(10,20);
		
	}
}
