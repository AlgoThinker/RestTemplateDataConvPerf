package com.optimisation.CalleeMicroservice.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class EmployeeDto {

	@NonNull String id;
	@NonNull String firstName;
	@NonNull String lastName;
	String designation;

}
