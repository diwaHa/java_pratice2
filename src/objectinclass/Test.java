package objectinclass;
// here we are doing method overloading

public class Test {
	
    static void talk() {
    	System.out.println("Hello there");
    	
    }

    static void talk(String name) {
    	System.out.println("hello "+name);
    }
	public static void main(String[] args) {
		Test s =new Test() ;
		s.talk("mathew");
		
	}
}
