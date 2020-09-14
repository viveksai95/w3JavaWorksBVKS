package com.javaworks.basic.part1;

import java.util.Scanner;
/**
 * Calculator Operations
 * @author VivekVineeth
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number :: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number :: ");
		int num2 = scanner.nextInt();
		System.out.println(num1 + "+" + num2 + " = " + (num1+num2));
		System.out.println(num1 + "-" + num2 + " = " + (num1-num2));
		System.out.println(num1 + "*" + num2 + " = " + (num1*num2));
		System.out.println(num1 + "/" + num2 + " = " + (num1/num2));
		System.out.println(num1 + "%" + num2 + " = " + (num1%num2));
		scanner.close();
	}

}
