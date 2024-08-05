import React, { useState } from 'react';
import { Form, Button, Card } from 'react-bootstrap';
import { useNavigate } from 'react-router-dom';

const EnquiryCard = () => {
  const [formData, setFormData] = useState({ enqname: '', course: '', equiry: '' });
  const courses = ['CDAC', 'DBDA', 'MSCIT']; // Hardcoded course options
  let navigate = useNavigate();

  const handleChange = (event) => {
    const { name, value } = event.target;
    setFormData((prevValues) => ({ ...prevValues, [name]: value }));
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    // Handle form submission
    console.log('Form submitted:', formData);

    // Example of making a POST request
    let demo = JSON.stringify(formData);
    fetch("http://localhost:8080/api/getintouch", {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: demo
    }).then(r => { console.log(r) });

    // Reset form fields
    setFormData({ enqname: '', course: '', equiry: '' });

    // Navigate to another page if needed
    navigate('/home');
  };

  return (
    <Card style={{ width: '40rem', margin: 'auto', marginTop: '2rem', height: '30rem' }}>
      <Card.Body>
        <Card.Title>Enquiry Form</Card.Title>
        <Form onSubmit={handleSubmit}>
          <Form.Group controlId="formName">
            <Form.Label>Name</Form.Label>
            <Form.Control
              type="text"
              name="enqname"
              placeholder="Enter your name"
              value={formData.enqname}
              onChange={handleChange}
            />
          </Form.Group>

          <Form.Group controlId="formCourse">
            <Form.Label>Course</Form.Label>
            <Form.Control
              as="select"
              name="course"
              value={formData.course}
              onChange={handleChange}
            >
              <option>Select a course</option>
              {courses.map((course, index) => (
                <option key={index} value={course}>
                  {course}
                </option>
              ))}
            </Form.Control>
          </Form.Group>

          <Form.Group controlId="formEnquiry">
            <Form.Label>Enquiry</Form.Label>
            <Form.Control
              as="textarea"
              name="equiry"
              rows={3}
              placeholder="Enter your enquiry"
              value={formData.equiry}
              onChange={handleChange}
            />
          </Form.Group>

          <Button style={{ marginTop: '2rem' }} variant="primary" type="submit" className="w-100">
            Submit
          </Button>
        </Form>
      </Card.Body>
    </Card>
  );
};

export default EnquiryCard;
