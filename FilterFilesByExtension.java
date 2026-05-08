//Write a Java program to get specific files with extensions from a specified folder.
import java.io.File;
import java.io.FilenameFilter;
//Write a Java program to get specific files with extensions from a specified folder.
public class FilterFilesByExtension {
    public static void main(String[] args) {
        // Specify the directory path (Modify this path accordingly)
        String directoryPath = "C:\\Users\\Administrator.MCALAB-07-65\\Desktop\\jdbc";
        String extension = ".txt"; // Change to desired extension
        File directory = new File(directoryPath); 
        if (directory.isDirectory()) {
            // Create a FilenameFilter to filter files by extension
FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith(extension);  
            // Get filtered file list
            File[] files = directory.listFiles(filter);
            
            if (files != null && files.length > 0) {
                System.out.println("Files with extension " + extension + " in " + directoryPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("No files with extension " + extension + " found in " + directoryPath);
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }
}