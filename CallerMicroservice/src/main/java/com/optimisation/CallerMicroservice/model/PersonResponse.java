package com.optimisation.CallerMicroservice.model;

import com.optimisation.CallerMicroservice.entity.EmployeeDetail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
public class PersonResponse {
	@NonNull String id;
	String name;
	EmployeeDetail employeeDetail;
	String age;
}
