import DrinkSuggestion from "../components/DrinkSuggestion/DrinkSuggestion";
import DrinkReel from "../components/DrinkReel/DrinkReel";
import useDrink from "../hooks/useDrink";
import {NavLink} from "react-router-dom";
import logo from "./cocktails-logo-nobg.png";
import "./Home.css";

export default function Home(){

    const {drinks} = useDrink();

    return(
        <>
            <section>
                <NavLink to={"/search"}>Search</NavLink>
                <img className={"logo"} src={logo} alt={"Logo"} />
            </section>
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