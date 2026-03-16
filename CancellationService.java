import java.util.*;

public class CancellationService {

    private Map<String, String> reservationRoomMap; // reservationID → roomType
    private Map<String, Integer> inventory;
    private Stack<String> rollbackStack;

    public CancellationService(Map<String, String> reservationRoomMap,
                               Map<String, Integer> inventory) {

        this.reservationRoomMap = reservationRoomMap;
        this.inventory = inventory;
        this.rollbackStack = new Stack<>();
    }

    public void cancelReservation(String reservationId) {

        // Validate reservation exists
        if (!reservationRoomMap.containsKey(reservationId)) {
            System.out.println("Cancellation Failed: Reservation not found.");
            return;
        }

        String roomType = reservationRoomMap.get(reservationId);

        // Push to rollback stack
        rollbackStack.push(reservationId);

        // Restore inventory
        int count = inventory.get(roomType);
        inventory.put(roomType, count + 1);

        // Remove reservation
        reservationRoomMap.remove(reservationId);

        System.out.println("Reservation " + reservationId + " cancelled successfully.");
        System.out.println(roomType + " inventory restored.");
    }

    public void showRollbackHistory() {

        System.out.println("\nRollback Stack (Recent Cancellations):");

        for (String id : rollbackStack) {
            System.out.println(id);
        }
    }
}