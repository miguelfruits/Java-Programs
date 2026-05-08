class Student {
     int rno;
     String name;
     int age;
    // Default Constructor
     Student() {
        this.rno = 39;
        this.name = "Unknown";
        this.age = 25;
    }
    // Parameterized Constructor
     Student(int rno, String name, int age) {
        this.rno = rno;
        this.name = name;
        this.age = age;
    }
     Student(Student other) {
        this.rno = other.rno;
        this.name = other.name;
        this.age = other.age;
    }
    public void displayDetails() {
        System.out.println("Roll Number: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Details of Student 1 (Default Constructor):");
        student1.displayDetails();
        Student student2 = new Student(101, "Alice", 20);
        System.out.println("Details of Student 2 (Parameterized Constructor):");
        student2.displayDetails();
        // Test copy constructor
        Student student3 = new Student(student2);
        System.out.println("Details of Student 3 (Copy Constructor):");
        student3.displayDetails();
    }
}
