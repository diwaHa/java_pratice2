package hacker;

import java.util.Scanner;

public class Solution3 {
	// Java Stdin and Stdout

	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		
		int myint = scanner.nextInt();
		double mydouble = scanner.nextDouble();
		scanner.nextLine();
		String myString = scanner.nextLine();

		scanner.close();
		System.out.println("String: " + myString);
		System.out.println("String: " + mydouble);
		System.out.print("String: " + myint);
	}

}
