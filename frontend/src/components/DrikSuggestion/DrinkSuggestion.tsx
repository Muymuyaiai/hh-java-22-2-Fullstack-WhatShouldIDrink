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
        <section className="container"style={{backgroundImage:'url('+suggestedDrink?.strDrinkThumb+')' }}>

            <h3>It's {weekDay[day-1]} {hours}:{minutes}</h3>
            <h3>We're suggesting you to drink</h3>
            <h1>{suggestedDrink?.strDrink}</h1>

        </section>
    )
}