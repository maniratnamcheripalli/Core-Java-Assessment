package com.Assesment.Q10;

public class AvgClass extends Thread {
	int a,b,avg;

	public AvgClass(int a2, int b2) {
		a=a2;
		b=b2;
	}
	public void run() {
		avg=(a+b)/2;
	}
	

}
