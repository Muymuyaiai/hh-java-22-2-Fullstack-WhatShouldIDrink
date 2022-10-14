package com.example.backend.service;

import com.example.backend.model.Drink;
import com.example.backend.model.DrinkDTO;
import com.example.backend.repositiory.DrinkRepo;
import org.junit.jupiter.api.Test;

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
        Drink drink1 = new Drink("1","A1","Alcoholic", "https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","");
        Drink drink2 = new Drink("2","Big Red","Alcoholic", "https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","");

        List<Drink> drinkList = new ArrayList<>(List.of(drink1, drink2));
        when(drinkRepo.findAll()).thenReturn(drinkList);

        // WHEN
        List<Drink> actual = drinkService.getAllDrinks();

        // THEN
        List<Drink> expected = List.of(drink1, drink2);
        assertEquals(expected, actual);
    }

    @Test
    void addDrink() {
        //GIVEN
        /*Gleiche Schreibweise:
        DrinkDTO drinkDTO = new DrinkDTO("B52","Alcoholic","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","");
        Drink expected = new Drink("1","B52","Alcoholic","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","");*/

        DrinkDTO drinkDTO = DrinkDTO.builder()
                .strDrink("B52")
                        .strAlcoholic("Alcoholic")
                                .build();

        Drink expected = Drink.builder()
                .idDrink("1")
                .strDrink("B52")
                        .strAlcoholic("Alcoholic")
                                .build();


        //when(idService.generateID()).thenReturn("1");
        when(drinkRepo.save(any())).thenReturn(Drink.builder()
                .idDrink("1")
                .strDrink(drinkDTO.getStrDrink())
                .strAlcoholic(drinkDTO.getStrAlcoholic())
                .build());

        //WHEN
        Drink actual = drinkService.addNewDrink(drinkDTO);

        //THEN
        assertEquals(expected, actual);
    }

}