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

    public List<Drink> getAllDrinks() {return drinkRepo.findAll();}

    public Drink addNewDrink(DrinkDTO drink){
        Drink newDrink = Drink.builder()
                .idDrink(idService.generateID())
                .strDrink(drink.getStrDrink())
                .strAlcoholic(drink.getStrAlcoholic())
                .strDrinkThumb(drink.getStrDrinkThumb())
                .strCategory(drink.getStrCategory())
                .strInstructions(drink.getStrInstructions())
                .strIngredient1(drink.getStrIngredient1())
                .strIngredient2(drink.getStrIngredient2())
                .strIngredient3(drink.getStrIngredient3())
                .strIngredient4(drink.getStrIngredient4())
                .strIngredient5(drink.getStrIngredient5())
                .strIngredient6(drink.getStrIngredient6())
                .strIngredient7(drink.getStrIngredient7())
                .strIngredient8(drink.getStrIngredient8())
                .strIngredient9(drink.getStrIngredient9())
                .strIngredient10(drink.getStrIngredient10())
                .strIngredient11(drink.getStrIngredient11())
                .strIngredient12(drink.getStrIngredient12())
                .strIngredient13(drink.getStrIngredient13())
                .strIngredient14(drink.getStrIngredient14())
                .strIngredient15(drink.getStrIngredient15())
                .strMeasure1(drink.getStrMeasure1())
                .strMeasure2(drink.getStrMeasure2())
                .strMeasure3(drink.getStrMeasure3())
                .strMeasure4(drink.getStrMeasure4())
                .strMeasure5(drink.getStrMeasure5())
                .strMeasure6(drink.getStrMeasure6())
                .strMeasure7(drink.getStrMeasure7())
                .strMeasure8(drink.getStrMeasure8())
                .strMeasure9(drink.getStrMeasure9())
                .strMeasure10(drink.getStrMeasure10())
                .strMeasure11(drink.getStrMeasure11())
                .strMeasure12(drink.getStrMeasure12())
                .strMeasure13(drink.getStrMeasure13())
                .strMeasure14(drink.getStrMeasure14())
                .strMeasure15(drink.getStrMeasure15())
                .build();
        return drinkRepo.save(newDrink);
    }
}
