package com.Assesment.Q4;


public class ToString {
	int id;
	String name;
	
	public ToString(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id+" "+name;
		
	}

	public static void main(String[] args) {
		
		ToString t=new ToString(10, "Varun");
		ToString t1=new ToString(15, "Praveen");
		System.out.println(t);
		System.out.println(t1);
	}

}
