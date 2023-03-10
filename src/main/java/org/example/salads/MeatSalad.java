package org.example.salads;

import org.example.Product;
import org.example.meat.Meat;
import org.example.veggies.Veggie;

import java.util.List;

public class MeatSalad extends Salad{
    private List<Veggie> products;
    private List<Meat> meats;
    public MeatSalad(List<Meat> meatSalad, List<Veggie> vegmeat) {
        this.products = vegmeat;
        this.meats = meatSalad;
    }
    @Override
    public int totalPrice() {
        int totalPrice = 0;
        for (Veggie item: products) {
            totalPrice += item.getPrice();
        }
        for (Meat item: meats) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int totalCal() {
        int totalCal = 0;
        for (Veggie item: products) {
            totalCal += item.getCal();
        }
        for (Meat item: meats) {
            totalCal += item.getCal();
        }
        return totalCal;

    }
}
