package com.fundamentals;

public class RTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		
		MyThread t = new MyThread();
		t.start();
		
	}

	
}

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

	}
}
