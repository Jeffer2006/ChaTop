package com.example.rentals_backend.entity;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Schema(description = "The rental entity.")
@Table(name = "rentals")
public class RentalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "The unique identifier of the rental.")
	private Long id;

	@Column(length = 255)
	@Schema(description = "The name of the rental property.")
	private String name;

	@Column
	@Schema(description = "The surface area of the rental property.")
	private int surface;

	@Column
	@Schema(description = "The price of the rental property.")
	private double price;

	@Column(length = 255)
	@Schema(description = "The picture URL of the rental property.")
	private String picture;

	@Column(columnDefinition = "TEXT")
	@Schema(description = "The description of the rental property.")
	private String description;

	@ManyToOne
	@JoinColumn(name = "owner_id", nullable = false)
	@Schema(description = "The unique identifier of the owner of the rental property.")
	private UserEntity owner;

	@Column(name = "created_at")
	@Schema(description = "The timestamp indicating when the rental property was created.")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@Schema(description = "The timestamp indicating when the rental property was last updated.")
	private LocalDateTime updatedAt;
}
