package org.example.factories.salad_factories;

import org.example.factories.ProductFactory;
import org.example.factories.VegetableFactory;
import org.example.fruits.Fruit;
import org.example.salads.FruitSalad;
import org.example.salads.Salad;
import org.example.salads.VegetableSalad;
import org.example.veggies.Vegetable;

import java.util.List;

public class VegetableSaladFactory extends SaladFactory{

    public VegetableSaladFactory(int minProductAmount, int maxProductAmount) {
        super(new ProductFactory[]{new VegetableFactory(minProductAmount, maxProductAmount)});
    }

    @Override
    public VegetableSalad getSalad() {
        return new VegetableSalad((List<Vegetable>) productFactories[0].getProductList(), getRandomCountry());
    }
}
