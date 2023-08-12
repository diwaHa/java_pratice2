package objectinclass;

class Factorial {
	void fact(int n) {
		for (int i=0;i<n;i++) {
			n=n*i;
				
		}
		System.out.println();
		
	}
	public static void main(String args) {
		new Factorial().fact(5);
	}

}	
