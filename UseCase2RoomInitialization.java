// Abstract Class
abstract class Room {

    protected String roomType;
    protected int beds;
    protected int size;
    protected double price;

    public Room(String roomType, int beds, int size, double price) {
        this.roomType = roomType;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sq.ft");
        System.out.println("Price: $" + price);
    }
}


// Subclass 1
class SingleRoom extends Room {

    public SingleRoom() {
        super("Single Room", 1, 200, 100);
    }
}


// Subclass 2
class DoubleRoom extends Room {

    public DoubleRoom() {
        super("Double Room", 2, 350, 180);
    }
}


// Subclass 3
class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite Room", 3, 600, 350);
    }
}


/**
 * Use Case 2 Main Application
 * @version 2.1
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=== Book My Stay App ===");
        System.out.println("Version 2.1\n");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable + "\n");

        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable + "\n");

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable + "\n");
    }
}