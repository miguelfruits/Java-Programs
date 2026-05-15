package collectionexamples;

import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListExample {
	public static void main(String[] args) {

     LinkedList<Float> l1 = new LinkedList<Float>();
	l1.add(6.87f);
	l1.add(67.98f);
	l1.add(6.7f);
	l1.add(6.8f);
	l1.add(7.8f);
	l1.remove(0);
	
	   java.util.Iterator<Float> ir1 = l1.iterator();
	   while(ir1.hasNext())
	   {
		   System.out.println(ir1.next());
	   }

	   l1.add(4, 7.8f);
	   
	   System.out.println(l1);
	}

}
