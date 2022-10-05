package com.example.backend.controller;


import com.example.backend.model.Drink;
import com.example.backend.model.DrinkDTO;
import com.example.backend.service.DrinkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drinks")
public class DrinkController {

    public final DrinkService drinkService;

    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping
    public List<Drink> getAllDrinks() {return drinkService.getAllDrinks();}

    @PostMapping
    public Drink addNewDrink(@RequestBody DrinkDTO drink) {return drinkService.addNewDrink(drink);}
}
