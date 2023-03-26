package com.fundamentals;

public class InterruptDemo {

	
	public static void main(String[] args) {
		
		
		ChildThread01 ch =new ChildThread01();
		ch.start();
		ch.interrupt();
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" -"+i);
		}
	}
	
	
}


class ChildThread01 extends Thread{
	
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+" -"+i);
				//Thread.sleep(1000);
				
			}
		} catch (Exception e) {
			System.out.println("I got interrupted /sleep got disturbed");
		}
		
	}
}
