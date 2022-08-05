package com.Assesment.Q27;

import java.io.File;
import java.io.IOException;

public class Catches {
	public static void main(String[] args) {
		
		try {
			int[] a = new int[5];
			
			File f = new File("catch.txt");
			f.createNewFile();	
			int b = 10 / 0;
			System.out.println(a[6]);
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
