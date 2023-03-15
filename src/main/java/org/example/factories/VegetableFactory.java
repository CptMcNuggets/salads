package org.example.factories;

import org.example.veggies.Carrot;
import org.example.veggies.Cucumber;
import org.example.veggies.Tomato;
import org.example.veggies.Vegetable;

import java.util.List;

public class VegetableFactory extends ProductFactory {

    private static final Class[] vegetables = {Cucumber.class, Tomato.class, Carrot.class};
    public VegetableFactory(int minAmount, int maxAmount) {
        super(minAmount, maxAmount);
    }

    @Override
    public List<Vegetable> getProductList() {
        return (List<Vegetable>) getRandomProducts(vegetables);
    }
}
