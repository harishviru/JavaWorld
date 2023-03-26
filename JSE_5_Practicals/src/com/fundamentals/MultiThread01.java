package com.fundamentals;

public class MultiThread01 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("P Thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());

		
		
		

		System.out.println("MultiThread01.main()");

		// Creating Thread
		MyThread01 m = new MyThread01();
		m.setName("X");
		m.start();
		
		MyThread01 m1 = new MyThread01();
		m1.setName("Y");

		m1.start();
		MyThread01 m2 = new MyThread01();
		m2.setName("Z");

		m2.start();
		// m.run();

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}

class MyThread01 extends Thread {

	@Override
	public void run() {
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println(Thread.currentThread().getName());
		System.out.println("++++++++++++++++++++++++++++++++++");
		RTM rt = new RTM();
		rt.m1();
	}

	public void run(int i) {
		System.out.println("MyThread01.run()");
	}

}

class RTM {
	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "=====> " + i);
		}

	}
}
