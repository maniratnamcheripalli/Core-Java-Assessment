package com.Assesment.Q25;

import java.util.ArrayList;

public class Double implements Consumer {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		Double ou=new Double();
		ou.display(al);
	}

	@Override
	public void display(ArrayList<Integer> list) {
		System.out.println("After doubling the numbers");
		list.stream().map(i->(i*i)).forEach((i)->System.out.println(i));
		
	}

	
}
