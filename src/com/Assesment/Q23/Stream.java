package com.Assesment.Q23;

import java.util.ArrayList;
/* Perform calculations such as count,sum,min,avg,max for given input of arrayList using Stream API.*/

public class Stream {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		 
		System.out.println("No.of elements in arrayList :"+al.stream().count());
		System.out.println("Sum of all elemnts: "+al.stream().mapToInt(i->i).sum());
		System.out.println("Sum of all elemnts: "+al.stream().reduce(0,(i,j)->i+j));

		System.out.println("Min of all elements: "+al.stream().min((i,j) ->i.compareTo(j)).get());
		System.out.println("Max of all elements: "+al.stream().max((i,j) ->i.compareTo(j)).get());
		System.out.println("Avg of all elements: "+al.stream().mapToDouble(i->i).average().getAsDouble());
		
		
		
		

	}

}
