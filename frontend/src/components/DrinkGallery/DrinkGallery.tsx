import Drink from "../../model/Drink";
import DrinkComponent from "../DrinkComponent/DrinkComponent";

type DrinkGalleryProps = {
    drinks : Drink[];
}

export default function DrinkGallery(props:DrinkGalleryProps){
    return (
    <section>
        {props.drinks.map((drink)=> <DrinkComponent key={drink.idDrink} drink={drink} />) }
    </section>
        )
}