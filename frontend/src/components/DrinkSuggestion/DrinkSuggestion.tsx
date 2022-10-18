import Drink from "../../model/Drink";
import './DrinkSuggestion.css';


type DrinkSuggestionProps = {
    drinks : Drink[];
}

export default function DrinkSuggestion(props:DrinkSuggestionProps){

    const date = new Date();
    const [day, hours, minutes] = [date.getDay(), date.getHours(), date.getMinutes()]
    const weekDay = ["monday","tuesday","wednesday","thursday","friday","saturday","sunday"]
    const shortWeekday =["m","t","w","t","f","s","s"]

    function filterDrinksByHours (drinks: Drink[]) {
        let filteredDrinks:Drink[];

        if (hours>5 && hours<11) {
            filteredDrinks = drinks.filter((drink) => drink.strCategory.toLowerCase().includes("coffee"));
        } else if (hours>10 && hours<16) {
            filteredDrinks = drinks.filter((drink) => drink.strCategory.toLowerCase().includes("ordinary"));
        } else if (hours>15 && hours<23) {
            filteredDrinks = drinks.filter((drink) => drink.strCategory.toLowerCase().includes("cocktail"));
        } else if (hours>23 || hours>1) {
            filteredDrinks = drinks.filter((drink) => drink.strCategory.toLowerCase().includes("party"));
        } else {
            filteredDrinks = drinks.filter((drink) => drink.strCategory.toLowerCase().includes("shots"));
        }
       return filteredDrinks;
    }

    function filterDrinksByDay (drinks: Drink[]) {
        return drinks.filter((drink) => drink.strDrink.toLowerCase().startsWith(shortWeekday[day-1]))
    }

    function randomDrink (drinks: Drink[]) {
        return drinks[Math.floor(Math.random()*drinks.length)]
    }

    const suggestedDrink:Drink = (randomDrink(filterDrinksByDay(filterDrinksByHours(props.drinks))));


    return (
        <section className="container"
                 style={{backgroundImage:'url('+suggestedDrink?.strDrinkThumb+')' }}>
            <div className="left-container">
            <h3>It's {weekDay[day-1]} {hours}:{minutes}</h3>
            <h3>We're suggesting you to drink</h3>
            <h1>{suggestedDrink?.strDrink}</h1>
            </div>
            <div className="middle-container">
            <h3>Ingredients</h3>
            <ul>
                {suggestedDrink?.strIngredient1 ? <li>{suggestedDrink.strIngredient1 + " = " + suggestedDrink.strMeasure1}</li>:''}
                {suggestedDrink?.strIngredient2 ? <li>{suggestedDrink.strIngredient2 + " = " + suggestedDrink.strMeasure2}</li>:''}
                {suggestedDrink?.strIngredient3 ? <li>{suggestedDrink.strIngredient3 + " = " + suggestedDrink.strMeasure3}</li>:''}
                {suggestedDrink?.strIngredient4 ? <li>{suggestedDrink.strIngredient4 + " = " + suggestedDrink.strMeasure4}</li>:''}
                {suggestedDrink?.strIngredient5 ? <li>{suggestedDrink.strIngredient5 + " = " + suggestedDrink.strMeasure5}</li>:''}
                {suggestedDrink?.strIngredient6 ? <li>{suggestedDrink.strIngredient6 + " = " + suggestedDrink.strMeasure6}</li>:''}
                {suggestedDrink?.strIngredient7 ? <li>{suggestedDrink.strIngredient7 + " = " + suggestedDrink.strMeasure7}</li>:''}
                {suggestedDrink?.strIngredient8 ? <li>{suggestedDrink.strIngredient8 + " = " + suggestedDrink.strMeasure8}</li>:''}
                {suggestedDrink?.strIngredient9 ? <li>{suggestedDrink.strIngredient9 + " = " + suggestedDrink.strMeasure9}</li>:''}
                {suggestedDrink?.strIngredient10 ? <li>{suggestedDrink.strIngredient10 + " = " + suggestedDrink.strMeasure10}</li>:''}
                {suggestedDrink?.strIngredient11 ? <li>{suggestedDrink.strIngredient11 + " = " + suggestedDrink.strMeasure11}</li>:''}
                {suggestedDrink?.strIngredient12 ? <li>{suggestedDrink.strIngredient12 + " = " + suggestedDrink.strMeasure12}</li>:''}
                {suggestedDrink?.strIngredient13 ? <li>{suggestedDrink.strIngredient13 + " = " + suggestedDrink.strMeasure13}</li>:''}
                {suggestedDrink?.strIngredient14 ? <li>{suggestedDrink.strIngredient14 + " = " + suggestedDrink.strMeasure14}</li>:''}
                {suggestedDrink?.strIngredient15 ? <li>{suggestedDrink.strIngredient15 + " = " + suggestedDrink.strMeasure15}</li>:''}
            </ul>
            <p>{suggestedDrink?.strInstructions}</p>
            </div>

        </section>

    )
}