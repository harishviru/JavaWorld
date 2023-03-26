package com.fundamentals;

public class MultiThreaad02 {

	
	
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Visa");
		
		//
		XThread   xt =new XThread();
		xt.setName("Passport");
		xt.start();
		xt.join();
	
        
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" -"+i);
		}

	}
	
	
	
}
class XThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" -"+i);
		}
		System.out.println("Pass port done......!");
	}
}