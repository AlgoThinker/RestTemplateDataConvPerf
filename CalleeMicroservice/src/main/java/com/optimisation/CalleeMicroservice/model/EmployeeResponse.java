package com.optimisation.CalleeMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class EmployeeResponse {

	@NonNull String id;
	@NonNull String firstName;
	@NonNull String lastName;
	String designation;
	
}