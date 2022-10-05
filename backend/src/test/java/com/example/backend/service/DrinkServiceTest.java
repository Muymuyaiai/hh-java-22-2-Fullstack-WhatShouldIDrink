package com.example.backend.service;

import com.example.backend.model.Drink;
import com.example.backend.repositiory.DrinkRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class DrinkServiceTest {

    DrinkRepo drinkRepo = mock(DrinkRepo.class);
    DrinkService drinkService = new DrinkService(drinkRepo);

    @Test
    void getAllDrinks_ShouldReturnAllDrinks(){

        // GIVEN

        Drink drink1 = new Drink("1","A1","Alcoholic", "https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg");
        Drink drink2 = new Drink("2","Big Red","Alcoholic", "https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg");

        List<Drink> drinkList = new ArrayList<>(List.of(drink1, drink2));
        when(drinkRepo.findAll()).thenReturn(drinkList);

        // When
        List<Drink> actual = drinkService.getAllDrinks();

        // Then
        List<Drink> expected = List.of(drink1, drink2);
        assertEquals(expected, actual);
    }


}