//Write a Java program to get a list of all file/directory names in the given directory. 
//(Use your own file/directory)

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        // Specify the directory path (Change this to your own directory)
        String directoryPath = "C:\\Users\\YourName\\Documents"; // Modify accordingly

        // Create a File object
        File directory = new File(directoryPath);

        // Get list of all files and directories
        String[] fileList = directory.list();

        if (fileList != null) {
            System.out.println("Files and directories in " + directoryPath + ":");
            for (String fileName : fileList) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("The specified path is not a directory or an error occurred.");
        }
    }
}
