package com.example.services;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;



//import com.vita.repositoty.InvoiceRepository;
import com.example.entities.Enquiry;
import com.example.repositories.EnquiryRepository;
import com.example.services.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private EnquiryRepository repository;


	@Autowired
//    private InvoiceRepository invoiceRepository;

	@Value("${spring.mail.username}")
	private String fromEmailId;

	@Override
	public String enquiryEmail(Enquiry enq) {
        String toEmailId = enq.getEnqEmail();
		Enquiry user = repository.findByEmail(toEmailId);
		if (user == null) {
			return "User not found for email: " + toEmailId;
		}

		String emailBody = user.getEnquiry() + "\n\nUser name: " + user.getEnqName() + "\ncourse: " + user.getCourse();

		SimpleMailMessage smm = new SimpleMailMessage();
		smm.setFrom(fromEmailId);
		smm.setTo(user.getEnqEmail());
		smm.setSubject(user.getCourse());
		smm.setText(emailBody);

		javaMailSender.send(smm);

		return "Email sent successfully";
	}

	
}
