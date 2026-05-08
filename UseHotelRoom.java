//	Create a class named Hotel Room that includes an integer field for the room number and a double field for the nightly rental rate. Include get methods for these fields and a constructor that requires an integer argument representing the room number. The constructor sets the room rate based on the room number; rooms numbered 299 and below are $69.95 per night, and others are $89.95 per night. Create an extended class named Suite whose constructor requires a room number and adds a $40 surcharge to the regular hotel room rate, which again is based on the room number. Write an application named use Hotel Room that creates an object of each class, and demonstrate that all the methods work correctly. 

class HotelRoom {
    private int roomNumber;
    protected double rentalRate;

    // Constructor
    public HotelRoom(int roomNumber) {
        this.roomNumber = roomNumber;

        if (roomNumber <= 299) {
            rentalRate = 69.95;
        } else {
            rentalRate = 89.95;
        }
    }

    // Getter methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }
}

// Extended class
class Suite extends HotelRoom {

    // Constructor
    public Suite(int roomNumber) {
        super(roomNumber);       // Call parent constructor
        rentalRate = rentalRate + 40.00; // Add suite surcharge
    }
}

// Main application class
public class UseHotelRoom {
    public static void main(String[] args) {

        HotelRoom normalRoom = new HotelRoom(200);
        Suite suiteRoom = new Suite(350);

        System.out.println("Normal Hotel Room");
        System.out.println("Room Number: " + normalRoom.getRoomNumber());
        System.out.println("Nightly Rate: $" + normalRoom.getRentalRate());

        System.out.println();

        System.out.println("Suite Room");
        System.out.println("Room Number: " + suiteRoom.getRoomNumber());
        System.out.println("Nightly Rate: $" + suiteRoom.getRentalRate());
    }
}
