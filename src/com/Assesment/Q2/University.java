package com.Assesment.Q2;

public class University {
	String universityName;
	CollegeSecond s;
	CollegeThird t;

	public University(String universityName, CollegeSecond cs, CollegeThird ct) {
		super();
		this.universityName = universityName;
		s=cs;
		t=ct;
	}

	public void print() {
		
		System.out.println("UniversityName: "+universityName+" ,ClgName: "+t.name+" ,ClgLocation "+t.location);
		System.out.println("UniversityName: "+universityName+" ,ClgName: "+s.name+" ,ClgLocation "+s.location);
		
	}
	
	

}
