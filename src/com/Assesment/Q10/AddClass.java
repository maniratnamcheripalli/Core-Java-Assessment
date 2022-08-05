package com.Assesment.Q10;

public class AddClass extends Thread {
	int c,d,sum;
	public AddClass(int a2,int b2) {
		c=a2;
		d=b2;
	}
	public void run() {
		sum=c+d;
	}
}

