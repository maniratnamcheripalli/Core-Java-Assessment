package com.Assesment.Q11;

public class ThreadThree extends Thread{
	public void run() {
		Thread.currentThread().setName("Raj");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}
