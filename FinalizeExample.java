//Demonstrate finalize method with suitable example.
class Demo {
     String message;

     Demo(String m) {
        this.message = m;
        System.out.println("Object created with message: " 
		+ message);
    }

    protected void finalize() throws Throwable {
        System.out.println
		("Finalize called for object with message: " 
		+ message);
        super.finalize();
    }
}

public class FinalizeExample {
    public static void main(String[] args) {
        // Create an object
        Demo obj1 = new Demo("Hello, World!");

        // Nullify the reference to make it eligible for garbage collection
        obj1 = null;

        // Request garbage collection
        System.gc(); // Suggests the JVM to run garbage collection

        System.out.println("End of main method.");
    }
}
