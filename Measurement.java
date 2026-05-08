//WAP addition of two measurement objects of Measurement class that stores 
//meter and centimeter using passing object as an argument and return as object concept.

class Measurement {
    private int meters;
    private int centimeters;

    // Constructor
    public Measurement(int meters, int centimeters) {
        this.meters = meters;
        this.centimeters = centimeters;
        normalize();
    }

    // Method to normalize the measurement (convert excess centimeters to meters)
    private void normalize() {
        meters += centimeters / 100;
        centimeters = centimeters % 100;
    }

    // Method to add two Measurement objects
    public Measurement add(Measurement other) {
        int totalMeters = this.meters + other.meters;
        int totalCentimeters = this.centimeters + other.centimeters;
        return new Measurement(totalMeters, totalCentimeters);
    }

    // Method to display the measurement
    public void display() {//3 m and 75 cm
        System.out.println(meters + " meters and " + centimeters + " centimeters");
    }

    // Main method for testing
    public static void main(String[] args) {
        Measurement m1 = new Measurement(3, 75); // 3 meters, 75 cm
        Measurement m2 = new Measurement(2, 50); // 2 meters, 50 cm
        System.out.print("Measurement 1: ");
        m1.display();
        System.out.print("Measurement 2: ");
        m2.display();
		
        Measurement result = m1.add(m2); // Add m1 and m2
        System.out.print("Resultant Measurement: ");
        result.display();
    }
}
