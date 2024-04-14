package com.java.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.model.Booking;
import com.java.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository repository;
	
	public List<Booking> getAll() {
		return repository.findAll();
	}
	
	public Booking getById(long id) {
		return repository.findById(id).get();
	}
	
	public void save(Booking booking) {
		repository.save(booking);
	}
	
	public List<Booking> getByUserId(long id) {
		List<Booking> bookings = repository.findAll();
		List<Booking> newBookings = new ArrayList<Booking>();
		
		for (Booking booking : bookings) {
			if(booking.getUser_id() == id) {
				newBookings.add(booking);
			}
		}
		
		return newBookings;
	}
	
}
