package src;
import java.util.ArrayList;
import java.util.Scanner;

public class P {
    public static void main(String[] args) {
       
    	Scanner s=new Scanner(System.in);
    	ArrayList<Integer> a1=new ArrayList<Integer>();
    	System.out.println("Enter Number: ");
    	for(int i=0;i<5;i++)
    	{
    		a1.add(s.nextInt());
    	}
    	System.out.println(a1);
    	
    	int max=0;
    	
    	for(Integer no:a1)
    	{
    		if(no>max)
    		{
    			max=no;
    		}
    	}
    	System.out.println("\n Bigger Number: " +max);
    }
}