import React, { useState, useEffect } from 'react';
import './RecruiterPage.css';
/*state in React refers to the internal data storage of a component that can change
 over time. It allows components to manage and update their data, triggering re-renders to reflect the changes in the user interface. */
const RecruiterPage = () => {
  const [logos, setLogos] = useState([]);//usestate returns array of 2 element 1st variable that stores current state
                                          // 2nd element is function that ll have logic to pass data to 1st eleement 
                                          // in this case , 1st element is array as we  useState([]) so usestate function is initialize logos ll act as array

  useEffect(() => {       /*The useEffect hook is used to perform side effects in functional components. This can include data 
                            fetching, DOM manipulation, or setting up subscriptions.
                        */
    const fetchLogos = async () => {
      try {
        const response = await fetch('http://localhost:8080/api/logos', {
          method: 'GET',
          credentials: 'include', // Add this line
          headers: {
            'Content-Type': 'application/json'
          }
        });
        if (response.ok) {
          const data = await response.json(); //await ll pause the execution of fetchlogos function until promize is resolved
          setLogos(data);
        } else {
          console.error('Error fetching logos:', response.status);
        }
      } catch (error) {
        console.error('Error fetching logos:', error);
      }
    };

    fetchLogos();
  }, []);

  return (
    <div>
      <h1 style={{  textAlign: 'center'}}>Major Recruiters</h1> 
      <div className="logos-container">
        {logos.map((logo) => (
          <img className="image" key={logo.id} src={logo.url} alt={logo.name} />
        ))}
      </div>
    </div>
  );
}

export default RecruiterPage;
