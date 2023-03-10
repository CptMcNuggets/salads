package org.example.salads;

import org.example.Salad;
import org.example.fruits.Fruit;

import java.util.List;

public class FruitSalad extends Salad {
    private List<Fruit> products;
    public  FruitSalad(List<Fruit> fruitSalad) {
        this.products = fruitSalad;
    }

    @Override
    public int totalPrice() {
        int totalPrice = 0;
        for (Fruit item: products) {
           totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int totalCal() {
        int totalCal = 0;
        for (Fruit item: products) {
            totalCal += item.getCal();
        }
        return totalCal;
    }
}
