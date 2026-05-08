import java.io.FileWriter;
import java.io.IOException;

class WriteFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("test.txt");
            writer.write("Hello Students!\nWelcome to Java File Handling.");
            writer.close();
            System.out.println("Successfully written to file");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}