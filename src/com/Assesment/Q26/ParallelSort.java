package com.Assesment.Q26;

import java.util.Arrays;
import java.util.Scanner;

public class ParallelSort {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int b=sc.nextInt();
		int a[]= new int[b];
		
		for(int i=0;i<b;i++) {
			System.out.println("Enter "+i+" Element");
			a[i]=sc.nextInt();
		}
		Arrays.parallelSort(a);
		System.out.println("Sorted array");
		Arrays.stream(a).forEach((j)->System.out.println(j));
	}

}
