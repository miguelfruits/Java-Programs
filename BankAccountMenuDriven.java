//Create Branch class that stores (Bname,Baddress) for parent class. Create a child class  bank account. Create a class named 'BankAccount' with the following data members
//1 - Name of depositor
//2 - Address of depositor
//3 - Type of account
//4 - Balance in account
//Write a method getDetails which takes user inputs. Write other method name displayDetails,withdraw and deposit amount. Create program menu driven.
//1.	Deposit balance
//2.	Withdraw balance
//3.	Display balance
//4.	Exit 


import java.util.Scanner;
public class BankAccountMenuDriven {
     String accountHolderName;
     String accountNumber;
     double balance;
	 
    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = scanner.nextDouble();
    }
    public void displayDetails() {
        System.out.println("\nAccount Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Details:");
        account.getDetails();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit balance");
            System.out.println("2. Withdraw balance");
            System.out.println("3. Display balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayDetails();
                    break;
                case 4:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
