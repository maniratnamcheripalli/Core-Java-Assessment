package com.Assesment.Q5;

import java.util.Scanner;

public class Final {
	
	final int a;
	public Final(int b) {
		a=b;
		System.out.println("Value is "+a);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int b=sc.nextInt();
		Final f=new Final(b);
		
	}
	

}
