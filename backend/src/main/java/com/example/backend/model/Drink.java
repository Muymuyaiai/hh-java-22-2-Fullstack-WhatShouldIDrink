package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("cocktails")

public class Drink {
    @Id
    private String idDrink;

    private String strDrink;
    private String alcoholic;
    private String strDrinkThumb;
}
