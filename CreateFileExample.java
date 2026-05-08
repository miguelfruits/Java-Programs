import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            // Specify the file name or path
            File myFile = new File("example.txt");

            // Create the file
            if (myFile.createNewFile()) {
                System.out.println("File created successfully: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
