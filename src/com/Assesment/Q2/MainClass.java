package com.Assesment.Q2;

public class MainClass {
	public static void main(String[] args) {
		
		CollegeFirst cf=new CollegeFirst("Vignan","Hyderabad");
		CollegeSecond cs=new CollegeSecond("Cvr","Hyderabad");
		CollegeThird ct=new CollegeThird("Cvsr","Hyderabad",cf,cs);
		University u=new University("Jntuh",cs,ct);
		u.print();
		ct.print();
	}

}
