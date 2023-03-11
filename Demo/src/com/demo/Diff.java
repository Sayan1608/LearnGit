package com.demo;

import java.util.Scanner;

public class Diff {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("Diff of "+a+" and "+b+" = " + (b-a));
	}

}
