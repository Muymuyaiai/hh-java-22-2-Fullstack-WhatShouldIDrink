import {useEffect, useState} from "react";
import axios from "axios";


export default function useDrink() {

    const [drinks, setDrinks] = useState([]);

    useEffect(() => {
        getDrinks()
    },[])

    const getDrinks = () => {
        axios.get("/api/drinks/")
            .then((response) => {return response.data
            })
            .then((drinks) => {setDrinks(drinks)
            })
            .catch(error => {console.error(error)})
    }

    return(
        {drinks, getDrinks}
    )
}