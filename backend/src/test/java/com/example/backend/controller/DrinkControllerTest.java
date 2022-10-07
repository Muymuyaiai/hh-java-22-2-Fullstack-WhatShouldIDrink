package com.example.backend.controller;

import com.example.backend.model.Drink;
import com.example.backend.repositiory.DrinkRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DrinkControllerTest {

   /* @Autowired
    MockMvc mockMvc;

    @Autowired
    private DrinkRepo drinkRepo;

    @DirtiesContext
    @Test
    void getAllDrinks() throws Exception {
            //GIVEN
            Drink drink1 = new Drink();
            drinkRepo.save(drink1);

            //WHEN &THEN
            mockMvc.perform(get("/api/drinks"))
                    .andExpect(status().is(200))
                    .andExpect(content().string("""
                        [{"idDrink":"1","strDrink":"A1","alcoholic":"Alcoholic","strDrinkThumb":"https://www.thecocktaildb.com/images/media/drink/yqwuwu1441248116.jpg"}]"""));
    }*/
}