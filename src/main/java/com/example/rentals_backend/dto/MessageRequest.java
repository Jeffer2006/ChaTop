package com.example.rentals_backend.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "Data Transfer Object (DTO) for representing message request.")
public class MessageRequest {
	@NotBlank(message = "Message content is required")
	@Schema(description = "The message content.")
	private String message;

	@NotNull(message = "User ID is required")
	@JsonProperty("user_id")
	@Schema(description = "The user id.")
	private Long userId;

	@NotNull(message = "Rental ID is required")
	@JsonProperty("rental_id")
	@Schema(description = "The rental id.")
	private Long rentalId;
}
