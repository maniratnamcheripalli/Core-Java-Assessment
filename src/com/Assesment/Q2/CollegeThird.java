package com.Assesment.Q2;

public class CollegeThird {
	String name,location;
	CollegeFirst f;
	CollegeSecond s;
	
	public CollegeThird(String name, String location, CollegeFirst cf, CollegeSecond cs) {
		super();
		this.name = name;
		this.location = location;
		f=cf;
		s=cs;
	}

	public void print() {
		System.out.println("ClgName: "+f.name+" ,ClgLocation "+f.location);
		System.out.println("ClgName: "+s.name+" ,ClgLocation "+s.location);
		
		
	}
}
