package com.example.rentals_backend.entity;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Schema(description = "The message entity.")
@Table(name = "messages")
public class MessageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(description = "The unique identifier of the message.")
	private Long id;

	@Column(nullable = false, name = "user_id")
	@Schema(description = "The sender id of the message.")
	private Long userId;

	@Column(nullable = false, name = "rental_id")
	@Schema(description = "The rental id of the message.")
	private Long rentalId;

	@Column(nullable = false, length = 2000)
	@Schema(description = "The content of the message.")
	private String message;

	@Column(nullable = false, name = "created_at")
	@Schema(description = "The created at of the message.")
	private LocalDateTime createdAt;

	@Column(nullable = false, name = "updated_at")
	@Schema(description = "The updated at of the message.")
	private LocalDateTime updatedAt;
}
