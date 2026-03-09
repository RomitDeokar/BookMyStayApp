
import java.util.*;

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        inventory.addRoomType("Standard", 5);
        inventory.addRoomType("Deluxe", 2);
        inventory.addRoomType("Suite", 0);

        // Create room objects
        List<Room> rooms = new ArrayList<>();

        rooms.add(new StandardRoom());
        rooms.add(new DeluxeRoom());
        rooms.add(new SuiteRoom());

        // Search Service
        SearchService search = new SearchService(inventory, rooms);

        // Guest searches available rooms
        search.searchAvailableRooms();
    }
}