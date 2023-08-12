package Method_pract;


	

public class Sc112 {
	
 static int gcd(int m,int n) {
	 while(m!=n)
	 {
		 if (m>n) {
			 m-=n;
		 }
		 else
		 {
			 n-=m;
		 }
		 
			 
	 }
	return n;
	 
 }
 	static boolean validate(String n) {
 		
 	 return n.matches("[a-zA-Z\\s]+"); 
 	}
 	static boolean validate(int age) {
 		return age>=3 && age <=33;
 	}
 	static int reverse(int n) {
 		int rev=0;
 		while (n!=0) {
 			//123 -- 321
 			//456 -- 654
 			//
 			rev= rev*10+n%10;
 			n=n/10;
 			
 			
 		}
		return rev;
		
 		
 	}
 	//need to study
 	static int[] reverse(int A[]) {
 		int b[]=new int[A.length]; 
 		
 		for (int i=A.length-1,j=0;i>=0;i--,j++)
 			
 			b[j]=A[i];
 			return b;
 		
 		
 		
 	}
	public static void main(String args[]) {
		
		int arr[] = {12,13};
				
		System.out.println(gcd(25, 15)); 
		
		System.out.println(reverse(234));
		System.out.println(reverse(arr));
	}

}
