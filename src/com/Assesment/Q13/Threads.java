package com.Assesment.Q13;

public class Threads extends Thread {
	
	public void run() {
		System.out.println("Thread is in running state");
		System.out.println(Thread.currentThread().getName());
		try {
			System.out.println("Interrupted Thread");
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		Threads t=new Threads();
		System.out.println("Thread is Active");
		t.setName("Mani");
		t.start();
		t.join();
		System.out.println("Thread is dead");
		Thread th=new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName()); 
			}
		};
		th.start();
	}
	
	
	
}


