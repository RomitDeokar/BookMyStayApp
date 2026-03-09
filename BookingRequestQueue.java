import java.util.*;

public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    // Add booking request
    public void addRequest(Reservation reservation) {
        requestQueue.add(reservation);
        System.out.println("Booking request added for " + reservation.getGuestName());
    }

    // Display all requests
    public void showAllRequests() {
        System.out.println("\nBooking Requests in Queue:\n");

        for (Reservation r : requestQueue) {
            r.showReservation();
        }
    }
}