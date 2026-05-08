import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WritePositiveNumbersToFile {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        String filename = "positive_numbers.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            while (true) {
                System.out.print("Enter a positive number (0 or negative to stop): ");
                int number = scanner.nextInt();

                if (number <= 0) {
                    System.out.println("Stopping input. Numbers written to " + filename);
                    break;
                }

                writer.write(number + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
