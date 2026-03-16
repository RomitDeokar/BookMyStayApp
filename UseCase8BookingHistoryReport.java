public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();

        // Simulate confirmed bookings
        Reservation r1 = new Reservation("Alice", "Standard");
        Reservation r2 = new Reservation("Bob", "Deluxe");
        Reservation r3 = new Reservation("Charlie", "Suite");

        // Add to history
        history.addReservation(r1);
        history.addReservation(r2);
        history.addReservation(r3);

        // Show booking history
        history.showHistory();

        // Generate report
        BookingReportService reportService = new BookingReportService(history);
        reportService.generateReport();
    }
}