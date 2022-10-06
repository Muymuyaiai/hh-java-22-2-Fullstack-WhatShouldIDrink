import Drink from "../../model/Drink";
import DrinkComponent from "../DrinkComponent/DrinkComponent";
import "./DrinkGalleryStyled.css";

type DrinkGalleryProps = {
    drinks : Drink[];

}



export default function DrinkGallery(props:DrinkGalleryProps){

    const filtered = props.drinks.filter(drink => {
        return drink.strAlcoholic === "Alcoholic";
    });

    return (
    <section className={"gallery"}>
        {props.drinks
            .map((drink)=>
            <DrinkComponent key={drink.idDrink} drink={drink} />)
        }
    </section>
        )
}