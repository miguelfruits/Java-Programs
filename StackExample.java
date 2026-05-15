package collectionexamples;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
     Stack<Integer> s1 = new Stack<Integer>();
	
	s1.push(12);
	s1.push(56);
	System.out.println(s1);
	
	s1.pop();
	System.out.println(s1);
	
	s1.pop();
	System.out.println(s1);

	s1.pop();
	System.out.println(s1);

	}

}
