public class Main {

    public static void main(String[] args) {

        Appliances washingMachine = new WashingMachine("LG");

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.displayStatus();
        washingMachine.turnOff();

        System.out.println();

        Appliances refrigerator = new Refrigerator("Panasonic");

        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.displayStatus();
        refrigerator.turnOff();
    }
}