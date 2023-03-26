package com.fundamentals;

public class IThread {

	
	
	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().setName("Male Thread");
		FThread.mThread        =Thread.currentThread();
		
		
		FThread f =new FThread();
		f.setName("FeMale");
		f.start();
		f.join();
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}

class FThread extends Thread{
	
	static Thread mThread;
	
	
	@Override
	public void run() {
		
		try {
			mThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		System.out.println("Ok.....");
	}
}