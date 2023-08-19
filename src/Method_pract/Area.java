package Method_pract;

//method overloading

public class Area {

	static double area(int l, int b) {
		int a = l * b;
		return (double) a;
	}

	static double area(double r) {
		double a = Math.PI * Math.pow(r, 2);
		return a;
	}

	public static void main(String args[]) {
		System.out.println(area(2, 4));
		System.out.println(area(4));
		System.out.println(Math.pow(3, 2));

	}
}
