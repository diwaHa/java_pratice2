package hacker;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n != 0) {

			try {
				long i = scanner.nextLong();

				System.out.println(i + " \ncan be fitted in:");
				if (i >= -128 && i <= 127) {
					System.out.println("* byte");
				}
				if (i >= -32768 && i <= 32767) {
					System.out.println("* short");
				}
				if (i >= (Integer.MIN_VALUE) && i <= Integer.MAX_VALUE) {
					System.out.println("* int");

				}
				if (i >= (Long.MIN_VALUE) && i <= Long.MAX_VALUE) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(scanner.next() + "can't be fitted anywhere.");
			}
			n--;
		}

		scanner.close();
	}
}
