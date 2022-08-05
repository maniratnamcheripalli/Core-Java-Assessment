package com.Assesment.Q11;

public class ThreadTwo extends Thread {
	public void run() {
		try {
			Thread.currentThread().sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName());
	}
//	System.out.println(Thread.currentThread().getPriority());

}
