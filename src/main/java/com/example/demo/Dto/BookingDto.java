package com.example.demo.Dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookingDto {
	
	@NotNull
	private long bookingId;
	
	private LocalDateTime bookingDate;
	
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Size(min=7,max=60)
	private String modeOfPayment;
	
	
	
	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}


	@NotNull
	private double bookingAmount;
	
	@NotNull
	private String serviceStatus;
	
	public double getBookingAmount() {
		return bookingAmount;
	}

	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

		public String getMadeOfPayment() {
		return modeOfPayment;
	}


	public void setMadeOfPayment(String madeOfPayment) {
		this.modeOfPayment = madeOfPayment;
	}
	

	
}
