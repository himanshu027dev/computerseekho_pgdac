import React, { useState } from 'react';
import "./signup.css"; 
import { Link } from 'react-router-dom';

const Signup = () => {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: '',
  });
  const [confirmPassword, setConfirmPassword] = useState('');
  const [errors, setErrors] = useState({});
  const [successMessage, setSuccessMessage] = useState('');
  const [isLogin, setIsLogin] = useState(false);

  const handleChange = (e) => {
    const { id, value } = e.target;
    if (id === 'confirmPassword') {
      setConfirmPassword(value);
    } else {
      setFormData({
        ...formData,
        [id]: value
      });
    }
  };

  const validate = () => {
    const newErrors = {};
    
    if (!formData.name) newErrors.name = 'Name is required';
    if (!formData.email) {
      newErrors.email = 'Email is required';
    } else if (!/\S+@\S+\.\S+/.test(formData.email)) {
      newErrors.email = 'Email address is invalid';
    }
    if (!formData.password) newErrors.password = 'Password is required';
    if (!confirmPassword) newErrors.confirmPassword = 'Confirm password is required';
    if (formData.password !== confirmPassword) {
      newErrors.confirmPassword = 'Passwords do not match';
    }
    
    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (validate()) {
      try {
        console.log('FormData Object:', formData);
        console.log('Stringified FormData:', JSON.stringify(formData));
  
        const response = await fetch('http://localhost:8080/api/admin', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify(formData)
        });
  
        // Handle the response...
      } catch (error) {
        console.error('Fetch Error:', error);
        setErrors({ form: 'An error occurred. Please try again later.' });
      }
    }
  };
  
  
  

  return (
    <div className="addUser">
      <h1>Sign Up</h1>
      <form className="addUserForm" onSubmit={handleSubmit}>
        <div className="formField">
          <label htmlFor="name">Name:</label>
          <input 
            type="text" 
            id="name" 
            autoComplete="off" 
            placeholder="Enter your name" 
            value={formData.name}
            onChange={handleChange}
          />
          {errors.name && <span className="error">{errors.name}</span>}
        </div>
        <div className="formField">
          <label htmlFor="email">Email:</label>
          <input 
            type="email" 
            id="email" 
            autoComplete="off" 
            placeholder="Enter your email" 
            value={formData.email}
            onChange={handleChange}
          />
          {errors.email && <span className="error">{errors.email}</span>}
        </div>
        <div className="formField">
          <label htmlFor="password">Password:</label>
          <input 
            type="password" 
            id="password" 
            autoComplete="off" 
            placeholder="Enter your password" 
            value={formData.password}
            onChange={handleChange}
          />
          {errors.password && <span className="error">{errors.password}</span>}
        </div>
        <div className="formField">
          <label htmlFor="confirmPassword">Confirm Password:</label>
          <input 
            type="password" 
            id="confirmPassword" 
            autoComplete="off" 
            placeholder="Confirm your password" 
            value={confirmPassword}
            onChange={handleChange}
          />
          {errors.confirmPassword && <span className="error">{errors.confirmPassword}</span>}
        </div>
        {errors.form && <span className="error">{errors.form}</span>}
        {successMessage && <span className="success">{successMessage}</span>}
        <button type="submit" className="btn btn-success">Sign Up</button>
      </form>
      <div className="login">
        <p>Already have an account? <Link to="/login">Login</Link></p>
      </div>
    </div>
  );
}

export default Signup;
