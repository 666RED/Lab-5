package com.hongchen.lab5;

import java.util.Scanner;

public class question3 {
	public static void main(String[] arg) {
				
		Scanner scanner = new Scanner(System.in);

		int num1 = (int)(Math.ceil(Math.random() * 9));
		int num2 = (int)(Math.ceil(Math.random() * 9));
		System.out.print("What is " + num1 + " + " + num2 + "? ");
		int answer = scanner.nextInt();
		
		while(answer != num1 + num2) {
			if(answer == num1 + num2) {
				break;
			}else {
				System.out.print("Wrong answer. Try again. ");
				System.out.print("What is " + num1 + " + " + num2 + "? ");
				answer = scanner.nextInt();
			}
		}
		System.out.println("You got it!");
	}
}
