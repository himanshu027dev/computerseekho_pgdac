import React from 'react';
import Maps from './maps';
import '../css/ContactUs.css'; // Import the CSS file for styling
import Header from './Header';

function ContactUs() {
  return (
    <div>
      <Header/>
    <div className="contact-us">
      
      <h1>Contact Us</h1>
      
      <div className="contact-details">
        <p>Address: 123 Main Street, Anytown, USA</p>
        <p>Phone: (123) 456-7890</p>
        <p>Email: contact@company.com</p>
      </div>
      <Maps />
    </div>
    </div>
  );
}

export default ContactUs;
