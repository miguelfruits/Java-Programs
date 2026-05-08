class OuterClass {

    int outerValue = 10;
    static int staticOuterValue = 20;

    // -------- Static Nested Class --------
    static class StaticNestedClass {
        void show() {
            System.out.println("Inside Static Nested Class");
            System.out.println("Static outer value: " + staticOuterValue);
        }
    }
    // -------- Non-Static Nested Class --------
    class InnerClass {
        void display() {
            System.out.println("Inside Inner (Non-Static) Class");
            System.out.println("Outer value: " + outerValue);
            System.out.println("Static outer value: " + staticOuterValue);
        }
    }
}
class NestedClassDemo {
    public static void main(String[] args) {
        // Creating object of Static Nested Class
        OuterClass.StaticNestedClass obj1 = new OuterClass.StaticNestedClass();
        obj1.show();
        // Creating object of Outer Class
        OuterClass outer = new OuterClass();
        // Creating object of Inner (Non-Static) Class
        OuterClass.InnerClass obj2 = outer.new InnerClass();
        obj2.display();
    }
}
