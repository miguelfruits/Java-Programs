package src;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;


public class Update {
	public static void main(String[] args) {
		
		//  Create
		try {
			File f=new File("ex3.txt");
			
			if(f.createNewFile()) {
				System.out.println("\n File Created " +f.getName());
			}else {
				System.out.println("\n File Exists");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
		
	// Update 
		
		try {
			FileWriter w=new FileWriter("ex3.txt");
			
			w.write("\n Saad");
			w.write("\n ffff");
			w.write("\n ffff");
			w.write("\n ddjbjkkd");
			w.write("\n Saad");
			
			w.close();
			
			System.out.println("\n Updated Successfully");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		
		// Delete File
		try {
			File f=new File("ex.txt");
			
			if(f.delete()) {
				System.out.println("\n File Deleted " +f.getName());
			}else {
				System.out.println("\n File Not Found");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} 
		
		// Read 
		
		try {
            File file = new File("ex3.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            } 
            

            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
           
        }
		
	}
}
