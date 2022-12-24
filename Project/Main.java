package Project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VendingMachine> vendingMachines = new ArrayList<>();
        vendingMachines.add(new VendingMachine("Лимонад", 35, 1.5));
        vendingMachines.add(new VendingMachine("Пиво", 120, 0.5));

        List<HotDrinkVendingMachine> hotDrinkVendingMachines = new ArrayList<>();
        hotDrinkVendingMachines.add(new HotDrinkVendingMachine("Кофе", 38, 0.25, 100));
        hotDrinkVendingMachines.add(new HotDrinkVendingMachine("Чай", 25, 0.4, 95));

        List<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("Какаo", 38, 0.4, 70));
        for (VendingMachine i : vendingMachines) {
            i.getProduct(i);
        }
        for (HotDrinkVendingMachine i : hotDrinkVendingMachines) {
            i.getProduct(i);
        }
        for (HotDrink i : hotDrinks) {
            i.getProduct(i);
        }
    }
}
