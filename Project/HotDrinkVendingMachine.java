package Project;

public class HotDrinkVendingMachine<i, j> extends VendingMachine {

    private double temperature;

    public HotDrinkVendingMachine(String name, double price, double volume, double temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public void getProduct(HotDrinkVendingMachine i) {
        System.out.println(i.getName() + " по цене " + i.getPrice() + " руб, объемом " + i.getVolume() +
                " л " + " с температурой " + i.getTemperature());
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
