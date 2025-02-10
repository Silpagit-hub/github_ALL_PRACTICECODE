package com.javaCore;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();

		try {
			if (age >= 18) {
				System.out.println("You are eligible to vote.");
			} else {
				throw new UnderAge("You are under age.");
			}
		} catch (UnderAge e) {
			System.out.println(e.getMessage());
		}
	}
}

class UnderAge extends RuntimeException {

	public UnderAge(String msg) {
		super(msg);
	}
}