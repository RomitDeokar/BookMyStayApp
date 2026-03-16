public class BookingTask extends Thread {

    private String guestName;
    private String roomType;
    private ConcurrentBookingProcessor processor;

    public BookingTask(String guestName,
                       String roomType,
                       ConcurrentBookingProcessor processor) {

        this.guestName = guestName;
        this.roomType = roomType;
        this.processor = processor;
    }

    public void run() {
        processor.bookRoom(guestName, roomType);
    }
}