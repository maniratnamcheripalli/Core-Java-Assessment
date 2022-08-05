package com.Assesment.Q4;

public class Equals {
	public static void main(String[] args) {
		String s1 = "Mani";
		String s2 = "Mani";
		String s3 = new String("Mani");
		String s4="100";
		if (s1.equals(s2)) {
			System.out.println("Both contents are same");
			System.out.println("s1 hashcode:- " + s1.hashCode() + " s2 hashcode :-" + s2.hashCode());
		}
		if (s1 == s3) {
			System.out.println("Both pointing to same memory location");
		} else {
			System.out.println("pointing to different location");
			System.out.println("s1 hashcode:- " + s1.hashCode() + " s3 hashcode :-" + s3.hashCode());

		}
		
		int a=Integer.parseInt(s4);
		int b=(a+10);
		System.out.println(a);
		System.out.println("adding integers "+b);
		System.out.println("String concatination "+(s4+a));
	}
}
