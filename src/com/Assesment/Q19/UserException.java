package com.Assesment.Q19;

import java.util.Scanner;

public class UserException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		try {
			if ((name.length()) < 10 || name.contains("&")) {

				throw new InvalidUserName("Invalid user name");
			} else {
				System.out.println(name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
