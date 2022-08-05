package com.Assesment.Q14;

import java.io.IOException;

public class Manager extends Employee {

	public static void main(String[] args) throws IOException  {
		Manager ma=new Manager();
		//Employee e=new Manager();
		ma.create();
		ma.write();
		ma.read();
	}
}

