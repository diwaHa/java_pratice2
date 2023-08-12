package queue;

public class Queue {
	 int[] queue = new int[10];
	 int ind;
	 
	 Queue() {
	
	}
	 void enqueue(int item) {
		 queue[ind++]=item;
	 }
	 void print() {
		 
		 for(int e = queue.length-1;e>=0;e--) {
			 System.out.println(queue[e]);
		 }
	 }
		 
		 int  pop() {
			 if (ind>=0) {
				 return(queue[ind--]);
				 }
				 else {
					 System.out.println("stack is empty");
					 return -1;			 
		 }

	 
		 }
}