package com.javaworks.basic.part1;

import java.util.Scanner;

/**
 * To Print N Table upto 10
 * @author VivekVineeth
 *
 */
public class Exercise7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		int num = scanner.nextInt();
		for(int i=1;i<11;i++) {
			System.out.println(num + " * " + i +" = " + (num*i) );
		}
		scanner.close();
	}

}
