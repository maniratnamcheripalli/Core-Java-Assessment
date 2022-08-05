package com.Assesment.Q15;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee {
	public static void main(String[] args) throws IOException  {
		File file=new File("Assesment.txt");
		PrintWriter pw=new PrintWriter(file);
		pw.println("Name: Maniratnam");
		pw.println("Company: Techouts");
		pw.println(1955);
		pw.close();
		file.setReadOnly();
		
	}

}
