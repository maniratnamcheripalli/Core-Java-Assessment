package com.Assesment.Q11;

public class ThreadOne extends Thread {
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}
	

}
