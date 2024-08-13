//package com.example.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.DTO.RegistrationDTO;
//import com.example.entities.Batch;
//import com.example.entities.Courses;
//import com.example.entities.Payment;
//import com.example.entities.Student;
//import com.example.repositories.Batch_wise_placementRepository;
//import com.example.repositories.CourseRepository;
//import com.example.repositories.PaymentRepository;
//import com.example.repositories.StudentRepository;
//
//import jakarta.transaction.Transactional;
//
//@Service
//public class RegistrationServiceImpl {
//	
//
//	    @Autowired
//	    private StudentRepository studentRepository;
//
////	    @Autowired
////	    private PaymentRepository paymentRepository;
//
//	    @Autowired
//		CourseRepository courseRepository;
//
//
//	    @Autowired
//	    Batch_wise_placementRepository repo;
//	    
//	    @Autowired
//	    PaymentRepository  paymentRepository;
//
//	    @Transactional
//	    public void registerStudent(RegistrationDTO dto) {
//	        // Fetch Course based on courseName
//	        Courses course = courseRepository.findByCourseName(dto.getCourseName());
//	            
//
//	        // Fetch Batch based on batchName
//	        Batch batch = repo.findByBatchName(dto.getBatchName());
//	        
//	        
//	        
//
//	        // Create and save Student entity
//	        Student student = new Student();
//	        student.setStudentName(dto.getStudentName());
//	        student.setStudentGender(dto.getStudentGender());
//	        student.setAddress(dto.getAddress());
//	        student.setDob(dto.getDob());
//	        student.setStudentQualification(dto.getStudentQualification());
//	        student.setMobileNum(dto.getMobileNum());
////	        student.setStudentPhoto(dto.getStudentPhoto());
////	        student.setAlternateNum(dto.getAlternateNum());
//	        student.setCourse(course);  // Set course based on courseName
//	        student.setBatch(batch);    // Set batch based on batchName
//
//	        Student savedStudent = studentRepository.save(student);
//
//	        // Create and save Payment entity
//	        Payment payment = new Payment();
//	        payment.setPaymenType(dto.getPaymentType());
//	        payment.setDate(dto.getDate());
//	        payment.setAmount(dto.getAmount());
//	        payment.setCourse(course);  // Set course based on courseName
//
//	        paymentRepository.save(payment);
//	    }
//	}
//
//
