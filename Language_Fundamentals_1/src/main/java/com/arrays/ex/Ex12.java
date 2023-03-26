package com.arrays.ex;

// Instance Variables

class Ex12 
{
	int i=10;
	public static void main(String[] args) 
	{
		//System.out.println(i); // error: non-static variable i cannot be referenced from a static context
              
			  Ex12 t=new Ex12();
			  System.out.println(t.i);
			  t.methodOne();
		
	}//main
    
	public void methodOne()
	{
		System.out.println(i);
	}//method

}//class
