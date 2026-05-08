//Consider the example of vehicles like bicycles, cars, bikes, etc they have common functionalities. So we make an interface and put all these common functionalities. 
interface Vehicle {
    void start();
    void stop();
    void speedUp(int increment);
}
class Bicycle implements Vehicle {
    private int speed = 0;
    public void start() {
        System.out.println("Bicycle started pedaling.");
    }
    public void stop() {
        System.out.println("Bicycle stopped.");
    }
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to " + speed + " km/h.");
    }
}
class Car implements Vehicle {
    private int speed = 0;

    public void start() {
        System.out.println("Car engine started.");
    }
    public void stop() {
        System.out.println("Car stopped.");
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed increased to " + speed + " km/h.");
    }
}
class Bike implements Vehicle {
    private int speed = 0;

    public void start() {
        System.out.println("Bike engine started.");
    }

    public void stop() {
        System.out.println("Bike stopped.");
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed increased to " + speed + " km/h.");
    }
}
public class VehicleTest {
    public static void main(String[] args) {
 s
        Vehicle bicycle = new Bicycle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Testing Bicycle:");
        bicycle.start();
        bicycle.speedUp(10);
        bicycle.stop();

        System.out.println("\nTesting Car:");
        car.start();
        car.speedUp(50);
        car.stop();

        System.out.println("\nTesting Bike:");
        bike.start();
        bike.speedUp(30);
        bike.stop();
    }
}
