//Create Array List of five subjects of marks & display result using wrapper class.
import java.util.ArrayList;
public class MarksList {
    public static void main(String[] args) {
        // Creating an ArrayList to store subject marks (using Integer wrapper class)
        ArrayList<Integer> marks = new ArrayList<>();

        // Adding marks for five subjects
        marks.add(85);  // Subject 1
        marks.add(90);  // Subject 2
        marks.add(78);  // Subject 3
        marks.add(88);  // Subject 4
        marks.add(95);  // Subject 5

        // Display marks
        System.out.println("Marks of 5 subjects: " + marks);

        // Calculate total marks
        int total = 0;
        for (Integer mark : marks) {
            total += mark;
        }

        // Calculate average
        double average = total / (double) marks.size();

        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
