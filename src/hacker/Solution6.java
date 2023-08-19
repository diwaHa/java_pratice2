package hacker;

import java.util.Scanner;

public class Solution6 {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();

		try {
			if (i >= 0 && j >= 0) {
				System.out.println(i * j);
			} else {
				throw new java.lang.Exception("Breadth and height must be positive");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
