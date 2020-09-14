package com.javaworks.basic.part1;

import java.util.Scanner;

/**
 * Addition of 2 numbers using Scanner
 * @author VivekVineeth
 *
 */
public class Exercise2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number :: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number :: ");
		int num2 = scanner.nextInt();
		System.out.println("The sum of the 2 numbers are :: " + (num1+num2));
		scanner.close();
	}

}
