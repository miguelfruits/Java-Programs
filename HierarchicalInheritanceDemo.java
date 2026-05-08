class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Employee constructor called for: " + name);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, int id, String department) {
        super(name, id); 
        this.department = department;
        System.out.println("Manager constructor called for: " + name);
    }
    void displayDetails() {
        super.displayDetails(); 
        System.out.println("Department: " + department);
    }
}
class Developer extends Employee {
    String programmingLanguage;

		Developer(String name, int id, String programmingLanguage) {
        super(name, id); 
        this.programmingLanguage = programmingLanguage;
        System.out.println("Developer constructor called for: " + name);
    }

    void displayDetails() {
        super.displayDetails(); 
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, "IT");
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println();

        Developer developer = new Developer("Bob", 102, "Java");
        System.out.println("Developer Details:");
        developer.displayDetails();
    }
}
