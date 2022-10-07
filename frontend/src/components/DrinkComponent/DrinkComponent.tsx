import Drink from "../../model/Drink";
import "./DrinkStyled.css";


type DrinkComponentProps = {
    drink : Drink
}


export default function DrinkComponent(props:DrinkComponentProps){
    return(
        <article className={"drink"}>
            <h2 className={"drinkname"}>{props.drink.strDrink}</h2>
            <img className={"drinkpic"} src={props.drink.strDrinkThumb} alt={props.drink.strDrink}/>
        </article>
    )
}