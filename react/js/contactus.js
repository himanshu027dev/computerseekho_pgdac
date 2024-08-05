import React from 'react';
import Maps from './maps';
import '../css/ContactUs.css'; // Import the CSS file for styling
import Header from './Header';
import EnquiryCard from './enquiryCard';

function ContactUs() {
  return (
    <div>
      <Header/>
      <div className="contact-us container">
        <h1>Contact Us</h1>
        
        <div className='origin' >
          <h1>Our Origin</h1>
          <p>We are a part of Upanagar Shikshan Mandal (USM), a pioneering educational trust in the western</p>
          <p>suburbs of Mumbai. Commencing in 1956, USM has blossomed into 14 educational institutes that </p>
          <p>impart quality education from primary school to Post-Graduate courses.</p>
        </div>
        
        <div className='contactdetails'>
          <p>Address: 123 Main Street, Anytown, USA</p>
          <p>Phone: (123) 456-7890</p>
          <p>Email: contact@company.com</p>
        </div>
        
        <div className="row">
          <div className="col-md-6">
            <Maps />
          </div>
          <div className="col-md-6">
            <EnquiryCard />
          </div>
        </div>
      </div>
    </div>
  );
}

export default ContactUs;
