//Write a program to input your firstName, middleName & lastName & display using Generics class.
import java.util.Scanner;
class Name<T> {
    private T firstName;
    private T middleName;
    private T lastName;

    public Name(T firstName, T middleName, T lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void displayFullName() {
        System.out.println("Full Name: " + firstName + " " + middleName + " " + lastName);
    }
}
public class GenericNameExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        Name<String> person = new Name<>(firstName, middleName, lastName);

        person.displayFullName();

        scanner.close();
    }
}
