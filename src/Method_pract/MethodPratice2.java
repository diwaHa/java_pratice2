package Method_pract;


import java.security.Principal;

public class MethodPratice2 {
	
	static void change(int A[],int index,int value) {
		A[index]=value;
	}
	static void change2(int x,int value) {
		x=value;
	}
	
	public static void main(String args[]) {
		int A[] = {1,2,3,4};
		change(A,2,0);
		for(int x:A) {
		System.out.println(x);
		}
		int X = 10;
		change2(X,20);
		System.out.println("the value is "+X);
		
	}
	

}
