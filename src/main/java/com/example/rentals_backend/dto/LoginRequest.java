package com.example.rentals_backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Data Transfer Object (DTO) for representing login information.")
public class LoginRequest {

	@Schema(description = "The email address of the user.", example = "user@example.com")
	private String login;

	@Schema(description = "The password of the user.", example = "password")
	private String password;
}