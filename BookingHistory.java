import java.util.*;

public class BookingHistory {

    private List<Reservation> confirmedBookings;

    public BookingHistory() {
        confirmedBookings = new ArrayList<>();
    }

    // Add confirmed reservation
    public void addReservation(Reservation reservation) {
        confirmedBookings.add(reservation);
        System.out.println("Reservation stored for " + reservation.getGuestName());
    }

    // Return booking list
    public List<Reservation> getReservations() {
        return confirmedBookings;
    }

    // Display history
    public void showHistory() {
        System.out.println("\nBooking History:");

        for (Reservation r : confirmedBookings) {
            System.out.println(
                    "Guest: " + r.getGuestName() +
                            " | Room Type: " + r.getRoomType()
            );
        }
    }
}