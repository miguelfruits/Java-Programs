//Write a Java program to determine the last modified date of a file.

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLastModified {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileLastModified <file path>");
            return;
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        long lastModified = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        System.out.println("Last modified date: " + sdf.format(new Date(lastModified)));
    }
}