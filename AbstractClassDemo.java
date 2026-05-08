// Abstract class
abstract class Employee {

    // Instance variables
    String name;
    int age;

    // Concrete method (method with body)
    void getDetails() {
        name = "Parth";
        age = 30;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method (no body)
    abstract void calculateSalary();
}

// Child class extending abstract class
class PermanentEmployee extends Employee {

    // Implementing abstract method
    void calculateSalary() {
        int basicSalary = 30000;
        System.out.println("Salary: " + basicSalary);
    }
}

// Main class
public class AbstractClassDemo {

    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Employee e = new Employee(); ❌

        // Reference of abstract class, object of child class
        Employee e = new PermanentEmployee();

        e.getDetails();        // calling concrete method
        e.calculateSalary();  // calling implemented abstract method
    }
}
