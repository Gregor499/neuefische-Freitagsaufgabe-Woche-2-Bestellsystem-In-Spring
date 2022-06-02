package com.github.gregor499.neuefischefreitagsaufgabewoche2bestellsysteminspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FoodAndBeverageProduct implements Product {

    private String name;
    private final String id = UUID.randomUUID().toString();

    private final int bestBefore = 5;
}