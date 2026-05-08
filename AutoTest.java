//Create an abstract Auto class with fields for the car make and price. Include get and set methods for these fields; the setPrice() method is abstract. Create two subclasses for individual automobile makers (for example, Ford or Chevy), and include appropriate setPrice() methods in each subclass (for example,$20,000 or $22,000). Finally, write an application that uses the Auto class and subclasses to display information about different cars.
// Abstract class
abstract class Auto {
    private String make;
    protected double price;
    // Getter and Setter for make
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    // Getter for price
    public double getPrice() {
        return price;
    }

    // Abstract setter for price
    abstract void setPrice();

    // Concrete method
    void displayInfo() {
        System.out.println("Car Make : " + make);
        System.out.println("Car Price: $" + price);
    }
}

// Subclass 1
class Ford extends Auto {

    // Implementing abstract method
    void setPrice() {
        price = 20000;
    }
}

// Subclass 2
class Chevy extends Auto {

    // Implementing abstract method
    void setPrice() {
        price = 22000;
    }
}

// Main application class
public class AutoTest {

    public static void main(String[] args) {

        // Auto reference, Ford object
        Auto car1 = new Ford();
        car1.setMake("Ford");
        car1.setPrice();
        car1.displayInfo();

        System.out.println("-----------------------");

        // Auto reference, Chevy object
        Auto car2 = new Chevy();
        car2.setMake("Chevrolet");
        car2.setPrice();
        car2.displayInfo();
    }
}
