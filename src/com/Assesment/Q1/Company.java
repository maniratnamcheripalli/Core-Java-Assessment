package com.Assesment.Q1;

public class Company {
	String companyName;
	Employee b;
	EmployeeTwo c;
	public Company(EmployeeTwo d,Employee e,String a) {
		super();
		companyName=a;
		b=e;
		c=d;
		
	}
	void method() {
		System.out.println("Emp1 name: "+b.name+" ,Emp1 id :"+b.id+" ,Emp1 company: "+companyName);
		System.out.println("Emp2 name: "+c.name+" ,Emp2 id :"+c.id+" ,Emp2 company: "+companyName);
	}
	
	

}
