import java.util.*;

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        Map<String, String> reservations = new HashMap<>();

        // Inventory setup
        inventory.put("Standard", 2);
        inventory.put("Deluxe", 1);
        inventory.put("Suite", 1);

        // Simulated confirmed bookings
        reservations.put("R101", "Standard");
        reservations.put("R102", "Deluxe");

        CancellationService cancelService =
                new CancellationService(reservations, inventory);

        // Guest cancels booking
        cancelService.cancelReservation("R101");

        // Try invalid cancellation
        cancelService.cancelReservation("R999");

        // Show rollback stack
        cancelService.showRollbackHistory();

        System.out.println("\nUpdated Inventory:");
        for (String type : inventory.keySet()) {
            System.out.println(type + " : " + inventory.get(type));
        }
    }
}