package com.Assesment.Q9;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
public class Question {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(80);
		list.add(50);
		list.add(30);
		list.add(20);
		System.out.println(list);
		ListIterator<Integer> li= list.listIterator();
		System.out.println("***Printing in forward direction*****");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("***printing in reversr order*****");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println("*****Iterator*****");
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
