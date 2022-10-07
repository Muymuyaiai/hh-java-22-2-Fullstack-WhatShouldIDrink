package com.example.backend.service;

import com.example.backend.model.Drink;
import com.example.backend.model.DrinkDTO;
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

    /*@Test
    void getAllDrinks_ShouldReturnAllDrinks(){

        // GIVEN

        Drink drink1 = new Drink("1","A1","alcoholic", "https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg");
        Drink drink2 = new Drink("2","Big Red","alcoholic", "https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg");

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
        DrinkDTO dummyDrinkDTO = new DrinkDTO( "", "", "");
        Drink dummyDrink = new Drink("1", "", "", "");

        when(drinkRepo.save(Drink.builder()
                .idDrink("1")
                .strDrink(dummyDrinkDTO.getStrDrink())
                .strAlcoholic(dummyDrinkDTO.getAlcoholic())
                .strDrinkThumb(dummyDrinkDTO.getStrDrinkThumb())
                .build()))
                .thenReturn(dummyDrink);

        when(idService.generateID()).thenReturn("1");

        //WHEN
        Drink actual = drinkService.addNewDrink(dummyDrinkDTO);

        //THEN
        assertEquals(dummyDrink, actual);
    }
*/

}