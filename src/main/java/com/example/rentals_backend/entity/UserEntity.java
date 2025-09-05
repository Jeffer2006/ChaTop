package com.example.rentals_backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Id;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Schema(description = "The user entity.")
@Table(name = "users")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "The unique identifier of the user.")
	private Long id;

	@Column(nullable = false, unique = true, length = 255)
	@Schema(description = "The email address of the user.")
	private String email;

	@Column(nullable = false, length = 255)
	@Schema(description = "The name of the user.")
	private String name;

	@Column(nullable = false, length = 255)
	@Schema(description = "The password of the user.")
	private String password;

	@Column(name = "created_at")
	@Schema(description = "The created at of the user.")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	@Schema(description = "The updated at of the user.")
	private LocalDateTime updatedAt;

}
