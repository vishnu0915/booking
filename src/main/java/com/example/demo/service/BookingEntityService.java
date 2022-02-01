package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.BookingEntity;

public interface BookingEntityService {

	List<BookingEntity> getAllBooking();

	BookingEntity bookService(BookingEntity booking);

}
