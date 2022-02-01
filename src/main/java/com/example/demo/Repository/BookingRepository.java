package com.example.demo.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.BookingEntity;



/**
 * 
 * @author nalpriya
 *
 */

@Repository("bookingRepository")
public interface BookingRepository extends JpaRepository<BookingEntity,Long>{
	
	
}
