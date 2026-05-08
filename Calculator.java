//1	Input Two numbers using command line argument and calculate using wrapper class. (Addition,Substraction,Multiplication,Division)
public class Calculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }
        // Convert command-line arguments to wrapper class objects
        try {
            Double num1 = Double.valueOf(args[0]);
            Double num2 = Double.valueOf(args[1]);

            // Perform calculations
            Double addition = num1 + num2;
            Double subtraction = num1 - num2;
            Double multiplication = num1 * num2;
            Double division = (num2 != 0) ? (num1 / num2) : null;

            // Display results
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            if (division != null) {
                System.out.println("Division: " + division);
            } else {
                System.out.println("Division: Cannot divide by zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid numbers.");
        }
    }
}
