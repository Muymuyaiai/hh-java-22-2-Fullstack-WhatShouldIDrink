import React from 'react';
import './App.css';
import useDrink from "./hooks/useDrink";
import {HashRouter, Route, Routes} from "react-router-dom";
import SearchForDrinks from "./Pages/SearchForDrinks";
import Home from "./Pages/Home";

function App() {

    const {drinks} = useDrink();


    return (
        <div className="App">
            <header className="App-header">
                <HashRouter>
                    <Routes>
                        <Route path={"/"} element={<Home/>}/>
                        <Route path={"/search"} element={<SearchForDrinks drink={drinks}/>}/>
                    </Routes>
                </HashRouter>
            </header>
        </div>
    );
}

export default App;
