import React from 'react';
import './App.css';
import useDrink from "./hooks/useDrink";
import DrinkReel from "./components/DrinkReel/DrinkReel";

function App() {

const {drinks} = useDrink();


  return (
    <div className="App">
      <header className="App-header">
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
      </header>
    </div>
  );
}

export default App;
