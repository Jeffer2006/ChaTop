package com.example.rentals_backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Data Transfer Object (DTO) for representing signup information.")
public class SignupRequest {

	@Schema(description = "The email address of the user.", example = "user@example.com")
	private String email;

	@Schema(description = "The name of the user.", example = "User Example")
	private String name;

	@Schema(description = "The password of the user.", example = "password")
	private String password;
}
