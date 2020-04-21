package com.optimisation.CalleeMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {

	@NonNull String id;
	@NonNull String firstName;
	@NonNull String lastName;
	String designation;

}
