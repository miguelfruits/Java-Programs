//1	Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
import java.util.Scanner;
class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}
public class UniqueIntegerReader {
    public static void main(String[] args) throws DuplicateNumberException {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100]; // Fixed-size array for simplicity
        int count = 0;
        System.out.println("Enter integers (type -1 to stop):");       
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;
            
            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    throw new DuplicateNumberException("Duplicate number detected: " + num);
                }
            }
            numbers[count++] = num;
        }
        System.out.print("Unique numbers entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }      
        scanner.close();
    }
}
