package com.Assesment.Q21;

import java.util.Scanner;

public class Operations {
	
	public void calculate(double a,double b) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select +,-,*,/");
		final String operator=sc.nextLine();
		switch(operator) {
		
		case "+":
			System.out.println("plus: "+(a+b));
			break;
		case "-":
			System.out.println("minus: "+(a-b));
			break;
		case "*":
			System.out.println("multiply: "+(a*b));
			break;
		case "/":
			System.out.println("divide: "+(a/b));
			break;
		default:
			System.out.println("plus: "+ (a+b));
			System.out.println("minus: "+(a-b));
			System.out.println("multiply: "+(a*b));
			System.out.println("divide: "+(a/b));
			
		}

		
	}

}
