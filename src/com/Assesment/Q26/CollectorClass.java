package com.Assesment.Q26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorClass {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(60);
		al.add(80);
		al.add(50);
		System.out.println("Array list: "+al);
		List<Integer> list=al.stream().collect(Collectors.toList());
		Long count=al.stream().collect(Collectors.counting());
		Double a=al.stream().collect(Collectors.averagingDouble(i->i));
		System.out.println("List: "+list);
		System.out.println("No.of elements in arraylist: "+count);
		System.out.println("Average: "+a);
		
		
	}

}
