package com.Assesment.Q21;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		Operations op=new Operations();
		op.calculate(a, b);
		
	}

}
