package com.Assesment.Q6;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Entry {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	    try
        {
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("enter date in format yyyy-MM-dd");
        String s=sc.next();
        Date present=new Date();
        System.out.println(present);
          Date d1 = sdformat.parse(s);
          Date d2 = sdformat.parse(sdformat.format(present));
          System.out.println("The date 1 is: " + sdformat.format(d1));
          System.out.println("The date 2 is: " + sdformat.format(d2));
          if(d1.compareTo(d2) > 0) {
             System.out.println("Date 1 occurs after Date 2");
          } else if(d1.compareTo(d2) < 0) {
             System.out.println("Date 1 occurs before Date 2");
          } else if(d1.compareTo(d2) == 0) {
             System.out.println("Both dates are equal");
          }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

}
}

