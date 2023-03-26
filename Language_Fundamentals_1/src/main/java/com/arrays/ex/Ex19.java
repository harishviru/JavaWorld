package com.arrays.ex;

// Un Initialized arrays

class  Ex19
{
	int [] a;
	public static void main(String[] args) 
	{
		Ex19 t1=new Ex19();
		System.out.println(t1.a);
		System.out.println(t1.a[0]); //Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local1>.a" is nullat Ex19.main(Ex19.java:11)
	}
}
