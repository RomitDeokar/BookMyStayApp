import java.util.HashMap;

public class RoomInventory {

    private HashMap<String, Integer> availability;

    // Constructor
    public RoomInventory() {
        availability = new HashMap<>();
    }

    // Add room types with initial count
    public void addRoomType(String roomType, int count) {
        availability.put(roomType, count);
    }

    // Get current availability
    public int getAvailability(String roomType) {
        return availability.getOrDefault(roomType, 0);
    }

    // Update room count (used in UC6 during allocation)
    public void updateRoomCount(String roomType, int count) {
        availability.put(roomType, count);
    }

    // Display inventory
    public void showInventory() {
        System.out.println("\nCurrent Room Inventory:");
        for (String type : availability.keySet()) {
            System.out.println(type + " : " + availability.get(type));
        }
    }
}