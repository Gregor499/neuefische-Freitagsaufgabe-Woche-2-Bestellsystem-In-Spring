package com.github.gregor499.neuefischefreitagsaufgabewoche2bestellsysteminspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NonFoodProduct implements Product{

    private String name;
    private final String id = UUID.randomUUID().toString();

    private final boolean dishwasherSafe = true;
    }