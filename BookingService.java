import java.util.*;

public class BookingService {

    private RoomInventory inventory;
    private Queue<Reservation> requestQueue;

    // Track allocated room IDs
    private Set<String> allocatedRoomIds;

    // Track allocated rooms by type
    private HashMap<String, Set<String>> allocatedRoomsByType;

    private int roomCounter = 1;

    public BookingService(RoomInventory inventory, Queue<Reservation> requestQueue) {
        this.inventory = inventory;
        this.requestQueue = requestQueue;
        this.allocatedRoomIds = new HashSet<>();
        this.allocatedRoomsByType = new HashMap<>();
    }

    public void processBookings() {

        while (!requestQueue.isEmpty()) {

            Reservation request = requestQueue.poll();
            String roomType = request.getRoomType();

            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                // Generate unique room ID
                String roomId = roomType.substring(0, 2).toUpperCase() + roomCounter++;

                // Ensure uniqueness
                if (!allocatedRoomIds.contains(roomId)) {

                    allocatedRoomIds.add(roomId);

                    allocatedRoomsByType
                            .computeIfAbsent(roomType, k -> new HashSet<>())
                            .add(roomId);

                    // Update inventory
                    inventory.updateRoomCount(roomType, available - 1);

                    System.out.println(
                            "Reservation Confirmed for "
                                    + request.getGuestName()
                                    + " | Room Type: "
                                    + roomType
                                    + " | Room ID: "
                                    + roomId);
                }

            } else {
                System.out.println(
                        "Sorry " + request.getGuestName() + ", no " + roomType + " rooms available.");
            }
        }
    }
}