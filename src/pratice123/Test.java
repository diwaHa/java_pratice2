package pratice123;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str= sc.next();
	 while(str=="close") {
		 System.out.println("success");
	 }
	 System.out.println("out of the loop");
	 sc.close();
	}

}
