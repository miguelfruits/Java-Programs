//Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.
import java.util.Arrays;

public class GenericArrayComparison {
s
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {

        Integer[] intArray1 = {1, 2, 3, 4};
        Integer[] intArray2 = {1, 2, 3, 4};
        Integer[] intArray3 = {1, 2, 3, 5};
        
        System.out.println("Integer arrays equal: " + areArraysEqual(intArray1, intArray2)); // true
        System.out.println("Integer arrays equal: " + areArraysEqual(intArray1, intArray3)); // false

        String[] strArray1 = {"Java", "Python", "C++"};
        String[] strArray2 = {"Java", "Python", "C++"};
        String[] strArray3 = {"Java", "C++", "Python"};
        
        System.out.println("String arrays equal: " + areArraysEqual(strArray1, strArray2)); // true
        System.out.println("String arrays equal: " + areArraysEqual(strArray1, strArray3)); // false
    }
}
