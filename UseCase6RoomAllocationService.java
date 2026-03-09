import java.util.*;

public class UseCase6RoomAllocationService {

    public static void main(String[] args) {

        // Inventory setup
        RoomInventory inventory = new RoomInventory();

        inventory.addRoomType("Standard", 2);
        inventory.addRoomType("Deluxe", 1);
        inventory.addRoomType("Suite", 1);

        // Booking queue
        Queue<Reservation> bookingQueue = new LinkedList<>();

        bookingQueue.add(new Reservation("Alice", "Standard"));
        bookingQueue.add(new Reservation("Bob", "Deluxe"));
        bookingQueue.add(new Reservation("Charlie", "Standard"));
        bookingQueue.add(new Reservation("David", "Suite"));
        bookingQueue.add(new Reservation("Eva", "Standard"));

        // Booking service
        BookingService bookingService = new BookingService(inventory, bookingQueue);

        // Process requests
        bookingService.processBookings();
    }
}