import React, { useState, useEffect } from 'react';

const TIMEOUT_NOTIFN_IN_MS = 5000;

const Notification = () => {
    const [notifications, setNotifications] = useState([]);

    useEffect(() => {
        //receiving notification
        const x_notifications = () => {
            setNotifications((prevNotifications) => [
                ...prevNotifications,
                //can use axios to fetch status from db
                { id: Date.now(), message: 'Flight delayed by X minutes' },
            ]);
        };

        const intervalId = setInterval(x_notifications, TIMEOUT_NOTIFN_IN_MS);
        return () => clearInterval(intervalId);
    }, []);


    return (
        <div>
            <h2>Notifications</h2>
            <ul>
                {notifications.map((notification) => (
                    <li key={notification.id}>{notification.message}</li>
                ))}
            </ul>
        </div>
    );
};

export default Notification;
