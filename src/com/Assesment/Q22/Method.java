package com.Assesment.Q22;

/*22. Provide an interface Company with 
	default method of return type double calculating the profit(CP-SP)
	static method of return type String which takes (double) input from previous 
	method and returns company name.
	Abstract method String getCompDetails(double profit,String name);=>Needs to 
	be implemented using Lambda expression.*/
interface Company {
	abstract String getCompDetails(double profit,String name);

	default double calculate(double cp, double sp) {

		double  profit =cp-sp;
		return profit;
	}

	static String companyName() {
		String name = "Techouts";
		return name;
	}
}

public class Method {
	
	public static void main(String[] args) {
		
		Company c=(profit,name)->{
			String n=name+" "+Double.toString(profit);
		     return n;
			
		};
		System.out.println(c.getCompDetails(c.calculate(20.5d, 10.5),Company.companyName()));
		
		
		


	}

}
