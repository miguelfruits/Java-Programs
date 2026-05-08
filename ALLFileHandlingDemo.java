import java.io.*;
import java.util.Scanner;

class ALLFileHandlingDemo {
    public static void main(String[] args) {
        try {
            // 1. Create File
            File file = new File("student.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }

            // 2. Write to File
            FileWriter writer = new FileWriter(file);
            writer.write("Hello Students!\n");
            writer.write("This is File Handling in Java.\n");
            writer.close();
            System.out.println("Data written successfully");

            // 3. Append to File
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("This line is appended.\n");
            appendWriter.close();
            System.out.println("Data appended successfully");

            // 4. Read from File
            Scanner sc = new Scanner(file);
            System.out.println("\nReading file content:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}