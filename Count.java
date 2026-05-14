package src;
import java.io.*;


public class Count {
	public static void main(String[] args) throws FileNotFoundException {
		
		int words=0,spaces=0,character=0;
		
		try
		{
			FileReader f=new FileReader("a.txt");
			int ch;
			
			while((ch=f.read()) != -1)
			{
				character++;
				
				if(ch==' ') spaces++;
				
				if(ch==' ' || ch=='\n') words++;
				
				
			}
			f.close(); 
			
			System.out.println("\n Character: " +character);
			System.out.println("\n Spaces: " +spaces);
			System.out.println("\n Words: " +words);
			
		}
		catch(Exception e)
		{ 
			System.out.println(e.getMessage());
		}
		
		   
	}
}
