import Drink from "../../model/Drink";


type DrinkComponentProps = {
    drink : Drink
}


export default function DrinkComponent(props:DrinkComponentProps){
    return(
        <article>
            <h2>{props.drink.strDrink}</h2>
            <img src={props.drink.strDrinkThumb} alt={props.drink.strDrink}/>
        </article>
    )
}