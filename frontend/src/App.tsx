import React from 'react';
import './App.css';
import DrinkGallery from "./components/DrinkGallery/DrinkGallery";
import useDrink from "./hooks/useDrink";

function App() {

const {drinks} = useDrink();


  return (
    <div className="App">
      <header className="App-header">
        <DrinkGallery drinks={drinks}/>
      </header>
    </div>
  );
}

export default App;
