import java.util.*;

public class AddOnServiceManager {

    private Map<String, List<Service>> reservationServices;

    public AddOnServiceManager() {
        reservationServices = new HashMap<>();
    }

    // Add service to reservation
    public void addService(String reservationId, Service service) {

        reservationServices
                .computeIfAbsent(reservationId, k -> new ArrayList<>())
                .add(service);

        System.out.println(service.getServiceName() +
                " added to reservation " + reservationId);
    }

    // Show services for reservation
    public void showServices(String reservationId) {

        List<Service> services = reservationServices.get(reservationId);

        if (services == null) {
            System.out.println("No services selected.");
            return;
        }

        System.out.println("\nServices for Reservation " + reservationId);

        for (Service s : services) {
            s.showService();
        }
    }

    // Calculate total cost
    public double calculateTotalServiceCost(String reservationId) {

        List<Service> services = reservationServices.get(reservationId);

        if (services == null) return 0;

        double total = 0;

        for (Service s : services) {
            total += s.getPrice();
        }

        return total;
    }
}