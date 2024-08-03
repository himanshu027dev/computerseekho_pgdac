import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from './js/Home';
import DAC from './js/DAC';
import DBDA from './js/DBDA';
import MSCIT from './js/MSCIT';
import ContactUs from './js/contactus';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
   
      <Route path="/" element={<App />} />
      <Route path="Home" element={<Home />} />
      <Route path="Contactus" element={<ContactUs />} />
      <Route path="/Services/DAC" element={<DAC/>} />
      <Route path="/Services/DBDA" element={<DBDA/>} />
      <Route path="/Services/MSCIT" element={<MSCIT/>} />
        
    </Routes>
  </BrowserRouter>

);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
