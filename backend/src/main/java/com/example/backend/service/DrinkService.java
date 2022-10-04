package com.example.backend.service;

import com.example.backend.model.Drink;
import com.example.backend.repositiory.DrinkRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    private final DrinkRepo drinkRepo;

    public DrinkService(DrinkRepo drinkRepo) {
        this.drinkRepo = drinkRepo;
    }

    public List<Drink> getAllDrinks() {return drinkRepo.getAllDrinks();};
}
