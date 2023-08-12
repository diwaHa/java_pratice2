package Method_pract;


// method using multiple parameter

public class Sc3Method3 {
	static int sum(int ... A) {
		int s = 0;
		for (int i:A) {
		s = s + i;
		}
		return s;
	}

	// by getting various parameter	
	static int max(int ... A) {
		if(A.length<=0) return Integer.MIN_VALUE;
		int m = A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]>m) m=A[i];
		}
		return m;
	}
	
	static void pr(int ... A) {
		
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	}
	public static void main(String[] args) {
	
		System.out.println(sum(40,34));
		pr(40,34);
		System.err.println(max(20,20,20,30));
		
		// System.out.println(sum(20,20,10,40));
		

	}

}
