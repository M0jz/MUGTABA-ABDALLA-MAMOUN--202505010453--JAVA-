public class Refrigerator extends Appliances {

    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    public void displayStatus() {
        System.out.println("Store food & beverages...");
    }
}