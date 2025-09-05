package com.example.rentals_backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Data Transfer Object (DTO) for representing signup response.")
public class SignupResponse {
	@Schema(description = "The unique identifier of the user.", example = "0")
	private Long id;

	@Schema(description = "The email address of the user.", example = "user@example.com")
	private String email;

	@Schema(description = "The name of the user.", example = "User Example")
	private String name;
}
