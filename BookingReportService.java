import java.util.*;

public class BookingReportService {

    private BookingHistory history;

    public BookingReportService(BookingHistory history) {
        this.history = history;
    }

    // Generate simple report
    public void generateReport() {

        List<Reservation> reservations = history.getReservations();

        System.out.println("\nBooking Report:");
        System.out.println("---------------------------");

        for (Reservation r : reservations) {
            System.out.println(
                    "Guest: " + r.getGuestName() +
                            " | Room Type: " + r.getRoomType()
            );
        }

        System.out.println("\nTotal Bookings: " + reservations.size());
    }
}