package com.example.demo.Entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity


public class BookingEntity {
	
	@GeneratedValue
	@Id
	private Long bookingId;
	private Long userId;
	private Long serviceId;
	private LocalDateTime bookingDate;
	private double bookingAmount;
	private String serviceStatus;
	private String modeOfPayment;
	
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getServiceStatus() {
		return serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	public double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public BookingEntity(Long bookingId, Long userId, Long serviceId, LocalDateTime bookingDate, double bookingAmount,
			String serviceStatus) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.serviceId = serviceId;
		this.bookingDate = bookingDate;
		this.bookingAmount = bookingAmount;
		this.serviceStatus = serviceStatus;
		this.modeOfPayment = modeOfPayment;
	}
	public BookingEntity() {
		super();
	}
	
	
	
	
}
