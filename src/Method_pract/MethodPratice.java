package Method_pract;



public class MethodPratice {
	
	//declaring a method only 
	
	//formal parameter which gets reference from the parameter been passed
	
	int maxx(int x,int y) {
		if (x>y)
		return x;
		else
			return y;
		
	}
	
	//when calling a method is in the Static class need to declare object to call the method
	
	static int increament(int a) {
		a++;
		System.out.println(a);
		return a;
		
	}
	 
	static void add(int a,int b) {
		int sum=a+b ;
		
		
	}
	public static void main(String args[]) {
		
		//actual parameter will be forwarded to formal parameter
		
		int x=10,y=9;
		int a=10;
		
		increament(a);
		System.out.println(a);
		
		MethodPratice mp = new MethodPratice();
		
		System.err.println(mp.maxx(x,y));
		
	}

}
