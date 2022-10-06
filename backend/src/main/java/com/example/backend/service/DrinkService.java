package com.example.backend.service;

import com.example.backend.model.Drink;
import com.example.backend.model.DrinkDTO;
import com.example.backend.repositiory.DrinkRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    private final DrinkRepo drinkRepo;

    private final IdService idService;

    public DrinkService(DrinkRepo drinkRepo, IdService idService) {
        this.drinkRepo = drinkRepo;
        this.idService = idService;
    }

    public List<Drink> getAllDrinks() {return drinkRepo.findAll();};

    public Drink addNewDrink(DrinkDTO drink){
        Drink newDrink = Drink.builder()
                .idDrink(idService.generateID())
                .strDrink(drink.getStrDrink())
                .strDrinkThumb(drink.getStrDrinkThumb())
                .strAlcoholic(drink.getStrAlcoholic())
                .build();
        return drinkRepo.save(newDrink);
    };
}
