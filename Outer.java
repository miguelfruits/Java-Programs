//Create an Outer class with instance variable named “a”. Inside this Outer class, create an Inner class. This inner class must have instance variable named “b”. Assign some initial values to this “a” and “b”. Create object of Outer class and print values of “a” and “b”.

public class Outer {
    int a = 10;
	
    class Inner {
		
        int b = 20;
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println("Value of a (Outer class): " + outer.a);
        System.out.println("Value of b (Inner class): " + inner.b);
    }
}
