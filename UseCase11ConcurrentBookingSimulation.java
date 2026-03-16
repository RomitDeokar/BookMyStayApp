import java.util.*;

public class UseCase11ConcurrentBookingSimulation {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        // Inventory setup
        inventory.put("Standard", 2);
        inventory.put("Deluxe", 1);

        ConcurrentBookingProcessor processor =
                new ConcurrentBookingProcessor(inventory);

        // Simulate multiple guests booking simultaneously
        BookingTask g1 = new BookingTask("Alice", "Standard", processor);
        BookingTask g2 = new BookingTask("Bob", "Standard", processor);
        BookingTask g3 = new BookingTask("Charlie", "Standard", processor);
        BookingTask g4 = new BookingTask("David", "Deluxe", processor);
        BookingTask g5 = new BookingTask("Eva", "Deluxe", processor);

        g1.start();
        g2.start();
        g3.start();
        g4.start();
        g5.start();
    }
}