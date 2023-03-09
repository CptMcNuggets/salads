package org.example;

import org.example.veggies.Veggie;

import java.util.List;

public class VeggieSalad extends Salad {
    private List<Veggie> products;
    public VeggieSalad(List<Veggie> veggieSalad) {
        this.products = veggieSalad;
    }

    @Override
    public int totalPrice() {
        int totalPrice = 0;
        for(Veggie item: products) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int totalCal() {
        int totalCal = 0;
        for(Veggie item: products) {
            totalCal += item.getCal();
        }
        return totalCal;
    }
}
