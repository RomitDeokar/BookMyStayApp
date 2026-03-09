import java.util.List;

class SearchService {

    private RoomInventory inventory;
    private List<Room> rooms;

    public SearchService(RoomInventory inventory, List<Room> rooms) {
        this.inventory = inventory;
        this.rooms = rooms;
    }

    public void searchAvailableRooms() {

        System.out.println("Available Rooms:\n");

        for (Room room : rooms) {

            int available = inventory.getAvailability(room.getRoomType());

            if (available > 0) {
                room.showDetails();
                System.out.println("Available Count: " + available);
                System.out.println("---------------------------");
            }
        }
    }
}