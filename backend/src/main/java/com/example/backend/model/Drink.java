package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink {
    private String idDrink;
    private String strDrink;
    private boolean alcoholic;
    private String strDrinkThumb;
}
