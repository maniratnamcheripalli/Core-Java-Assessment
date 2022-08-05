package com.Assesment.Q10;

public class DisplayClass extends Thread {
	
	AvgClass e;
	AddClass f;

	public DisplayClass(AvgClass ac, AddClass ad) {
		e=ac;
		f=ad;
	}
	public void run() {
		System.out.println("Average is "+ e.avg);
		System.out.println("Sum is "+f.sum);
	}
}
