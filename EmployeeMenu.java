//Create following classes:
//a.	Emp(id,name,age) 
//b.	PartTimeEmp(numberOfHours,ratePerHour) inherits Emp
//c.	FullTimeEmp(basicPay,DA) inherits Emp
//Write menu driven program.
//1.	Display (Employee class)
//2.	Display (Part time employee)
//3.	Display (Full time employee)
//Create base class reference object according to user choice it call function of particular class.

import java.util.Scanner;
class Emp {
    int id;
    String name;
    int age;
    public Emp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class PartTimeEmp extends Emp {
    int numberOfHours;
    double ratePerHour;
    public PartTimeEmp(int id, String name, int age, int numberOfHours, double ratePerHour) {
        super(id, name, age);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    }
    public void display() {
        super.display();
        System.out.println("Number of Hours: " + numberOfHours);
        System.out.println("Rate Per Hour: " + ratePerHour);
    }
}
class FullTimeEmp extends Emp {
    double basicPay;
    double DA;
    public FullTimeEmp(int id, String name, int age, double basicPay, double DA) {
        super(id, name, age);
        this.basicPay = basicPay;
        this.DA = DA;
    }
    public void display() {
        super.display();
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA (Dearness Allowance): " + DA);
    }
}
public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp emp = null; 
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Employee Details");
            System.out.println("2. Display Part-Time Employee Details");
            System.out.println("3. Display Full-Time Employee Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 4) {
                System.out.println("Exiting...");
                break; // Exit the loop and terminate the program
            }
            switch (choice) {
                case 1: {
                    // Employee details input
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // To consume the newline character
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();

                    emp = new Emp(id, name, age);
                    emp.display();
                    break;
                }
                case 2: {
                    // Part-time employee details input
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // To consume the newline character
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Number of Hours Worked: ");
                    int hours = sc.nextInt();
                    System.out.print("Enter Rate Per Hour: ");
                    double rate = sc.nextDouble();

                    emp = new PartTimeEmp(id, name, age, hours, rate);
                    emp.display();
                    break;
                }
                case 3: {
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // To consume the newline character
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Basic Pay: ");
                    double basicPay = sc.nextDouble();
                    System.out.print("Enter Dearness Allowance (DA): ");
                    double DA = sc.nextDouble();
					
                    emp = new FullTimeEmp(id, name, age, basicPay, DA);
                    emp.display();
                    break;
                }
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close(); // Close the scanner
    }
}
