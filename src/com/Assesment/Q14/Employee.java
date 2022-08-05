package com.Assesment.Q14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee {

	public void create() throws IOException {
		File f = new File("Employee.txt");
		f.createNewFile();
	}

	public void write() throws IOException {
		PrintWriter pw = new PrintWriter("Employee.txt");
		pw.println("Name: Maniratnam");
		pw.println("EmpId: 1955");
		pw.println("Company: Techouts");
		pw.flush();
		pw.close();
	}

	public void read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Employee.txt"));
		String i;
		while ((i = br.readLine()) != null) {
			System.out.println(i);
		}
		br.close();

	}

}
