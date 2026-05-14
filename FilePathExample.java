package src;
import java.io.File;
import java.io.*;

public class FilePathExample {
    public static void main(String[] args) {

    	      // File Path
    		 File f = new File("example.txt");

    		 if(f.exists()) {
    	        System.out.println("\n File Name: " + f.getName());
    	       
    	        System.out.println("\n Absolute Path: " + f.getAbsolutePath());
    		 }else {
    			 System.out.println("\n File Does Not Exists");
    		 }
       
    		 
    		 // Directory 
    		 File f1=new File("E:\\Linux");
    		 
    		 if(f1.isDirectory())
    		 {
    			 System.out.println("\n It Is Directory");
    		 }else {
    			 System.out.println("\n It Is Not Directory");
    		 }
    		 
    		     		 
    		 
    }
}