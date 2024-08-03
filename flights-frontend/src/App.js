import React, { useState } from 'react';
import Notification from './components/Notifications';
import FlightUpdates from "./components/FlightUpdates";

const BASE_URL = 'https://hackuser15-i-flights-status-application-440c-app-url.apps.arolab37nonprod.goindigo.in/';
const App = () => {
  const [flightNumber, setFlightNumber] = useState('');
  const [flightStatus, setFlightStatus] = useState(null);

  const handleInputChange = (event) => {
    setFlightNumber(event.target.value);
  };

  const handleButtonClick = () => {
    // Replace 'API_URL' with the actual API endpoint
    fetch(BASE_URL+`/api/flights/flightNumber=${flightNumber}`)
      .then(response => response.json())
      .then(data => {
        setFlightStatus(data);
        // Trigger notification if needed
        console.log('Flight status:', data);
      })
      .catch(error => {
        console.error('Error fetching flight status:', error);
      });
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
      {flightStatus && <FlightUpdates flightStatus={flightStatus} />}
      <Notification />
    </div>
  );
};

export default App;
