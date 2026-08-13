public class WashingMachine extends Appliances {

    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    public void displayStatus() {
        System.out.println("Washing clothes...");
    }
}