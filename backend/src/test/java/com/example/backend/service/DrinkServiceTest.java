package com.example.backend.service;

import com.example.backend.model.Drink;
import com.example.backend.repositiory.DrinkRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class DrinkServiceTest {

    DrinkRepo drinkRepo = mock(DrinkRepo.class);
    IdService idService = mock(IdService.class);
    DrinkService drinkService = new DrinkService(drinkRepo, idService);

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

    @Test
    void addDrink() {
        //GIVEN
        Drink dummyDrink = new Drink("", "", "", "");
        Drink expectedDrink = new Drink("1", "", "", "");

        when(drinkRepo.save(dummyDrink)).thenReturn(
                Drink.builder()
                        .idDrink("1")
                        .strDrink(dummyDrink.getStrDrink())
                        .alcoholic(dummyDrink.getAlcoholic())
                        .strDrinkThumb(dummyDrink.getStrDrinkThumb())
                        .build());
        when(idService.generateID()).thenReturn("1");

        //WHEN
        Drink actual = drinkService.addNewDrink(dummyDrink);

        //THEN
        assertEquals(expectedDrink, actual);
    }


}