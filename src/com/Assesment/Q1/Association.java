package com.Assesment.Q1;

public class Association {

	public static void main(String[] args) {
		
		Employee e=new Employee("ManiRatnam",1955);
		EmployeeTwo e1=new EmployeeTwo ("Raj",1953);
		
		Company c=new Company(e1,e,"Techouts");
		c.method();
		
	}

}
