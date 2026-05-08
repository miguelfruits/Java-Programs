//Write a calculator program to add, subtract, multiply and division of two integers,
// two floats and two double number using method overloading and static methods.

public class Calculator {

    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Static method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    // Static method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Static method for division
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static float divide(float a, float b) {
        if (b == 0.0f) 
		{
			
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
//javac -source 1.8 -target 1.8 filename.java
    public static void main(String[] args) {
        // Test the Calculator methods
        System.out.println("Addition:");
        System.out.println("Int: " + add(5, 3));
        System.out.println("Float: " + add(5.5f, 3.3f));
        System.out.println("Double: " + add(5.5, 3.3));

        System.out.println("\nSubtraction:");
        System.out.println("Int: " + subtract(5, 3));
        System.out.println("Float: " + subtract(5.5f, 3.3f));
        System.out.println("Double: " + subtract(5.5, 3.3));

        System.out.println("\nMultiplication:");
        System.out.println("Int: " + multiply(5, 3));
        System.out.println("Float: " + multiply(5.5f, 3.3f));
        System.out.println("Double: " + multiply(5.5, 3.3));

        System.out.println("\nDivision:");
        System.out.println("Int: " + divide(10, 2));
        System.out.println("Float: " + divide(10.5f, 2.5f));
        System.out.println("Double: " + divide(10.5, 2.5));

        // Uncomment the line below to test division by zero
        // System.out.println("Division by zero: " + divide(10, 0));
    }
}
