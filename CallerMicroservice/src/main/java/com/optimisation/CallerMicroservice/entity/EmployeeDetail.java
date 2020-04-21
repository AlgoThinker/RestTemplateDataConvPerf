package com.optimisation.CallerMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetail {

	@NonNull String id;
	@NonNull String firstName;
	@NonNull String lastName;
	String designation;

}
