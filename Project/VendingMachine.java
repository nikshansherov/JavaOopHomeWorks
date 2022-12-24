package Project;

public class VendingMachine {
    private String name;
    private double price;
    private double volume;

    public VendingMachine(String name, double price, double volume){
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public void getProduct(VendingMachine i) {
        System.out.println(i.name + " по цене " + i.price + " руб, объемом " + i.volume + "л продан.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
