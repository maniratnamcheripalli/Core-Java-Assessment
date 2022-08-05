package com.Assesment.Q20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(50);
		al.add(10);
		al.add(90);
		al.add(50);
		al.add(60);
		System.out.println(al);
		System.out.println("*****Iterator******");
		Iterator <Integer> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*****ListIterator******");
		ListIterator<Integer> li=al.listIterator();
	
		while(li.hasNext()) {
			System.out.println(li.next());
			System.out.println("Index: "+li.nextIndex());
		}
		System.out.println("****Reverse Order*****");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			System.out.println("Index : "+li.previousIndex());
		}
		
	}
}