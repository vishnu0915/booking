package com.example.demo.Mapper;

import com.example.demo.Dto.BookingDto;
import com.example.demo.Entity.BookingEntity;

public class BookingMapper {
	
	public static BookingEntity dtoToEntity(BookingDto pd) {
		
		BookingEntity entity=new BookingEntity();
		entity.setBookingId(pd.getBookingId());
		entity.setBookingDate(pd.getBookingDate());
		entity.setBookingAmount(pd.getBookingAmount());
		entity.setModeOfPayment(pd.getModeOfPayment());
		entity.setServiceStatus(pd.getServiceStatus());
		return entity;
		
		
		
	}

}
