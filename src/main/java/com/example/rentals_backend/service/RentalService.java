package com.example.rentals_backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.rentals_backend.dto.RentalResponse;
import com.example.rentals_backend.entity.RentalEntity;
import com.example.rentals_backend.repository.RentalRepository;
import com.example.rentals_backend.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RentalService {

	private final RentalRepository rentalRepository;
	private final UserRepository userRepository;

	public RentalService(RentalRepository rentalRepository, UserRepository userRepository) {
		this.userRepository = userRepository;
		this.rentalRepository = rentalRepository;
	}

	public List<RentalResponse> getAllRentals() {
		List<RentalEntity> rentals = rentalRepository.findAll();
		List<RentalResponse> rentalResponses = new ArrayList<>();
		for (RentalEntity rental : rentals) {
			rentalResponses.add(
					new RentalResponse(
							rental.getId(),
							rental.getName(),
							rental.getSurface(),
							rental.getPrice(),
							rental.getPicture(),
							rental.getDescription()));
		}
		return rentalResponses;
	}

	public RentalResponse getRentalById(Long id) {
		RentalEntity rental = rentalRepository.findById(id).orElse(null);

		return new RentalResponse(
				rental.getId(),
				rental.getName(),
				rental.getSurface(),
				rental.getPrice(),
				rental.getPicture(),
				rental.getDescription());

	}

	public RentalEntity updateRental(
			Long id,
			String name,
			int surface,
			int price,
			MultipartFile picture,
			String description) {

		RentalEntity rental = rentalRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Rental not found with id " + id));

		rental.setName(name);
		rental.setSurface(surface);
		rental.setPrice(price);
		rental.setDescription(description);

		if (picture != null && !picture.isEmpty()) {
			rental.setPicture("uploads/" + picture.getOriginalFilename());
		}

		return rentalRepository.save(rental); 
	}

	public RentalEntity createRental(
			String email,
			String name,
			int surface,
			int price,
			MultipartFile picture,
			String description) {
		RentalEntity rental = new RentalEntity();
		rental.setOwner(userRepository.findByEmail(email).orElse(null));
		rental.setName(name);
		rental.setSurface(surface);
		rental.setPrice(price);
		rental.setDescription(description);
		rental.setPicture("uploads/" + picture.getOriginalFilename());

		return rentalRepository.save(rental);
	}

}
