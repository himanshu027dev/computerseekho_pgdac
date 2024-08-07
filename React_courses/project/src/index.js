import React from 'react';
import ReactDOM from 'react-dom/client';
import 'bootstrap/dist/css/bootstrap.min.css';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Home from './js/Home';
import DAC from './js/DAC';
import DBDA from './js/DBDA';
import MSCIT from './js/MSCIT';
import ContactUs from './js/contactus';
import Courses from './js/components/Courses';
import Header from './js/components/Header';
// src/index.js or src/js/Home.js or other files
import 'bootstrap/dist/css/bootstrap.min.css';
import FANTASIA from './js/FANTASIA';


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(

 
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App />} />
      <Route path="Home" element={<Home />} />
      <Route path="Contactus" element={<ContactUs />} />
      <Route path="courses" element={< Header/>}/>
      <Route path="/Course/:course_name" element={<DAC/>} />
      <Route path="/Course/:course_name" element={<DBDA/>} />
      <Route path="/Course/:course_name" element={<MSCIT/>} />
      <Route path="/Course/:course_name" element={<FANTASIA/>} />
        
    </Routes>
  </BrowserRouter>
  
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
