package com.example.backend.controller;

import com.example.backend.model.Drink;
import com.example.backend.repositiory.DrinkRepo;
import com.example.backend.service.IdService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DrinkControllerTest {

   @Autowired
    MockMvc mockMvc;

    @Autowired
    private DrinkRepo drinkRepo;

    @MockBean
    private IdService idService;

    @DirtiesContext
    @Test
    void getAllDrinksShouldReturnItemsFromDB() throws Exception {

        //GIVEN
        drinkRepo.save(new Drink("1","B52", "Alcoholic","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""));
        drinkRepo.save(new Drink("2","A1", "Alcoholic","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""));

        String expectedJSON = """
                [
                    {
                        "idDrink":"1",
                        "strDrink":"B52",
                        "strAlcoholic":"Alcoholic",
                        "strDrinkThumb":"",
                        "strCategory":"",
                        "strInstructions":"",
                        "strIngredient1":"",
                        "strIngredient2":"",
                        "strIngredient3":"",
                        "strIngredient4":"",
                        "strIngredient5":"",
                        "strIngredient6":"",
                        "strIngredient7":"",
                        "strIngredient8":"",
                        "strIngredient9":"",
                        "strIngredient10":"",
                        "strIngredient11":"",
                        "strIngredient12":"",
                        "strIngredient13":"",
                        "strIngredient14":"",
                        "strIngredient15":"",
                        "strMeasure1":"",
                        "strMeasure2":"",
                        "strMeasure3":"",
                        "strMeasure4":"",
                        "strMeasure5":"",
                        "strMeasure6":"",
                        "strMeasure7":"",
                        "strMeasure8":"",
                        "strMeasure9":"",
                        "strMeasure10":"",
                        "strMeasure11":"",
                        "strMeasure12":"",
                        "strMeasure13":"",
                        "strMeasure14":"",
                        "strMeasure15":""
                    },
                    {
                        "idDrink":"2",
                        "strDrink":"A1",
                        "strAlcoholic":"Alcoholic",
                        "strDrinkThumb":"",
                        "strCategory":"",
                        "strInstructions":"",
                        "strIngredient1":"",
                        "strIngredient2":"",
                        "strIngredient3":"",
                        "strIngredient4":"",
                        "strIngredient5":"",
                        "strIngredient6":"",
                        "strIngredient7":"",
                        "strIngredient8":"",
                        "strIngredient9":"",
                        "strIngredient10":"",
                        "strIngredient11":"",
                        "strIngredient12":"",
                        "strIngredient13":"",
                        "strIngredient14":"",
                        "strIngredient15":"",
                        "strMeasure1":"",
                        "strMeasure2":"",
                        "strMeasure3":"",
                        "strMeasure4":"",
                        "strMeasure5":"",
                        "strMeasure6":"",
                        "strMeasure7":"",
                        "strMeasure8":"",
                        "strMeasure9":"",
                        "strMeasure10":"",
                        "strMeasure11":"",
                        "strMeasure12":"",
                        "strMeasure13":"",
                        "strMeasure14":"",
                        "strMeasure15":""
                    }
                ]
                """;
        //WHEN+THEN
        mockMvc.perform(get("/api/drinks"))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJSON));
    }

    @DirtiesContext
    @Test
    void addDrink() throws Exception {

        //GIVEN
        when(idService.generateID()).thenReturn("1");

        String requestBody = """
                {
                        "strDrink":"A1",
                        "strAlcoholic":"Alcoholic",
                        "strDrinkThumb":"",
                        "strCategory":"",
                        "strInstructions":"",
                        "strIngredient1":"",
                        "strIngredient2":"",
                        "strIngredient3":"",
                        "strIngredient4":"",
                        "strIngredient5":"",
                        "strIngredient6":"",
                        "strIngredient7":"",
                        "strIngredient8":"",
                        "strIngredient9":"",
                        "strIngredient10":"",
                        "strIngredient11":"",
                        "strIngredient12":"",
                        "strIngredient13":"",
                        "strIngredient14":"",
                        "strIngredient15":"",
                        "strMeasure1":"",
                        "strMeasure2":"",
                        "strMeasure3":"",
                        "strMeasure4":"",
                        "strMeasure5":"",
                        "strMeasure6":"",
                        "strMeasure7":"",
                        "strMeasure8":"",
                        "strMeasure9":"",
                        "strMeasure10":"",
                        "strMeasure11":"",
                        "strMeasure12":"",
                        "strMeasure13":"",
                        "strMeasure14":"",
                        "strMeasure15":""
                }
                """;

        String expectedJSON = """
                {
                        "idDrink":"1",
                        "strDrink":"A1",
                        "strAlcoholic":"Alcoholic",
                        "strDrinkThumb":"",
                        "strCategory":"",
                        "strInstructions":"",
                        "strIngredient1":"",
                        "strIngredient2":"",
                        "strIngredient3":"",
                        "strIngredient4":"",
                        "strIngredient5":"",
                        "strIngredient6":"",
                        "strIngredient7":"",
                        "strIngredient8":"",
                        "strIngredient9":"",
                        "strIngredient10":"",
                        "strIngredient11":"",
                        "strIngredient12":"",
                        "strIngredient13":"",
                        "strIngredient14":"",
                        "strIngredient15":"",
                        "strMeasure1":"",
                        "strMeasure2":"",
                        "strMeasure3":"",
                        "strMeasure4":"",
                        "strMeasure5":"",
                        "strMeasure6":"",
                        "strMeasure7":"",
                        "strMeasure8":"",
                        "strMeasure9":"",
                        "strMeasure10":"",
                        "strMeasure11":"",
                        "strMeasure12":"",
                        "strMeasure13":"",
                        "strMeasure14":"",
                        "strMeasure15":""
                }
                """;

        //WHEN+THEN
        mockMvc.perform(
                        post("/api/drinks")
                                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                                .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJSON));

    }


}