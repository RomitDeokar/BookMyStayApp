import java.util.*;

public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {

        Map<String, Integer> roomAvailability = new HashMap<>();

        roomAvailability.put("Standard", 2);
        roomAvailability.put("Deluxe", 1);
        roomAvailability.put("Suite", 0); // No rooms available

        String requestedRoom = "Suite";   // try changing this

        try {

            // Validate booking
            InvalidBookingValidator.validateBooking(requestedRoom, roomAvailability);

            // If valid → proceed
            System.out.println("Booking validated successfully for " + requestedRoom);

            // update inventory
            int current = roomAvailability.get(requestedRoom);
            roomAvailability.put(requestedRoom, current - 1);

        } catch (InvalidBookingException e) {

            System.out.println("Booking Failed: " + e.getMessage());
        }

        System.out.println("\nSystem still running safely.");
    }
}