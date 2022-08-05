package com.Assesment.Q26;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String[] args) {
		 String s1=null;
		Optional<String> op=Optional.ofNullable(s1);
		if(op.isPresent()) {
			System.out.println(s1);
		}else {
			System.out.println("String is not present");
		}
	}

}
