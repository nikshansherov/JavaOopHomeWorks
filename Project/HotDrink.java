package Project;

public class HotDrink extends Product{
    private double temperature;
    private double volume;

    public HotDrink(String name, double price, double volume, double temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void getProduct(HotDrink i) {
        System.out.println(i.getName() + " по цене " + i.getPrice() + " руб, объемом " + i.getVolume() +
                " л " + " с температурой " + i.getTemperature());
    }
}
