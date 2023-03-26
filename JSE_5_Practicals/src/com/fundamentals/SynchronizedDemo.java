package com.fundamentals;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread_9 t1 = new MyThread_9(d1, "dhoni");
		MyThread_9 t2 = new MyThread_9(d2, "yuvaraj");
		t1.start();
		t2.start();
	}
}

class Display {
	public static synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}
}

class MyThread_9 extends Thread {
	Display d;
	String name;

	MyThread_9(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}
