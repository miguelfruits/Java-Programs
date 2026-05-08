interface one {
    int a = 10; 
}
interface two {
    int b = 20;
}
interface three extends one, two {
    int c = 30;
}
class Test implements three {   
}
public class InterfaceTest {
    public static void main(String[] args) {

        Test obj = new Test();
        System.out.println("Value of a: " + one.a);
        System.out.println("Value of b: " + two.b);
        System.out.println("Value of c: " + three.c);
    }
}
