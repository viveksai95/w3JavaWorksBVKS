package com.javaworks.basic.part1;

import java.util.Scanner;

/**
 * Solutions for Exercise1 :: Scanner Class Input
 * @author VivekVineeth
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name: "); //Reading input from Console
		String userName = scanner.next();
		System.out.println("Hello "+ userName); //Printing output to Console
		scanner.close();
	}

}
