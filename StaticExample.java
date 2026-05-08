// Example of Static variable and static method 
class StaticExample {
    // Static variable
    static int count = 0;

    // Static method
    static void displayCount() {
        System.out.println("Static Count: " + count);
    }

    // Instance method
    void increment() {
        count++;
     
    }

    public static void main(String[] args) {

        StaticExample.displayCount();

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.increment();
        obj2.increment();

        StaticExample.displayCount();

    }
}
