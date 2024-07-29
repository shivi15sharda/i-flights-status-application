import React, { useState, useEffect } from 'react';
import axios from 'axios';

const GET_FLIGHT_STATUS_URL = `/api/flights/`;

const FlightUpdates = ({ flightNumber }) => {
    const [res, setStatus] = useState(null);

    useEffect(() => {
        const fetchFlightStatus = async () => {
            try {
                //call REST API
                const response = await axios.get(GET_FLIGHT_STATUS_URL + `${flightNumber}`);
                setStatus(response.data);
            } catch (error) {
                console.error('Error while fetching flight status:', error);
            }
        };
        fetchFlightStatus().then(res => {
            console.log('Flight status fetched!' + JSON.stringify(res))
        });
    }, [flightNumber]);

    if (!res) { return <div>Loading...</div>; }

    return (
        <div>
            <h2>Flight Status for {flightNumber}</h2>
            <p>Status: {res.status}</p>
            <p>Gate: {res.gate}</p>
            <p>Delay: {res.delay}</p>
        </div>
    );
};

export default FlightUpdates;
