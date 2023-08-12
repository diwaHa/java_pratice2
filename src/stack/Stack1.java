package stack;

public class Stack1 {
 
	int stac[] =  new int [10];
	int tos;
	
	Stack1() {
		tos=-1;
	}
	
	void push(int item) {
		if (tos==3) {
			System.out.println("stack is full");
		}
		else
				stac[++tos]=item;		
		}

	
	int pop() {
		 if (tos>=0) {
		 return(stac[tos--]);
		 }
		 else {
			 System.out.println("stack is empty");
			 return -1;
			 
		 }
		 
	 }
	 
	 
}
