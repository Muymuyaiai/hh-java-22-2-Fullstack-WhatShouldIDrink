import Drink from "../../model/Drink";
import "./DetailStyled.css";
import {useState} from "react";

type DetailProps ={
    drink : Drink;
}

export default function Details(props:DetailProps){


    return(
        <article className={"detailCard"} >
            <section className={"detailHeader"}>
            <h2>{props.drink.strDrink}</h2>
            </section>
            <section className={"drinkValueWrapper"}>
            <img className={"drinkImg"} src={props.drink.strDrinkThumb}/>
             <div>
                 <p className={`${props.drink.strAlcoholic === "Alcoholic" ? "red":"green"}`}>{props.drink.strAlcoholic}</p>
            <p>Category:{" "+props.drink.strCategory}</p>
                 <h3>Ingredients</h3>
                 <ul>
                     {props.drink.strIngredient1 ? <li>{props.drink.strIngredient1 + " = " + props.drink.strMeasure1}</li>:''}
                     {props.drink.strIngredient2 ? <li>{props.drink.strIngredient2 + " = " + props.drink.strMeasure2}</li>:''}
                     {props.drink.strIngredient3 ? <li>{props.drink.strIngredient3 + " = " + props.drink.strMeasure3}</li>:''}
                     {props.drink.strIngredient4 ? <li>{props.drink.strIngredient4 + " = " + props.drink.strMeasure4}</li>:''}
                     {props.drink.strIngredient5 ? <li>{props.drink.strIngredient5 + " = " + props.drink.strMeasure5}</li>:''}
                     {props.drink.strIngredient6 ? <li>{props.drink.strIngredient6 + " = " + props.drink.strMeasure6}</li>:''}
                     {props.drink.strIngredient7 ? <li>{props.drink.strIngredient7 + " = " + props.drink.strMeasure7}</li>:''}
                     {props.drink.strIngredient8 ? <li>{props.drink.strIngredient8 + " = " + props.drink.strMeasure8}</li>:''}
                     {props.drink.strIngredient9 ? <li>{props.drink.strIngredient9 + " = " + props.drink.strMeasure9}</li>:''}
                     {props.drink.strIngredient10 ? <li>{props.drink.strIngredient10 + " = " + props.drink.strMeasure10}</li>:''}
                     {props.drink.strIngredient11 ? <li>{props.drink.strIngredient11 + " = " + props.drink.strMeasure11}</li>:''}
                     {props.drink.strIngredient12 ? <li>{props.drink.strIngredient12 + " = " + props.drink.strMeasure12}</li>:''}
                     {props.drink.strIngredient13 ? <li>{props.drink.strIngredient13 + " = " + props.drink.strMeasure13}</li>:''}
                     {props.drink.strIngredient14 ? <li>{props.drink.strIngredient14 + " = " + props.drink.strMeasure14}</li>:''}
                     {props.drink.strIngredient15 ? <li>{props.drink.strIngredient15 + " = " + props.drink.strMeasure15}</li>:''}
                 </ul>
             </div>
            </section>
        </article>
    )
}