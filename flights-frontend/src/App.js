import React, { useState } from 'react';

import Notification from './components/Notifications';
import FlightUpdates from "./components/FlightUpdates";

const App = () => {
  const [flightNumber, setFlightNumber] = useState('');

  const handleInputChange = (event) => {
    setFlightNumber(event.target.value);
  };

  const handleButtonClick = () => {
    //trigger notification
  };

  return (
      <div>
        <h1>Flight Status and Notifications</h1>
        <div>
          <input
              type="text"
              placeholder="Enter flight Number"
              value={flightNumber}
              onChange={handleInputChange}
          />
          <button onClick={handleButtonClick}>Check Flight Status</button>
        </div>
        <FlightUpdates flightNumber={flightNumber} />
        <Notification />
      </div>
  );
};

export default App;