package com.fundamentals;

import java.io.EOFException;

public class Child extends Parent{

	
	public void m1() throws EOFException,InterruptedException{
		System.out.println("Parent.m1()");
	}
	
}

