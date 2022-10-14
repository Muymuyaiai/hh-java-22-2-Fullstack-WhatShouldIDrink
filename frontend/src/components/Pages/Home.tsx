import DrinkSuggestion from "../DrikSuggestion/DrinkSuggestion";
import DrinkReel from "../DrinkReel/DrinkReel";
import useDrink from "../../hooks/useDrink";


export default function Home(){

    const {drinks} = useDrink();

    return(
        <>
            <DrinkSuggestion drinks={drinks}/>
            <h2>All drinks</h2>
            <DrinkReel drinks={drinks} filter={""} category={""}/>
            <h2>All shots</h2>
            <DrinkReel drinks={drinks} filter={"Shot"} category={""}/>
            <h2>All cocktails</h2>
            <DrinkReel drinks={drinks} filter={"Cocktail"} category={""}/>
            <h2>All ordinary drinks</h2>
            <DrinkReel drinks={drinks} filter={"Ordinary"} category={""}/>
            <h2>All punches</h2>
            <DrinkReel drinks={drinks} filter={"Punch"} category={""}/>

        </>
    )
}