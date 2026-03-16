import java.util.Map;

public class InvalidBookingValidator {

    public static void validateBooking(String roomType, Map<String, Integer> availability)
            throws InvalidBookingException {

        // Check if room type exists
        if (!availability.containsKey(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Check if rooms available
        int count = availability.get(roomType);

        if (count <= 0) {
            throw new InvalidBookingException("No rooms available for " + roomType);
        }
    }
}