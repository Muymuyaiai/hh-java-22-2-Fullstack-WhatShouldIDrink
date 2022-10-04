package com.example.backend.repositiory;

import com.example.backend.model.Drink;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DrinkRepo {
    Map<String, Drink> drinks = new HashMap<>(
            Map.of(
                    "1", new Drink("1","A1", true,"https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg"),
                    "2", new Drink("2","Big Red", true,"https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg"),
                    "3", new Drink("3","ACID", true,"https://www.thecocktaildb.com/images/media/drink/xuxpxt1479209317.jpg"),
                    "4", new Drink("4","Apello", false,"https://www.thecocktaildb.com/images/media/drink/uptxtv1468876415.jpg")
            )
    );

    public List<Drink> getAllDrinks() {return new ArrayList<>(drinks.values());}


}
