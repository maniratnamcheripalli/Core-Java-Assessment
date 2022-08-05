package com.Assesment.Q10;

import java.util.Scanner;

public class MyThread {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter two numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		AvgClass ac=new AvgClass(a,b);
		AddClass ad=new AddClass(a,b);
		DisplayClass d=new DisplayClass(ac,ad);
		ac.start();
		ad.start();
		ad.join();
		d.start();
		
		
		
		
		
	}

}