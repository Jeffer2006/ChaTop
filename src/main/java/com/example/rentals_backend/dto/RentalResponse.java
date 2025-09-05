package com.example.rentals_backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Data Transfer Object (DTO) for representing rental response.")
public class RentalResponse {
	@Schema(description = "The unique identifier of the rental.")
	private Long id;

	@Schema(description = "The name of the rental.")
	private String name;

	@Schema(description = "The surface of the rental.")
	private int surface;

	@Schema(description = "The price of the rental.")
	private Double price;

	@Schema(description = "The picture of the rental.")
	private String picture;

	@Schema(description = "The description of the rental.")
	private String description;
}
