package org.example.factories.salad_factories;

import org.example.factories.MeatFactory;
import org.example.factories.ProductFactory;
import org.example.factories.VegetableFactory;
import org.example.meat.Meat;
import org.example.salads.MeatSalad;
import org.example.veggies.Vegetable;

import java.util.List;

public class MeatSaladFactory extends SaladFactory {
    public MeatSaladFactory(int minProductAmount, int maxProductAmount) {
        super(new ProductFactory[]{new MeatFactory(minProductAmount, maxProductAmount),
                new VegetableFactory(minProductAmount, maxProductAmount)});
    }

    @Override
    public MeatSalad getSalad() {
        return new MeatSalad((List<Meat>) productFactories[0].getProductList(),
                (List<Vegetable>) productFactories[1].getProductList(), getRandomCountry());
    }
}
