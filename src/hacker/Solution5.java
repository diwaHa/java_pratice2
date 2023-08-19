package hacker;

import java.util.Scanner;

public class Solution5 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		while (n > 1) {
			if (scan.hasNext()) {
				String line = scan.nextLine();
				System.out.print(n + "" + line);
				n++;
			}
		}
		scan.close();
	}

}
