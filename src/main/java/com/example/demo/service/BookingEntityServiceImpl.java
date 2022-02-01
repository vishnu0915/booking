package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.BookingEntity;
import com.example.demo.Repository.BookingRepository;

@Service("bookingService")
public class BookingEntityServiceImpl implements BookingEntityService {
@Autowired
private BookingRepository bookingRepository;

@Override
public List<BookingEntity> getAllBooking() {
	return bookingRepository.findAll();
	
}

@Override
public BookingEntity bookService(BookingEntity booking) {
	booking.setBookingDate(LocalDateTime.now());
	return bookingRepository.save(booking);


}
}
