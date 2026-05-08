//Write a program to create three objects of Student class(rno,name, age). 
//Write getDetails method which takes user inputs (rno, name and age). Write
//other method named displayDetails to display the rno, name and age of the user. 
//Create three objects and test working of above two methods.

import java.util.*;
class Student {
     int rno;
     String name;
     int age;
     void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");	
        rno = sc.nextInt();
        sc.nextLine(); 		
        System.out.print("Enter Name: ");
        name = sc.nextLine();		
        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }
    // Method to display details of the student
     void displayDetails() {
        System.out.println("Roll Number: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class PrintStudentDetails{
    public static void main(String[] args) {
        System.out.println("Enter details for Student :");
	Student student1 = new Student();
        student1.getDetails();
        System.out.println();

        System.out.println("Details of Student :");
        student1.displayDetails();
        System.out.println();
    }
}
