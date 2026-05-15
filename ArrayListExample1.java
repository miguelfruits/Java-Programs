package collectionexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		  ArrayList<Integer> a1 = new ArrayList<Integer>();
		  System.out.println("Enter nos");
           for(int i= 0;i<5;i++)
           {
        	   a1.add(sc.nextInt());
           }
            
	    System.out.println(a1);

	      int max=0;
	      
	      for(Integer no : a1)
	      {
	    	   if(no>max)
	    	   {
	    		   max=no;
	    	   }
	      }
	System.out.println("Bigger no is " + max);
	}

}
