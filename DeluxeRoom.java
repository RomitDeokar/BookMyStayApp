class DeluxeRoom extends Room {

    public DeluxeRoom() {
        super("Deluxe", 3500);
    }

    @Override
    public void showDetails() {
        System.out.println("Deluxe Room - Price: ₹" + price + " - Extra comfort");
    }
}
