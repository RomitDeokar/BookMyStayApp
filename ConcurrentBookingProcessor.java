import java.util.Map;

public class ConcurrentBookingProcessor {

    private Map<String, Integer> inventory;

    public ConcurrentBookingProcessor(Map<String, Integer> inventory) {
        this.inventory = inventory;
    }

    // Critical section
    public synchronized void bookRoom(String guestName, String roomType) {

        int available = inventory.getOrDefault(roomType, 0);

        if (available > 0) {
            inventory.put(roomType, available - 1);

            System.out.println(guestName +
                    " successfully booked " + roomType +
                    " room. Remaining: " + (available - 1));
        } else {
            System.out.println(guestName +
                    " booking failed. No " + roomType + " rooms left.");
        }
    }
}