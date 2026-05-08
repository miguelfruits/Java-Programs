//Demonstrate method overriding with suitable example.

class Person {
    void eat() {
        System.out.println("Person is eating.");
    }

    void study() {
        System.out.println("Person is studying.");
    }
}
class Student extends Person {
    void study() {
        System.out.println("Student is preparing for exams.");
    }

    void attendClasses() {
        System.out.println("Student is attending classes.");
    }
}
public class Methodoverriding {
    public static void main(String[] args) {

        Student s = new Student();
        s.study();  // Output: Student is preparing for exams.
        s.eat();  // Output: Person is eating.
        s.attendClasses();  // Output: Student is attending classes.
    }
}
