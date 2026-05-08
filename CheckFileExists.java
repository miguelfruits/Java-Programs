//Write a Java program to check if a file or directory specified by pathname exists or not.
import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        // Specify the file or directory path (Modify this path accordingly)
        String path = "D:\\Sample.txt"; // Change as needed
        
        File file = new File(path);
        
        if (file.exists()) {
            System.out.println("The specified file/directory exists.");
            if (file.isFile()) {
                System.out.println("It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("The specified file/directory does not exist.");
        }
    }
}