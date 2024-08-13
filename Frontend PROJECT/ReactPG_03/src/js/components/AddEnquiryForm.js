import React, { useState } from 'react';
import './css/AddEnquiry.css';
import { useNavigate } from 'react-router-dom';

function AddEnquiryForm({ onSubmit, onCancel }) {
  const [enquirerName, setEnquirerName] = useState('');
  const [studentName, setStudentName] = useState('');
  const [address, setAddress] = useState('');
  const [mobile, setMobile] = useState('');
  const [alternateMobile, setAlternateMobile] = useState('');
  const [emailId, setEmailId] = useState('');
  const [enquiryDate, setEnquiryDate] = useState('');
  const [enquirerQuery, setEnquirerQuery] = useState('');
  const [isActive, setIsActive] = useState(true);
  const [courseId, setCourseId] = useState('');
  const [staffId, setStaffId] = useState('');
  const Navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();
    const newEnquiry = {
      enquirerName,
      studentName,
      address,
      mobile: parseInt(mobile),
      alternateMobile: parseInt(alternateMobile),
      emailId,
      enquiryDate,
      enquirerQuery,
      isActive,
      course: { courseId },
      staff: { staffId },
    };
  
    try {
      const response = await fetch('http://localhost:8080/api/pta/Add', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          'Authorization': `Bearer ${sessionStorage.getItem('jwt')}`,
        },
        body: JSON.stringify(newEnquiry),
      });
  
      // Check if the response is JSON
      const contentType = response.headers.get('Content-Type');
      let result;
      if (contentType && contentType.includes('application/json')) {
        result = await response.json();
      } else {
        result = await response.text();  // Handle non-JSON responses as text
      }
  
      if (!response.ok) {
        throw new Error(result);
      }
  
      console.log('Enquiry added successfully:', result);
      onSubmit(newEnquiry);
    } catch (error) {
      console.error('Error adding enquiry:', error.message);
    }
  };
  
  const handleCancel=()=>{
    Navigate('/admin')
  }

  return (
    <div className="add-enquiry">
      <h2>Add Enquiry</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="enquirerName">Enquirer Name</label>
          <input
            type="text"
            id="enquirerName"
            value={enquirerName}
            onChange={(e) => setEnquirerName(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="studentName">Student Name</label>
          <input
            type="text"
            id="studentName"
            value={studentName}
            onChange={(e) => setStudentName(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="address">Address</label>
          <input
            type="text"
            id="address"
            value={address}
            onChange={(e) => setAddress(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="mobile">Mobile</label>
          <input
            type="text"
            id="mobile"
            value={mobile}
            onChange={(e) => setMobile(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="alternateMobile">Alternate Mobile</label>
          <input
            type="text"
            id="alternateMobile"
            value={alternateMobile}
            onChange={(e) => setAlternateMobile(e.target.value)}
          />
        </div>
        <div className="form-group">
          <label htmlFor="emailId">Email ID</label>
          <input
            type="email"
            id="emailId"
            value={emailId}
            onChange={(e) => setEmailId(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="enquiryDate">Enquiry Date</label>
          <input
            type="date"
            id="enquiryDate"
            value={enquiryDate}
            onChange={(e) => setEnquiryDate(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="enquirerQuery">Enquirer Query</label>
          <textarea
            id="enquirerQuery"
            value={enquirerQuery}
            onChange={(e) => setEnquirerQuery(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="courseId">Course ID</label>
          <input
            type="text"
            id="courseId"
            value={courseId}
            onChange={(e) => setCourseId(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="staffId">Staff ID</label>
          <input
            type="text"
            id="staffId"
            value={staffId}
            onChange={(e) => setStaffId(e.target.value)}
            required
          />
        </div>
        <div className="form-group">
          <label htmlFor="isActive">Is Active</label>
          <input
            type="checkbox"
            id="isActive"
            checked={isActive}
            onChange={(e) => setIsActive(e.target.checked)}
          />
        </div>
        <div className="form-buttons">
          <button type="submit" className="submit-button">Submit</button>
          <button type="button" className="cancel-button" onClick={handleCancel}>Cancel</button>
        </div>
      </form>
    </div>
  );
}

export default AddEnquiryForm;
