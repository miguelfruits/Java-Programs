// Abstract class
abstract class Person {

    String name;

    // Constructor of abstract class
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    // Abstract method
    abstract void showDetails();
}

// Subclass
class Student extends Person {

    int rollNo;

    // Constructor of subclass
    Student(String name, int rollNo) {
        super(name);   // calls abstract class constructor
        this.rollNo = rollNo;
    }

    // Implementing abstract method
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Main class
public class AbstractConstructorDemo {
    public static void main(String[] args) {

        Student s = new Student("Parth", 101);
        s.showDetails();
    }
}
