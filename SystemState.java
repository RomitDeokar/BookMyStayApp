import java.io.Serializable;
import java.util.*;

public class SystemState implements Serializable {

    private static final long serialVersionUID = 1L;

    private Map<String, Integer> inventory;
    private List<String> bookingHistory;

    public SystemState(Map<String, Integer> inventory, List<String> bookingHistory) {
        this.inventory = inventory;
        this.bookingHistory = bookingHistory;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public List<String> getBookingHistory() {
        return bookingHistory;
    }
}