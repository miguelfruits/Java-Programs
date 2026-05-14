package src;
import java.io.*;

public class FileOperations {
    public static void main(String[] args) {

        
        File dir = new File("E:\\Java Materials for Practical\\File Handleing");

        if (dir.exists()) {
            String[] files = dir.list();
            System.out.println("Files in directory:");
            for (String f : files)
                System.out.println(f);
        } else {
            System.out.println("Directory not found");
        }

        // 2. Rename file
        File oldFile = new File("E:\\a1.txt"); // old name
        File newFile = new File("E:\\a2.txt"); // new name

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Rename failed No File Found");
        }
    }
}