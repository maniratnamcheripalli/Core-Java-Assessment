package com.Assesment.Q26;

import java.util.StringJoiner;

public class StringJoinerMethod {
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",","[","]");
		sj.add("Mani");
		sj.add("Rahul");
		sj.add("Taman");
		sj.add("Pavan");
		sj.add("Techouts");
		System.out.println("String Joiner: "+sj);
		
	}
	

}
