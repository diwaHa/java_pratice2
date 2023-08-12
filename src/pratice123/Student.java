package pratice123;

class StudentData{
	int id;
	String name;
	int rollno;	 
 

 void insert(int i,int r,String n) {
	 id = 1;
	 rollno=r;
	 name=n;
	 
 } 
 void print() {
	 System.out.println("id "+id+" \nroll "+rollno+"\nname"+name);
 }
}
class Student {
	public static void main(String []args) {
		StudentData diwa=new StudentData();
		StudentData tharun=new StudentData();
		diwa.insert(1, 022, "diwa");	
		tharun.insert(2, 023, "tharun");
		diwa.print();
		tharun.print();
		
	}


}
