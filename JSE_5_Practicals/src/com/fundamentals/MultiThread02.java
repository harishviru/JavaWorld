package com.fundamentals;

public class MultiThread02 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setName("SoftWare Job");
		MyThread03.mainThread   = Thread.currentThread();
		
		MyThread03 mt =new MyThread03();
		mt.setName("Interview Cracking");
		mt.start();
		//mt.join();
		
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}
}

class MyThread03 extends Thread{
	
	static Thread mainThread;
	
	
	@Override
	public void run() {
		
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		System.out.println("Interview Success ...gotoffered letter...!");
	}
	
}