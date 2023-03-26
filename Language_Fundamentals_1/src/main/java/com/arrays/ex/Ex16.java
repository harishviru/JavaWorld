package com.arrays.ex;

// Static variables

class Ex16 
{
	int x=10;
	static int y=20;

	public static void main(String[] args) 
	{
		       Ex16 t=new Ex16();
			   t.x=888;
			   t.y=999;
			   Ex16 t1=new Ex16();
		System.out.println(t1.x+"-------"+t.y);
	}
}
