package com.github.gregor499.neuefischefreitagsaufgabewoche2bestellsysteminspring;

import java.util.UUID;

public class FoodAndBeverageProduct implements Product{

    private final String name;
    private final String id;

    private int bestBefore;

    public FoodAndBeverageProduct(String name) {
        this.name = name;
        id = UUID.randomUUID().toString();
        bestBefore=1;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }


}