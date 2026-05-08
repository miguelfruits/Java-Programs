public class StaticBlockExample {
    static int a;
    static int b;
    static {
        a = 10;
        System.out.println("First static block executed. Value of a: " + a);
    }
    static {
        b = 20;
        System.out.println("Second static block executed. Value of b: " + b);
    }
    static {
 System.out.println("Third static block executed. Sum of a and b: "+ (a + b));
    }
    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
