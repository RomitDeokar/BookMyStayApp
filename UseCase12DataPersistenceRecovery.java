import java.util.*;

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        // Try loading saved state
        SystemState state = PersistenceService.loadState();

        Map<String, Integer> inventory;
        List<String> bookings;

        if (state != null) {
            inventory = state.getInventory();
            bookings = state.getBookingHistory();
        } else {

            // Fresh system startup
            inventory = new HashMap<>();
            inventory.put("Standard", 3);
            inventory.put("Deluxe", 2);

            bookings = new ArrayList<>();
        }

        // Simulate new booking
        bookings.add("Reservation: Alice - Standard");

        int count = inventory.get("Standard");
        inventory.put("Standard", count - 1);

        System.out.println("\nCurrent Inventory:");
        for (String type : inventory.keySet()) {
            System.out.println(type + " : " + inventory.get(type));
        }

        System.out.println("\nBooking History:");
        for (String b : bookings) {
            System.out.println(b);
        }

        // Save state before shutdown
        SystemState newState = new SystemState(inventory, bookings);
        PersistenceService.saveState(newState);
    }
}