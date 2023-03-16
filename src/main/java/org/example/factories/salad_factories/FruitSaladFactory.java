package org.example.factories.salad_factories;

import org.example.factories.FruitFactory;
import org.example.factories.ProductFactory;
import org.example.fruits.Fruit;
import org.example.salads.FruitSalad;

import java.util.List;

public class FruitSaladFactory extends SaladFactory {

    public FruitSaladFactory(int minProductAmount, int maxProductAmount) {
        super(new ProductFactory[]{new FruitFactory(minProductAmount, maxProductAmount)});
    }

    @Override
    public FruitSalad getSalad() {
        return new FruitSalad((List<Fruit>) productFactories[0].getProductList(), getRandomCountry());
    }
}
