import Drink from "../../model/Drink";
import "./DrinkStyled.css";
import {useState} from "react";
import Details from "../Details/Details";



type DrinkComponentProps = {
    drink : Drink
}


export default function DrinkComponent(props:DrinkComponentProps){


    const [details, setDetails] = useState(false);


    return(
        <section >
        <article className={"drink"}>
            <h2 className={"drinkname"}>{props.drink.strDrink}</h2>
            <img className={"drinkpic"} src={props.drink.strDrinkThumb}
                 alt={props.drink.strDrink}
                 onClick={()=>{setDetails(!details)}}/>
        </article>
            {details && <div className={"shadow"} onClick={()=>setDetails(!details)}><Details drink={props.drink}/></div>}
        </section>
    )
}