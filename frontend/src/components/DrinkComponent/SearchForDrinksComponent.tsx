import Drink from "../../model/Drink";
import {useState} from "react";
import DrinkComponent from "./DrinkComponent";


type DrinkComponentProps = {
    drink: Drink [];
}

export default function SearchForDrinks(props: DrinkComponentProps) {

    const [inputToSearch, setInput] = useState("");

    const filteredDrinks = props.drink.filter(drink => drink.strDrink.toLowerCase().includes(inputToSearch.toLowerCase()));

    return (
        <section>
            <div className={"search-bar"}>
                <input onChange={(event) => setInput(event.target.value)}/>
            </div>

            <div className={"drinks"}>
                {filteredDrinks.length === 0 ? <h1>No drink found. Maybe you are a little too drunk? </h1>
                    : filteredDrinks
                        .map((drink) =>
                            <div className={"drink-component"}><DrinkComponent drink={drink}/></div>)}
            </div>
        </section>

    )
}