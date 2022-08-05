package com.Assesment.Q16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvToExcel {
public static void main(String[] args) throws IOException {
	File f=new File("CsvFile.csv");
	PrintWriter pw=new PrintWriter("CsvFile.csv");
	pw.println("Name");
	pw.println("Mani");
	pw.println("Raju");
	pw.println("Vinay");
	pw.flush();
	pw.close();
	PrintWriter pw1=new PrintWriter("Excel.XLS");
	BufferedReader br=new BufferedReader(new FileReader("CsvFile.csv"));
	String i;
	while((i=br.readLine())!=null) {
		
		pw1.println(i);
	}
	pw1.flush();
	pw1.close();
	System.out.println("Succesful");
	
}
}
