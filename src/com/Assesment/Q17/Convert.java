package com.Assesment.Q17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Convert {

	public static void main(String[] args) throws IOException {

		PrintWriter pw = new PrintWriter("CsvQ17.csv");
		BufferedReader br = new BufferedReader(new FileReader("Excel.XLS"));
		String i;
		while ((i = br.readLine()) != null) {

			pw.println(i);
		}
		pw.flush();
		pw.close();
		br.close();
	}

}
