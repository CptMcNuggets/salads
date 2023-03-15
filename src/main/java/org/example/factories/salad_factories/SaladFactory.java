package org.example.factories.salad_factories;

import org.example.factories.ProductFactory;
import org.example.salads.Salad;

import static org.example.Constants.*;
import static org.example.Utils.getRandomIndex;

public abstract class SaladFactory {

    protected static final String[] countries = {GEORGIA, THAILAND, FRANCE};
    public SaladFactory(ProductFactory[] productFactories) {
        this.productFactories = productFactories;
    }
    protected ProductFactory[] productFactories;

    public abstract Salad getSalad();

    protected String getRandomCountry() {
        return countries[getRandomIndex(countries)];
    }
}
