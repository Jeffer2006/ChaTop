package com.example.rentals_backend.dto;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Data Transfer Object (DTO) for representing message response.")
public class MessageResponse {

	@Schema(description = "The unique identifier of the message.")
	private Long id;

	@Schema(description = "The content of the message.")
	private String message;

	@Schema(description = "The timestamp indicating when the message was created.")
	private LocalDateTime createdAt;

	@Schema(description = "The unique identifier of the user who sent the message.")
	private Long userId;

	@Schema(description = "The unique identifier of the rental property that the message is about.")
	private Long rentalId;
}
