package com.example.rentals_backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rentals_backend.entity.RentalEntity;

public interface RentalRepository extends JpaRepository<RentalEntity, Long> {
	
	List<RentalEntity> findAll();
	
	Optional<RentalEntity> findById(Long id);

}
