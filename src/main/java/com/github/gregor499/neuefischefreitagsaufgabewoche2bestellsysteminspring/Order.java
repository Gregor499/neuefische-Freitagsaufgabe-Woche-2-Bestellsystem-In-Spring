package com.github.gregor499.neuefischefreitagsaufgabewoche2bestellsysteminspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private final String id = UUID.randomUUID().toString();;
    private List<Product> orderedProducts;
}