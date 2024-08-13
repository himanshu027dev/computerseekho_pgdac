package com.example.entities;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import com.example.entities.*;

@Entity
@Table
public class Payment {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int PaymentId;
	  
	  private String checkorUIDno;
	  
	   public String getCheckorUIDno() {
		return checkorUIDno;
	}
	public void setCheckorUIDno(String checkorUIDno) {
		this.checkorUIDno = checkorUIDno;
	}
	private  String PaymenType;
	   private Date date;
	   
	@OneToOne
	@JoinColumn(name = "cid", referencedColumnName = "courseId")
	Courses course;
	    
	private double Amount;
	   
	public int getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}
	public String getPaymenType() {
		return PaymenType;
	}
	public void setPaymenType(String paymenType) {
		PaymenType = paymenType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	   
	   
	  
//	  CREATE TABLE Payment (
//			    payment_id INT PRIMARY KEY auto_increment,
//			    payment_typeID INT,
//			    payment_date DATE,
//			    student_id INT,
//			    course_id INT,
//			    batch_id INT,
//			    amount DECIMAL(10, 2),
//			    FOREIGN KEY (payment_typeID) REFERENCES Payment_Type_Master(payment_typeID),
//			    FOREIGN KEY (student_id) REFERENCES Student_Master(student_id),
//			    FOREIGN KEY (batch_id) REFERENCES Batch_Master(batch_id)
//			);
}