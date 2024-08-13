import React from 'react';
import { Container, Row, Col, Carousel } from 'react-bootstrap';
import '../css/CampusLife.css'; // Import your custom CSS

function CampusLife() {
  return (
    <Container fluid className="p-5 bg-light">
      <h1 className="text-center mb-5">Campus Life</h1>

      {/* Carousel Section */}
      <Carousel className="mb-5">
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="img/campuslife/img1.jpg"
            alt="Campus Events"
            style={{ maxHeight: '400px', objectFit: 'cover' }} // Adjust size
          />
          <Carousel.Caption>
            <h3>State-of-Facilities</h3>
            <p>Enhancing your learning experience with modern facilities.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="img/campuslife/img4.jpg"
            alt="Campus Facilities"
            style={{ maxHeight: '400px', objectFit: 'cover' }} // Adjust size
          />
          <Carousel.Caption>
            <h3>Vibrant Campus Events</h3>
            <p>Experience the excitement of campus life through various events and activities.</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="img/campuslife/img11.jpg"
            alt="Student Community"
            style={{ maxHeight: '400px', objectFit: 'cover' }} // Adjust size
          />
          <Carousel.Caption>
            <h3>Diverse Student Community</h3>
            <p>Join a vibrant and diverse student body from around the world.</p>
          </Carousel.Caption>
        </Carousel.Item>
      </Carousel>

      {/* Information Section */}
      <Row className="mt-5">
        <Col>
          <h2 className="text-center">Why Our Campus?</h2>
          <p className="text-center">
            Our campus offers a rich experience with a blend of academic excellence and social engagement. Join us and be a part of a thriving community.
          </p>
        </Col>
      </Row>
    </Container>
  );
}

export default CampusLife;
