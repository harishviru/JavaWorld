package com.fundamentals;

import java.util.Random;

//Excepting Updation/consumer
public class HouseOwner {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("*************Started************************");

		//Here Main Thread is Owner
		Thread.currentThread().setName("House Onwer");
		
		PostBox pb =new PostBox();
		pb.start();
		synchronized(pb) {
			 System.out.println(" Main Thread is going to wait method ....its waiting for updation/letter . [Rlease the lock ....am waiting ] ");
			 System.out.println(pb.postLetterNumber+ " -->got Notification :"+pb.gotNotification);
			 pb.wait();
			 System.out.println(pb.postLetterNumber+ " -->got Notification :"+pb.gotNotification);
			 System.out.println(" Main Thread is got to notification   ");
		}
		
		System.out.println("*************Completed************************");
	}
}

//updation  provider/producer
class PostBox extends Thread{
	
	  boolean gotNotification =false;
	  int      postLetterNumber =0;
	
	@Override
	public void run() {
		synchronized (this) {
			System.out.println(" Postman ....taken the particular postbox lock .....");
			for(int i=0;i<20;i++) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("I got interrupted");
				}
				System.out.println("distribution letter no :"+i +" post ....!");
			}
			gotNotification =true;
			postLetterNumber = 1000;
			this.notify();
			System.out.println("Given the notification/updation to waiting Thread/owner and release lock");

		}
	}
}