import java.io.File;
public class RenameFileExample {
    public static void main(String[] args) {
        // Specify the old file name
        File oldFile = new File("oldFile.txt");
        // Specify the new file name
        File newFile = new File("newFile.txt");
        // Rename the file
        if (oldFile.exists()) { // Check if the file exists
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully!");
            } else {
                System.out.println("Failed to rename the file.");
            }
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
