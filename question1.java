package com.hongchen.lab5;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter value of a:");
		int a = scanner.nextInt();
		System.out.print("Please enter value of b:");
		int b = scanner.nextInt();
		System.out.print("Please enter value of c:");
		int c = scanner.nextInt();
		
		double discriminant = (Math.pow(b, 2) - (4 * a * c));
			
		if(discriminant > 0) {
			System.out.println("The equation has two real roots");
		}else if(discriminant == 0) {
			System.out.println("The equation has one root");
		}else {
			System.out.println("The equation has no real roots");
		}
	}
	
}
