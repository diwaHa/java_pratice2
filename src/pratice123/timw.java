package pratice123;

import java.util.Scanner;

public class timw {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sec =sc.nextInt();
		System.out.println("Enter ur sec ");
		int min= (sec/60)%60;
		int hrs =(sec/60)/60;
		sec = sec%60;
		System.out.println(hrs+":"+min+":"+sec);
		sc.close();
	}

}
