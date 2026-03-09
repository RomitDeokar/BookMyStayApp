class SuiteRoom extends Room {

    public SuiteRoom() {
        super("Suite", 5000);
    }

    @Override
    public void showDetails() {
        System.out.println("Suite Room - Price: ₹" + price + " - Luxury amenities");
    }
}
