// import React from 'react';
// import "./login.css"; 
// import { Link } from 'react-router-dom';

// const Login = () => {
//   return (
//     <div className="addUser">
//       <h1>Login</h1>
//       <form className="addUserForm">
//         <div className="inputGroup">
//           <label htmlFor="email">Email:</label>
//           <input type="email" id="email" autoComplete="off" placeholder="Enter your email" />
//         </div>

//         <div className="inputGroup">
//           <label htmlFor="password">Password:</label>
//           <input type="password" id="password" autoComplete="off" placeholder="Enter your password" />
//         </div>
        
//         <button type="submit" className="btn btn-primary">Sign In</button>
//       </form>
//       <div className="login">
//         <p>Don't have an account? <Link to="/signup">Sign Up</Link></p>
//       </div>
//     </div>
//   );
// }

// export default Login;

import React, { useState } from 'react';
import "./login.css"; 
import { Link } from 'react-router-dom';

const Login = () => {
  const [formData, setFormData] = useState({
    email: '',
    password: ''
  });

  const [errors, setErrors] = useState({});

  const handleChange = (e) => {
    const { id, value } = e.target;
    setFormData({
      ...formData,
      [id]: value
    });
  };

  const validate = () => {
    const newErrors = {};

    if (!formData.email) {
      newErrors.email = 'Email is required';
    } else if (!/\S+@\S+\.\S+/.test(formData.email)) {
      newErrors.email = 'Email address is invalid';
    }
    if (!formData.password) newErrors.password = 'Password is required';

    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validate()) {
      // Perform login logic
      console.log('Form data is valid:', formData);
    } else {
      console.log('Form data is invalid:', errors);
    }
  };

  return (
    <div className="addUser">
      <h1>Login</h1>
      <form className="addUserForm" onSubmit={handleSubmit}>
        <div className="inputGroup">
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

        <div className="inputGroup">
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
        
        <button type="submit" className="btn btn-primary">Sign In</button>
      </form>
      <div className="login">
        <p>Don't have an account? <Link to="/signup">Sign Up</Link></p>
      </div>
    </div>
  );
}

export default Login;

