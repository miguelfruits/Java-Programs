package src;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueLinkedList {
	public static void main(String[] args) {
		
		// Queue
		PriorityQueue<String> pq = new PriorityQueue<String>();
		 
		 pq.add("a1");
	
		 pq.add("a2");
		 pq.add("a3");
		 System.out.println(pq);
		 
		 pq.remove();
		 
				 System.out.println(pq);
		 
		
		 
		 Stack<Integer> s1 = new Stack<Integer>();
			
			s1.push(12);
			s1.push(56);
			System.out.println(s1);
			
			s1.pop();
			System.out.println(s1);
			
			

			

	}
}
