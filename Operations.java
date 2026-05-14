package src;
import java.util.Scanner;
import java.util.ArrayList;

public class Operations {
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		  ArrayList<Integer> a1 = new ArrayList<Integer>();
		  System.out.println("\n Enter nos");
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
	System.out.println("\n Bigger no is " +max);
		
		

	}
}
