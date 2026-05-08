//Write an application named GoTooFarin which you declare an array of five integers and store five values in the array. Write a try block in which you loop to display each successive element of the array, increasing a subscript by 1 on each pass through the loop. Create a catch block that catches the eventual ArrayIndexOutOfBoundsException and displays the message, “Now you’ve gone too far.” Save the file as GoTooFar.java.
public class GoTooFar {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = 0;
        
        try {
            while (true) { // Intentional infinite loop
                System.out.println("Element at index " + index + ": " + numbers[index]);
                index++; // Increment index beyond array bounds
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Now you’ve gone too far.");
        }
    }
}