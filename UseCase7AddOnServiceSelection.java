public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        AddOnServiceManager serviceManager = new AddOnServiceManager();

        String reservationId = "ST1";   // example reservation from UC6

        // Available services
        Service breakfast = new Service("Breakfast", 500);
        Service spa = new Service("Spa Access", 1200);
        Service airportPickup = new Service("Airport Pickup", 800);

        // Guest selects services
        serviceManager.addService(reservationId, breakfast);
        serviceManager.addService(reservationId, spa);
        serviceManager.addService(reservationId, airportPickup);

        // Show selected services
        serviceManager.showServices(reservationId);

        // Show total cost
        double totalCost = serviceManager.calculateTotalServiceCost(reservationId);

        System.out.println("\nTotal Add-On Cost: Rs " + totalCost);
    }
}