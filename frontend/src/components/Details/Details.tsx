import Drink from "../../model/Drink";
import "./DetailStyled.css";


type DetailProps ={
    drink : Drink;
}



export default function Details(props:DetailProps){


    function toIngLst (drink: Drink){
        let newIngLst = [];
        for (let i = 0; i<15; i++){
            !Object.values(drink)[i+6] || newIngLst.push(Object.values(drink)[i+6] + " : " + Object.values(drink)[i+21])
        }
        return newIngLst;
    }



    return(
        <article className={"detailCard"} >
            <section className={"detailHeader"}>
            <h2>{props.drink.strDrink}</h2>
            </section>
            <section className={"drinkValueWrapper"}>
            <img className={"drinkImg"} src={props.drink.strDrinkThumb} alt={props.drink.strDrink}/>
             <div>
                 <p className={`${props.drink.strAlcoholic === "Alcoholic" ? "red":"green"}`}>{props.drink.strAlcoholic}</p>
            <p>Category:{" "+props.drink.strCategory}</p>
                 <h3>Ingredients</h3>
                 <ul>
                 {toIngLst(props.drink).map((ingredient) => <li>{ingredient}</li>)}
                 </ul>
             </div>
            </section>
        </article>
    )
}