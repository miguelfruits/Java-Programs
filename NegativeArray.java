//Write an application that prompts the user to enter a number to use as an array size, and then attempt to declare an array using the entered size. If the array is created successfully, display an appropriate message. Java generates a NegativeArraySizeExceptionif you attempt to create an array with a negative size, and Java creates a NumberFormatExceptionif you attempt to create an array using a nonnumeric value for the size. Use a catch block that executes if the array size is nonnumeric or negative, displaying a message that indicates the array was not created. Save the file as NegativeArray.java
import java.util.Scanner;
public class NegativeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number for the array size: ");
        
        try {
            int size = Integer.parseInt(scanner.nextLine());
            
           
            int[] array = new int[size];
            System.out.println("Array created successfully with size: " + size);
            
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Cannot create an array with a negative size.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
