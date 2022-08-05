package com.Assesment.Q24;

import java.util.ArrayList;



public class Consume implements Consumer {
	
	@Override
	public void display(ArrayList<Integer> list) {
		list.stream().filter((i)->(i<3)||(i>7)).forEach((i)->System.out.println(i));
		
	}

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		
		Consume c=new Consume();
		c.display(al);
	}

	
	
	

}
