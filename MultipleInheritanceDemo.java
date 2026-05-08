interface Engine {
    void startEngine();
}
interface Transmission {
    void changeGear(int gear);
}
class Car implements Engine, Transmission {
    private int gear;
    public void startEngine() {
        System.out.println("Car engine started.");
    }
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car changed to gear: " + gear);
    }
}
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.changeGear(3);
    }
}
