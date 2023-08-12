package inheritance;



class Circle1 {

	public double radius;

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle1 {
	public double height;

	public double volume() {

		return area() * height;
	}
}

public class Circle {
	public static void main(String args[]) {
		Cylinder c = new Cylinder() ;
		c.radius = 7;
		c.height = 10;
		System.out.println(c.volume());
		System.out.println(c.area());
	}
}