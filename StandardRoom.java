class StandardRoom extends Room {

    public StandardRoom() {
        super("Standard", 2000);
    }

    @Override
    public void showDetails() {
        System.out.println("Standard Room - Price: ₹" + price + " - Basic amenities");
    }
}

