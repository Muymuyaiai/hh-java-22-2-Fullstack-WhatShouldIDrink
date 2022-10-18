import Drink from "../model/Drink";
import {useState} from "react";
import DrinkComponent from "../components/DrinkComponent/DrinkComponent";
import "./SearchForDrinks.css"

type DrinkComponentProps = {
    drink: Drink [];
}

export default function SearchForDrinks(props: DrinkComponentProps) {

    const [inputToSearch, setInput] = useState("");

    const filteredDrinks = props.drink.filter(drink => drink.strDrink.toLowerCase().includes(inputToSearch.toLowerCase()));

    return (
        <div className="background">
        <section className="search-section">
            <h1>Search for drinks</h1>
            <div className={"search-bar"}>
                <input onChange={(event) => setInput(event.target.value)}/>
            </div>

            <div className={"drinks"}>
                {filteredDrinks.length === 0 ? <h1>No drink found</h1>
                    : filteredDrinks
                        .map((drink) =>
                            <div className={"drink-component"}><DrinkComponent drink={drink}/></div>)}
            </div>
        </section>
        </div>

    )
}