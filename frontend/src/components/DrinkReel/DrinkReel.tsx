import Drink from "../../model/Drink";
import DrinkComponent from "../DrinkComponent/DrinkComponent";
import "./FilterReelStyled.css";

type DrinkGalleryProps = {
    drinks : Drink[];
    filter: string;
    category: string;

}



export default function DrinkReel(props:DrinkGalleryProps){

    return (
    <section className={"gallery"}>
        {props.drinks
            .filter((drink)=> drink.strCategory.includes(props.filter))
            .map((drink)=>
            <DrinkComponent key={drink.idDrink} drink={drink} />)
        }
    </section>
        )
}