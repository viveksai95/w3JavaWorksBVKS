package com.javaworks.basic.part1;

import java.util.Scanner;

/**
 * Multiplication of 2 numbers
 * @author VivekVineeth
 *
 */
public class Exercise5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number :: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number :: ");
		int num2 = scanner.nextInt();
		System.out.println("The multiplication of the 2 numbers are :: " + (num1*num2));
		scanner.close();
	}

}
